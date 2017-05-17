package com.vcredit.menu.controller;


import com.vcredit.menu.service.RoleMenuRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-04-18 17:37:56
 */
@Controller
@RequestMapping(value="/rolemenurel")
public class RoleMenuRelController {
	 @Autowired
	private RoleMenuRelService roleMenuRelService;
	
	
}
