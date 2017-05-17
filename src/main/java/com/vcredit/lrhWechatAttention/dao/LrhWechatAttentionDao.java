package com.vcredit.lrhWechatAttention.dao;

import com.vcredit.lrhWechatAttention.entity.LrhWechatAttention;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 09:26:00
 * @see com.vcredit
 */
@Mapper
public interface LrhWechatAttentionDao{
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
	 * 根据Map查找
	 * @param queryMap
	 * @return list
	 * @throws Exception
	 */
	List<LrhWechatAttention> selectLrhWechatAttentionListByMap(Map<String, Object> queryMap);
	
	/**
	 *删除
	 *
	 */
	Integer deleteLrhWechatAttentionById(Object id);

	String getSaleInfoBySaleNo(String saleNo);

}
