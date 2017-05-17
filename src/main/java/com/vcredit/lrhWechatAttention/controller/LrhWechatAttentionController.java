package com.vcredit.lrhWechatAttention.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

import com.vcredit.lrhWechatAttention.entity.LrhWechatAttention;
import com.vcredit.lrhWechatAttention.service.LrhWechatAttentionService;
import com.vcredit.common.util.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;


/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 09:26:00
 * @see com.vcredit.web.LrhWechatAttention
 */
@Controller
@RequestMapping(value="/lrhwechatattention")
public class LrhWechatAttentionController {
	 @Autowired
	private LrhWechatAttentionService lrhWechatAttentionService;
	
	/**
	 * 列表主页面
	 *
	 * @return string
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String lrhWechatAttentionMain(Map<String, Object> map) {
		Page<LrhWechatAttention> page = new Page<LrhWechatAttention>(10);
		Map<String, Object> queryMap=new HashMap<String, Object>();
		//page = lrhWechatAttentionService.queryLrhWechatAttentionPage(page, queryMap);
		List<LrhWechatAttention> list = page.getResult();
		map.put("list", list);
		map.put("page", page);
		return "page/lrhWechatAttention/lrhWechatAttentionList";
	}
	
	/**
	 * 查询
	 *
	 * @return String
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String lrhWechatAttentionList(@ModelAttribute Page<LrhWechatAttention> page, Map<String, Object> map, @ModelAttribute LrhWechatAttention lrhWechatAttention) {		
		Map<String, Object> queryMap=new HashMap<String, Object>();
		queryMap.put("lrhWechatAttention",lrhWechatAttention);
		page = lrhWechatAttentionService.queryLrhWechatAttentionPage(page, queryMap);
		List<LrhWechatAttention> list = page.getResult();
		map.put("list", list);
		map.put("page", page);
		return "page/lrhWechatAttention/lrhWechatAttentionTable";
	}
	
	/**
	 * 进入新增页面
	 *
	 * @return String
	 */
	@RequestMapping(value = "/addPage", method = RequestMethod.GET)
	public String lrhWechatAttentionAddPage() {
		
		return "page/lrhWechatAttention/lrhWechatAttentionAdd";
	}
	
	/**
	 * 提交新增
	 *
	 * @param lrhWechatAttention
	 * @param request
	 * @return String
	 */
	@RequestMapping(value = "/lrhWechatAttentionAdd", method = RequestMethod.PUT, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String lrhWechatAttentionAdd(@ModelAttribute LrhWechatAttention lrhWechatAttention, HttpServletRequest request) throws Exception{
		String message="";
		Map<String, Object> result = new HashMap<String,Object>();
		
		int status = lrhWechatAttentionService.saveLrhWechatAttention(lrhWechatAttention);

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
	public String lrhWechatAttentionEditPage(Map<String, Object> map,@PathVariable String id) throws Exception{
		//获取实体基本信息
		LrhWechatAttention lrhWechatAttention = lrhWechatAttentionService.selectLrhWechatAttentionById(Long.valueOf(id));
		map.put("lrhWechatAttention", lrhWechatAttention);

		return "page/lrhWechatAttention/lrhWechatAttentionEdit";
	}
	
	/**
	 * 提交修改
	 *
	 * @param lrhWechatAttention
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/lrhWechatAttentionEdit", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String lrhWechatAttentionUpdate(LrhWechatAttention lrhWechatAttention, HttpServletRequest request) throws Exception{
		String message = "";
		Map<String, Object> result = new HashMap<String,Object>();
		
		int status = lrhWechatAttentionService.updateLrhWechatAttentionById(lrhWechatAttention);
		
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
	@RequestMapping(value = "/lrhWechatAttentionDelete/{id}", method = RequestMethod.DELETE, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String lrhWechatAttentionDelete(@PathVariable String id) {
		String message = "";
		Map<String, Object> result = new HashMap<String,Object>();
		
		int status = lrhWechatAttentionService.deleteLrhWechatAttentionById(Long.valueOf(id));
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
}
