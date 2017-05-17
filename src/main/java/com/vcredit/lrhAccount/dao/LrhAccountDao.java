package com.vcredit.lrhAccount.dao;

import com.vcredit.lrhAccount.entity.LrhAccount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 10:46:13
 * @see com.vcredit.dao.LrhAccount
 */
@Mapper
public interface LrhAccountDao{
	/**
	 *保存
	 *
	 */
	public Integer  saveLrhAccount(LrhAccount entity) throws Exception;
	/**
	 *修改
	 *
	 */
	public Integer updateLrhAccountById(LrhAccount entity) throws Exception;
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	LrhAccount selectLrhAccountById(Object id);
	
	/**
	 * 根据Map查找
	 * @param queryMap
	 * @return list
	 * @throws Exception
	 */
	List<LrhAccount> selectLrhAccountListByMap(Map<String, Object> queryMap);
	
	/**
	 *删除
	 *
	 */
	Integer deleteLrhAccountById(Object id);

}
