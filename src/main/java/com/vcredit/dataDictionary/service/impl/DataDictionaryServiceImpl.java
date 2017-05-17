package com.vcredit.dataDictionary.service.impl;


import com.vcredit.dataDictionary.entity.DataDictionary;
import com.vcredit.dataDictionary.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vcredit.common.util.Page;
import java.util.List;
import java.util.Map;

import com.vcredit.dataDictionary.dao.DataDictionaryDao;



/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-03 15:40:36
 */
@Service("dataDictionaryService")
public class DataDictionaryServiceImpl implements DataDictionaryService {
	@Autowired
    private DataDictionaryDao dataDictionaryDao;
   
    @Override
	public Integer  saveDataDictionary(DataDictionary entity ) throws Exception{
	       return dataDictionaryDao.saveDataDictionary(entity);
	}

	
	@Override
    public Integer updateDataDictionaryById(DataDictionary entity ) throws Exception{
	return dataDictionaryDao.updateDataDictionaryById(entity);
    }
	
    @Override
	public DataDictionary selectDataDictionaryById(Object id){
	 return dataDictionaryDao.selectDataDictionaryById(id);
	}
	
	@Override
	public Page<DataDictionary> queryDataDictionaryPage(Page<DataDictionary> page, Map<String,Object> queryMap){
		
		List<DataDictionary> list = dataDictionaryDao.selectDataDictionaryListByMap(queryMap);
		page.setTotalCount(list.size());
		page.setResult(list);
		return page;
		
	}
	
	@Override
	public Integer deleteDataDictionaryById(Object id){
		return dataDictionaryDao.deleteDataDictionaryById(id);
	}


}
