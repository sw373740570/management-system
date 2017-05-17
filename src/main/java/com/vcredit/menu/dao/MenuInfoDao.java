package com.vcredit.menu.dao;


import com.vcredit.menu.entity.MenuInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-04-18 17:34:15
 */
@Mapper
public interface MenuInfoDao {
	/**
	 *保存
	 *
	 */
	public Integer  saveMenuInfo(MenuInfo entity);
	/**
	 *修改
	 *
	 */
	public Integer updateMenuInfoById(MenuInfo entity);
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	MenuInfo selectMenuInfoById(Object id) ;


	/**
	 * 根据userName查找用户角色菜单
	 * @param userName
	 * @return
	 */
	List<MenuInfo> selectMeanInfoList(String userName);

	List<MenuInfo> queryMenuInfoListByMap(Map<String, Object> qMap);

	public List<MenuInfo> selectParentMenuAllList();

	/**
	 * 删除菜单
	 * */
	Integer deleteMenuInfoById(Long menuId);

	Integer changeMenuStatus(Map<String, Object> qMap);

	MenuInfo queryMenuInfoListByEntity(MenuInfo entity);

	List<MenuInfo> selectAllMenuInfoList();

	List<MenuInfo> selectMeanInfoByRoleId(Long roleId);
}
