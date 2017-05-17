package com.vcredit.othersource.lrh.dao;

import com.vcredit.othersource.lrh.entity.UserDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDetailDao {

    public List<UserDetail> selectAll();
}