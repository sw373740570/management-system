package com.vcredit.dataDictionary.dao;

import com.vcredit.dataDictionary.entity.DataDictionary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-03 15:40:36
 * @see com.vcredit.dao.DataDictionary
 */
@Mapper
public interface DataDictionaryDao{
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
	 * 根据Map查找
	 * @param queryMap
	 * @return list
	 * @throws Exception
	 */
	List<DataDictionary> selectDataDictionaryListByMap(Map<String, Object> queryMap);
	
	/**
	 *删除
	 *
	 */
	Integer deleteDataDictionaryById(Object id);
	
}
