package com.vcredit.lrhWechatAttention.service;

import com.vcredit.lrhWechatAttention.entity.LrhWechatAttention;
import com.vcredit.common.util.Page;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 09:26:00
 * @see com.vcredit.service.LrhWechatAttention
 */
public interface LrhWechatAttentionService {
	/**
	 *保存
	 *
	 */
	public Integer  saveLrhWechatAttention(LrhWechatAttention entity) throws Exception;
	/**
	 *修改
	 *
	 */
	public Integer updateLrhWechatAttentionById(LrhWechatAttention entity) throws Exception;
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	LrhWechatAttention selectLrhWechatAttentionById(Object id);
	
	/**
	 *查询分页列表信息
	 *@param page
	 *@param queryMap
	 *@return page
	 */
	Page<LrhWechatAttention> queryLrhWechatAttentionPage(Page<LrhWechatAttention> page, Map<String, Object> queryMap);
	
	/**
	 *删除
	 *
	 */
	Integer deleteLrhWechatAttentionById(Object id);
	
		
}
