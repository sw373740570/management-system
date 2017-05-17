package com.vcredit.dataDictionary.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

import com.vcredit.dataDictionary.entity.DataDictionary;
import com.vcredit.dataDictionary.service.DataDictionaryService;
import com.vcredit.common.util.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;


/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-03 15:40:36
 */
@Controller
@RequestMapping(value="/datadictionary")
public class DataDictionaryController {
	 @Autowired
	private DataDictionaryService dataDictionaryService;
	
	/**
	 * 列表主页面
	 *
	 * @return string
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String dataDictionaryMain(Map<String, Object> map) {
		Page<DataDictionary> page = new Page<DataDictionary>(10);
		Map<String, Object> queryMap=new HashMap<String, Object>();
		page = dataDictionaryService.queryDataDictionaryPage(page, queryMap);
		List<DataDictionary> list = page.getResult();
		map.put("list", list);
		map.put("page", page);
		return "page/dataDictionary/dataDictionaryList";
	}
	
	/**
	 * 查询
	 *
	 * @return String
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String dataDictionaryList(@ModelAttribute Page<DataDictionary> page, Map<String, Object> map, @ModelAttribute DataDictionary dataDictionary) {		
		Map<String, Object> queryMap=new HashMap<String, Object>();
		queryMap.put("dataDictionary",dataDictionary);
		page = dataDictionaryService.queryDataDictionaryPage(page, queryMap);
		List<DataDictionary> list = page.getResult();
		map.put("list", list);
		map.put("page", page);
		return "page/dataDictionary/dataDictionaryTable";
	}
	
	/**
	 * 进入新增页面
	 *
	 * @return String
	 */
	@RequestMapping(value = "/addPage", method = RequestMethod.GET)
	public String dataDictionaryAddPage() {
		
		return "page/dataDictionary/dataDictionaryAdd";
	}
	
	/**
	 * 提交新增
	 *
	 * @param dataDictionary
	 * @param request
	 * @return String
	 */
	@RequestMapping(value = "/dataDictionaryAdd", method = RequestMethod.PUT, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String dataDictionaryAdd(@ModelAttribute DataDictionary dataDictionary, HttpServletRequest request) throws Exception{
		String message="";
		Map<String, Object> result = new HashMap<String,Object>();

		if("on".equals(dataDictionary.getIsEnable())){
			dataDictionary.setIsEnable("1");
		}else{
			dataDictionary.setIsEnable("0");
		}
		
		int status = dataDictionaryService.saveDataDictionary(dataDictionary);

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
	public String dataDictionaryEditPage(Map<String, Object> map,@PathVariable String id) throws Exception{
		//获取实体基本信息
		DataDictionary dataDictionary = dataDictionaryService.selectDataDictionaryById(Long.valueOf(id));
		map.put("dataDictionary", dataDictionary);

		return "page/dataDictionary/dataDictionaryEdit";
	}
	
	/**
	 * 提交修改
	 *
	 * @param dataDictionary
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/dataDictionaryEdit", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String dataDictionaryUpdate(DataDictionary dataDictionary, HttpServletRequest request) throws Exception{
		String message = "";
		Map<String, Object> result = new HashMap<String,Object>();

		if("on".equals(dataDictionary.getIsEnable())){
			dataDictionary.setIsEnable("1");
		}else{
			dataDictionary.setIsEnable("0");
		}
		
		int status = dataDictionaryService.updateDataDictionaryById(dataDictionary);
		
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
	@RequestMapping(value = "/dataDictionaryDelete/{id}", method = RequestMethod.DELETE, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String dataDictionaryDelete(@PathVariable String id) {
		String message = "";
		Map<String, Object> result = new HashMap<String,Object>();
		
		int status = dataDictionaryService.deleteDataDictionaryById(Long.valueOf(id));
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
