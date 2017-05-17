package com.vcredit.lrhAccount.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.StringUtils;



/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 10:46:13
 * @see com.vcredit.entity.LrhAccount
 */

public class LrhAccount  implements Serializable{
	
	//columns START
	/**
	 * 账户编号
	 */
	private String accountId;
	/**
	 * 登录用户名
	 */
	private String loginName;
	/**
	 * 登录密码
	 */
	private String password;
	/**
	 * 帐号类型（01：客户，02销售）
	 */
	private String accountType;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 我的邀请码标识
	 */
	private String inviteCode;
	/**
	 * 帐号是否启用(1: 已启用，0: 未启用)
	 */
	private String isEnabled;
	/**
	 * 注册时间
	 */
	private Date registerTime;
	/**
	 * app渠道来源
	 */
	private String appChannel;
	/**
	 * 手机品牌型号
	 */
	private String brand;
	/**
	 * 注册设备唯一标识
	 */
	private String deviceId;
	/**
	 * 注册设备类型(android, ios)
	 */
	private String deviceType;
	//columns END 数据库字段结束

	/**
	 * 客户姓名
	 */
	private String customerName;

	/**
	 * 客户身份证号码
	 */
	private String customerIdcard;

	private String saleNo;

	/**
	 * VBS——销售所属团队名称
	 */
	private String vbsSaleTeamName;
	/**
	 * VBS——销售所属门店名称
	 */
	private String vbsSaleStoreName;

	/**
	 * VBS——销售所属城市
	 */
	private String vbsSaleCityName;

	/**
	 * VBS——销售姓名
	 */
	private String vbsSaleAgentName;

	public void setVbsSaleAgentName(String vbsSaleAgentName) {

		if(StringUtils.isNotBlank(vbsSaleAgentName)){
			vbsSaleAgentName=vbsSaleAgentName.trim();
		}
		this.vbsSaleAgentName = vbsSaleAgentName;
	}


	public String getVbsSaleAgentName() {
		return this.vbsSaleAgentName;
	}

	public void setVbsSaleCityName(String vbsSaleCityName) {

		if(StringUtils.isNotBlank(vbsSaleCityName)){
			vbsSaleCityName=vbsSaleCityName.trim();
		}
		this.vbsSaleCityName = vbsSaleCityName;
	}


	public String getVbsSaleCityName() {
		return this.vbsSaleCityName;
	}

	public void setVbsSaleStoreName(String vbsSaleStoreName) {

		if(StringUtils.isNotBlank(vbsSaleStoreName)){
			vbsSaleStoreName=vbsSaleStoreName.trim();
		}
		this.vbsSaleStoreName = vbsSaleStoreName;
	}


	public String getVbsSaleStoreName() {
		return this.vbsSaleStoreName;
	}


	public void setVbsSaleTeamName(String vbsSaleTeamName) {

		if(StringUtils.isNotBlank(vbsSaleTeamName)){
			vbsSaleTeamName=vbsSaleTeamName.trim();
		}
		this.vbsSaleTeamName = vbsSaleTeamName;
	}


	public String getVbsSaleTeamName() {
		return this.vbsSaleTeamName;
	}

	public String getSaleNo() {
		return saleNo;
	}

	public void setSaleNo(String saleNo) {
		this.saleNo = saleNo;
	}

	public void setCustomerIdcard(String customerIdcard) {

		if(StringUtils.isNotBlank(customerIdcard)){
			customerIdcard=customerIdcard.trim();
		}
		this.customerIdcard = customerIdcard;
	}


	public String getCustomerIdcard() {
		return this.customerIdcard;
	}

