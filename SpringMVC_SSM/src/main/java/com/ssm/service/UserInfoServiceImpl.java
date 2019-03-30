package com.ssm.service;

import com.ssm.dao.IUserInfoDAO;
import com.ssm.entity.UserInfoEntity;

/**
 * @author 金海洋
 * @date 2019/3/30  -10:36
 */
public class UserInfoServiceImpl implements IUserInfoService{
	private IUserInfoDAO dao;

	public void add(UserInfoEntity info) {
		dao.add(info);
	}
	public IUserInfoDAO getDao() {
		return dao;
	}
	public void setDao(IUserInfoDAO dao) {
		this.dao = dao;
	}
}

