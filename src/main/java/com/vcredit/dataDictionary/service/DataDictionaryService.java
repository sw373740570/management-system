package com.vcredit.dataDictionary.service;

import com.vcredit.dataDictionary.entity.DataDictionary;
import com.vcredit.common.util.Page;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-03 15:40:36
 * @see com.vcredit.service.DataDictionary
 */
public interface DataDictionaryService {
	/**
	 *保存
	 *
	 */
	public Integer  saveDataDictionary(DataDictionary entity) throws Exception;
	/**
	 *修改
	 *
	 */
	public Integer updateDataDictionaryById(DataDictionary entity) throws Exception;
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	DataDictionary selectDataDictionaryById(Object id);
	
	/**
	 *查询分页列表信息
	 *@param page
	 *@param queryMap
	 *@return page
	 */
	Page<DataDictionary> queryDataDictionaryPage(Page<DataDictionary> page, Map<String, Object> queryMap);
	
	/**
	 *删除
	 *
	 */
	Integer deleteDataDictionaryById(Object id);
	
		
}
