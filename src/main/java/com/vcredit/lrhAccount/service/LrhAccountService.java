package com.vcredit.lrhAccount.service;

import com.alibaba.fastjson.JSONObject;
import com.vcredit.lrhAccount.entity.LrhAccount;
import com.vcredit.common.util.Page;
import com.vcredit.lrhWechatAttention.entity.LrhWechatAttention;

import java.util.List;
import java.util.Map;


/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 10:46:13
 * @see com.vcredit.service.LrhAccount
 */
public interface LrhAccountService {
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
	 *查询分页列表信息
	 *@param page
	 *@param queryMap
	 *@return page
	 */
	Page<LrhAccount> queryLrhAccountPage(Page<LrhAccount> page, Map<String, Object> queryMap);
	
	/**
	 *删除
	 *
	 */
	Integer deleteLrhAccountById(Object id);

	JSONObject getSaleInfo(String saleNo);
}
