package com.vcredit.lrhAccount.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.vcredit.common.util.HttpRequestUtil;
import com.vcredit.lrhAccount.entity.LrhAccount;
import com.vcredit.lrhAccount.service.LrhAccountService;
import com.vcredit.lrhWechatAttention.dao.LrhWechatAttentionDao;
import com.vcredit.lrhWechatAttention.entity.LrhWechatAttention;
import com.vcredit.lrhWechatAttention.service.LrhWechatAttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vcredit.common.util.Page;
import java.util.List;
import java.util.Map;

import com.vcredit.lrhAccount.dao.LrhAccountDao;
import org.springframework.web.client.RestTemplate;


/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 10:46:13
 * @see
 */
@Service("lrhAccountService")
public class LrhAccountServiceImpl implements LrhAccountService {
	@Autowired
    private LrhAccountDao lrhAccountDao;

	@Autowired
	private LrhWechatAttentionDao lrhWechatAttentionDao;

	private String beforeLoanUrl = "http://10.1.12.52/LRHService/LRHService/LRHLoan/";
   
    @Override
	public Integer  saveLrhAccount(LrhAccount entity ) throws Exception{
	       return lrhAccountDao.saveLrhAccount(entity);
	}

	
	@Override
    public Integer updateLrhAccountById(LrhAccount entity ) throws Exception{
	return lrhAccountDao.updateLrhAccountById(entity);
    }
	
    @Override
	public LrhAccount selectLrhAccountById(Object id){
	 return lrhAccountDao.selectLrhAccountById(id);
	}
	
	@Override
	public Page<LrhAccount> queryLrhAccountPage(Page<LrhAccount> page, Map<String,Object> queryMap){
		
		List<LrhAccount> list = lrhAccountDao.selectLrhAccountListByMap(queryMap);
		page.setTotalCount(list.size());
		page.setResult(list);
		return page;
		
	}
	
	@Override
	public Integer deleteLrhAccountById(Object id){
		return lrhAccountDao.deleteLrhAccountById(id);
	}

	@Override
	public JSONObject getSaleInfo(String saleNo) {
		JSONObject jsonObject = new JSONObject();
		JSONObject param  = new JSONObject();
		try{
			String saleId = lrhWechatAttentionDao.getSaleInfoBySaleNo(saleNo);
			param.put("SaleAgent",saleId);
			RestTemplate restTemplate = new RestTemplate();
			jsonObject = JSONObject.parseObject(HttpRequestUtil.doPost(beforeLoanUrl+"GetSalesInfoBySalesUserId",param.toJSONString()));
//			jsonObject = restTemplate.postForObject(beforeLoanUrl+"GetSalesInfoBySalesUserId", param, JSONObject.class);
			jsonObject.put("status","1");
		} catch (Exception e) {
			jsonObject.put("status","-1");
		}
		return jsonObject;
	}


}