	public void setCustomerName(String customerName) {

		if(StringUtils.isNotBlank(customerName)){
			customerName=customerName.trim();
		}
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	//get and set
	public void setAccountId(String accountId) {
	    
		    if(StringUtils.isNotBlank(accountId)){
			 accountId=accountId.trim();
			}
		this.accountId = accountId;
	}
	
	
	public String getAccountId() {
		return this.accountId;
	}
	public void setLoginName(String loginName) {
	    
		    if(StringUtils.isNotBlank(loginName)){
			 loginName=loginName.trim();
			}
		this.loginName = loginName;
	}
	
	
	public String getLoginName() {
		return this.loginName;
	}
	public void setPassword(String password) {
	    
		    if(StringUtils.isNotBlank(password)){
			 password=password.trim();
			}
		this.password = password;
	}
	
	
	public String getPassword() {
		return this.password;
	}
	public void setAccountType(String accountType) {
	    
		    if(StringUtils.isNotBlank(accountType)){
			 accountType=accountType.trim();
			}
		this.accountType = accountType;
	}
	
	
	public String getAccountType() {
		return this.accountType;
	}
		/*
	public String getcreate_timeString() {
		return DateUtils.convertDate2String(FORMAT_CREATE_TIME, getcreate_time());
	}
	public void setcreate_timeString(String value) throws ParseException{
		setcreate_time(DateUtils.convertString2Date(FORMAT_CREATE_TIME,value));
	}*/
	
	public void setCreateTime(Date createTime) {
	    
		this.createTime = createTime;
	}
	
	
	public Date getCreateTime() {
		return this.createTime;
	}
		/*
	public String getupdate_timeString() {
		return DateUtils.convertDate2String(FORMAT_UPDATE_TIME, getupdate_time());
	}
	public void setupdate_timeString(String value) throws ParseException{
		setupdate_time(DateUtils.convertString2Date(FORMAT_UPDATE_TIME,value));
	}*/
	
	public void setUpdateTime(Date updateTime) {
	    
		this.updateTime = updateTime;
	}
	
	
	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setInviteCode(String inviteCode) {
	    
		    if(StringUtils.isNotBlank(inviteCode)){
			 inviteCode=inviteCode.trim();
			}
		this.inviteCode = inviteCode;
	}
	
	
	public String getInviteCode() {
		return this.inviteCode;
	}
	public void setIsEnabled(String isEnabled) {
	    
		    if(StringUtils.isNotBlank(isEnabled)){
			 isEnabled=isEnabled.trim();
			}
		this.isEnabled = isEnabled;
	}
	
	
	public String getIsEnabled() {
		return this.isEnabled;
	}
		/*
	public String getregister_timeString() {
		return DateUtils.convertDate2String(FORMAT_REGISTER_TIME, getregister_time());
	}
	public void setregister_timeString(String value) throws ParseException{
		setregister_time(DateUtils.convertString2Date(FORMAT_REGISTER_TIME,value));
	}*/
	
	public void setRegisterTime(Date registerTime) {
	    
		this.registerTime = registerTime;
	}
	
	
	public Date getRegisterTime() {
		return this.registerTime;
	}
	public void setAppChannel(String appChannel) {
	    
		    if(StringUtils.isNotBlank(appChannel)){
			 appChannel=appChannel.trim();
			}
		this.appChannel = appChannel;
	}
	
	
	public String getAppChannel() {
		return this.appChannel;
	}
	public void setBrand(String brand) {
	    
		    if(StringUtils.isNotBlank(brand)){
			 brand=brand.trim();
			}
		this.brand = brand;
	}
	
	
	public String getBrand() {
		return this.brand;
	}
	public void setDeviceId(String deviceId) {
	    
		    if(StringUtils.isNotBlank(deviceId)){
			 deviceId=deviceId.trim();
			}
		this.deviceId = deviceId;
	}
	
	
	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceType(String deviceType) {
	    
		    if(StringUtils.isNotBlank(deviceType)){
			 deviceType=deviceType.trim();
			}
		this.deviceType = deviceType;
	}
	
	
	public String getDeviceType() {
		return this.deviceType;
	}
	
	public String toString() {
		return new StringBuffer()
			.append("accountId=").append(getAccountId()).append(",")
			.append("loginName=").append(getLoginName()).append(",")
			.append("password=").append(getPassword()).append(",")
			.append("accountType=").append(getAccountType()).append(",")
			.append("createTime=").append(getCreateTime()).append(",")
			.append("updateTime=").append(getUpdateTime()).append(",")
			.append("inviteCode=").append(getInviteCode()).append(",")
			.append("isEnabled=").append(getIsEnabled()).append(",")
			.append("registerTime=").append(getRegisterTime()).append(",")
			.append("appChannel=").append(getAppChannel()).append(",")
			.append("brand=").append(getBrand()).append(",")
			.append("deviceId=").append(getDeviceId()).append(",")
			.append("deviceType=").append(getDeviceType()).append(",")
			.toString();
	}
	
	
}

	
