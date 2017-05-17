package com.vcredit.user.dao;

import com.vcredit.user.entity.UserRoleRel;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-04-18 11:38:09
 */
@Mapper
public interface UserRoleRelDao {
	/**
	 *保存
	 *
	 */
	public Integer  saveUserRoleRel(UserRoleRel entity);
	/**
	 *修改
	 *
	 */
	public Integer updateUserRoleRelById(UserRoleRel entity);
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	UserRoleRel selectUserRoleRelById(Object id);

	/**
	 * 删除用户角色关系
	 * @param userId
	 * @return
	 */
	Integer deleteUserRoleRelByUserId(Long userId);

	Integer selectUserRoleRelByUserId(Long userId);

	/**
	 * 删除用户角色关系
	 * @param roleId
	 * @return
	 */
	Integer deleteUserRoleRelByRoleId(Long roleId);
	
	Integer selectUserRoleRelByRoleId(Long roleId);
	
}
