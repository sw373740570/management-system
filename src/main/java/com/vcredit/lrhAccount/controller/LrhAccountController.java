package com.vcredit.lrhAccount.controller;


import com.alibaba.fastjson.JSONObject;
import com.vcredit.lrhWechatAttention.entity.LrhWechatAttention;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

import com.vcredit.lrhAccount.entity.LrhAccount;
import com.vcredit.lrhAccount.service.LrhAccountService;
import com.vcredit.common.util.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;


/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 10:46:13
 * @see com.vcredit.web.LrhAccount
 */
@Controller
@RequestMapping(value="/lrhaccount")
public class LrhAccountController {
	 @Autowired
	private LrhAccountService lrhAccountService;
	
	/**
	 * 列表主页面
	 *
	 * @return string
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String lrhAccountMain(Map<String, Object> map) {
		Page<LrhAccount> page = new Page<LrhAccount>(10);
		Map<String, Object> queryMap=new HashMap<String, Object>();
		//page = lrhAccountService.queryLrhAccountPage(page, queryMap);
		List<LrhAccount> list = page.getResult();
		map.put("list", list);
		map.put("page", page);
		return "page/lrhAccount/lrhAccountList";
	}
	
	/**
	 * 查询
	 *
	 * @return String
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String lrhAccountList(@ModelAttribute Page<LrhAccount> page, Map<String, Object> map, @ModelAttribute LrhAccount lrhAccount) {		
		Map<String, Object> queryMap=new HashMap<String, Object>();
		queryMap.put("lrhAccount",lrhAccount);
		page = lrhAccountService.queryLrhAccountPage(page, queryMap);
		List<LrhAccount> list = page.getResult();
		map.put("list", list);
		map.put("page", page);
		return "page/lrhAccount/lrhAccountTable";
	}
	
	/**
	 * 进入新增页面
	 *
	 * @return String
	 */
	@RequestMapping(value = "/addPage", method = RequestMethod.GET)
	public String lrhAccountAddPage() {
		
		return "page/lrhAccount/lrhAccountAdd";
	}
	
	/**
	 * 提交新增
	 *
	 * @param lrhAccount
	 * @param request
	 * @return String
	 */
	@RequestMapping(value = "/lrhAccountAdd", method = RequestMethod.PUT, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String lrhAccountAdd(@ModelAttribute LrhAccount lrhAccount, HttpServletRequest request) throws Exception{
		String message="";
		Map<String, Object> result = new HashMap<String,Object>();
		
		int status = lrhAccountService.saveLrhAccount(lrhAccount);

		if(status==0){
			result.put("status",0);
			result.put("message","新增失败！");
		}else{
			result.put("status",1);
			result.put("message","新增成功！");
		}
		message = JSON.toJSONString(result);
		return message;
	}
	
	/**
	 * 进入修改页面
	 *
	 * @param id
	 * @return String
	 */
	@RequestMapping(value = "/editPage/{id}", method = RequestMethod.GET)
	public String lrhAccountEditPage(Map<String, Object> map,@PathVariable String id) throws Exception{
		//获取实体基本信息
		LrhAccount lrhAccount = lrhAccountService.selectLrhAccountById(id);
		map.put("lrhAccount", lrhAccount);

		return "page/lrhAccount/lrhAccountEdit";
	}
	
	/**
	 * 提交修改
	 *
	 * @param lrhAccount
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/lrhAccountEdit", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String lrhAccountUpdate(LrhAccount lrhAccount, HttpServletRequest request) throws Exception{
		String message = "";
		Map<String, Object> result = new HashMap<String,Object>();
		
		int status = lrhAccountService.updateLrhAccountById(lrhAccount);
		
		if(status==0){
			result.put("status",0);
			result.put("message","修改失败！");
		}else{
			result.put("status",1);
			result.put("message","修改成功！");
		}
		message = JSON.toJSONString(result);
		return message;
	}
	
	/**
	 * 删除
	 *
	 * @param id
	 * @return String
	 */
	@RequestMapping(value = "/lrhAccountDelete/{id}", method = RequestMethod.DELETE, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String lrhAccountDelete(@PathVariable String id) {
		String message = "";
		Map<String, Object> result = new HashMap<String,Object>();
		
		int status = lrhAccountService.deleteLrhAccountById(Long.valueOf(id));
		if(status==0){
			result.put("status",0);
			result.put("message","修改失败！");
		}else{
			result.put("status",1);
			result.put("message","删除成功！");
		}
		message = JSON.toJSONString(result);
		return message;
	}

	@RequestMapping(value = "/getSaleInfo/{saleNo}", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject getSaleInfo(@PathVariable String saleNo){
		return lrhAccountService.getSaleInfo(saleNo);
	}
}
