package com.vcredit.othersource.lrh.controller;


import com.vcredit.othersource.lrh.entity.UserDetail;
import com.vcredit.othersource.lrh.service.UserDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;


/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-04-18 17:34:15
 */
//@RestController
//@RequestMapping(value="/userdetail")
public class UserDetailController {
	 //@Autowired
	private UserDetailService userDetailService;

	/**
	 * 用户列表主页面
	 *
	 * @return
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String userMain(Map<String, Object> map) {
		List<UserDetail> list=userDetailService.selectAllUsers();
		return list.get(0).getName();
	}
	
}
