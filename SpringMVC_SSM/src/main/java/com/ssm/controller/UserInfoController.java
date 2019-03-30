package com.ssm.controller;

import com.ssm.entity.UserInfoEntity;
import com.ssm.service.IUserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 金海洋
 * @date 2019/3/30  -10:55
 */
@Controller
@RequestMapping("/hello")
public class UserInfoController   {
	private IUserInfoService service;


	public ModelAndView handleRequest(HttpServletRequest request,
									  HttpServletResponse response) throws Exception {



		String uname = request.getParameter("name");
		Integer uage = Integer.valueOf(request.getParameter("age"));

		UserInfoEntity info = new UserInfoEntity();
		info.setAge(uage);
		info.setName(uname);

		service.add(info);
		return new ModelAndView("/welcome.jsp");
	}

	public IUserInfoService getService() {
		return service;
	}

	public void setService(IUserInfoService service) {
		this.service = service;
	}
}