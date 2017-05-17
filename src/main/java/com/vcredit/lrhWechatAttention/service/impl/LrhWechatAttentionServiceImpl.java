package com.vcredit.lrhWechatAttention.service.impl;


import com.vcredit.lrhWechatAttention.entity.LrhWechatAttention;
import com.vcredit.lrhWechatAttention.service.LrhWechatAttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vcredit.common.util.Page;
import java.util.List;
import java.util.Map;

import com.vcredit.lrhWechatAttention.dao.LrhWechatAttentionDao;



/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 09:26:00
 * @see com.vcredit.service.impl.LrhWechatAttention
 */
@Service("lrhWechatAttentionService")
public class LrhWechatAttentionServiceImpl implements LrhWechatAttentionService {
	@Autowired
    private LrhWechatAttentionDao lrhWechatAttentionDao;
   
    @Override
	public Integer  saveLrhWechatAttention(LrhWechatAttention entity ) throws Exception{
	       return lrhWechatAttentionDao.saveLrhWechatAttention(entity);
	}

	
	@Override
    public Integer updateLrhWechatAttentionById(LrhWechatAttention entity ) throws Exception{
	return lrhWechatAttentionDao.updateLrhWechatAttentionById(entity);
    }
	
    @Override
	public LrhWechatAttention selectLrhWechatAttentionById(Object id){
	 return lrhWechatAttentionDao.selectLrhWechatAttentionById(id);
	}
	
	@Override
	public Page<LrhWechatAttention> queryLrhWechatAttentionPage(Page<LrhWechatAttention> page, Map<String,Object> queryMap){
		
		List<LrhWechatAttention> list = lrhWechatAttentionDao.selectLrhWechatAttentionListByMap(queryMap);
		page.setTotalCount(list.size());
		page.setResult(list);
		return page;
		
	}
	
	@Override
	public Integer deleteLrhWechatAttentionById(Object id){
		return lrhWechatAttentionDao.deleteLrhWechatAttentionById(id);
	}


}
