package com.vcredit.othersource.lrh.service.impl;

import com.vcredit.othersource.lrh.dao.UserDetailDao;
import com.vcredit.othersource.lrh.entity.UserDetail;
import com.vcredit.othersource.lrh.service.UserDetailService;

import java.util.List;

/**
 * Created by zhangzhizhong on 2017/4/20.
 */
//@Service
public class UserDetailServiceImpl implements UserDetailService {

    //@Autowired
    private UserDetailDao userDetailDao;

    @Override
    public List<UserDetail> selectAllUsers() {
        String xx="firstMysqlDatasource";
        return userDetailDao.selectAll();
    }
}
