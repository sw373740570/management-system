package com.vcredit.lrhWechatAttention.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang.StringUtils;



/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 09:26:00
 * @see com.vcredit.entity.LrhWechatAttention
 */

public class LrhWechatAttention  implements Serializable{
	
	//columns START
	/**
	 * 主键ID
	 */
	private String attentionId;
	/**
	 * 客户微信号
	 */
	private String wechatNo;
	/**
	 * 客户微信昵称
	 */
	private String wechatNickname;
	/**
	 * VBS——销售Id
	 */
	private String vbsSaleSaleAgentId;
	/**
	 * VBS——销售所属团队名称
	 */
	private String vbsSaleTeamName;
	/**
	 * VBS——销售所属团队代码
	 */
	private String vbsSaleTeamFullKey;
	/**
	 * VBS——销售所属门店代码
	 */
	private String vbsSaleStoreKey;
	/**
	 * VBS——销售所属门店名称
	 */
	private String vbsSaleStoreName;
	/**
	 * VBS——销售所属城市
	 */
	private String vbsSaleCityName;
	/**
	 * VBS——销售所属城市代码
	 */
	private String vbsSaleRegionKey;
	/**
	 * 客户微信OpenID
	 */
	private String openId;
	/**
	 * 关注时间
	 */
	private Date attentionTime;
	/**
	 * 记录创建时间
	 */
	private Date createTime;
	/**
	 * 记录更新时间
	 */
	private Date modifyTime;
	/**
	 * VBS——销售姓名
	 */
	private String vbsSaleAgentName;
	/**
	 * VBS——城市code
	 */
	private Integer vbsCityCode;
	/**
	 * VBS——销售部名称
	 */
	private String vbsSalesDepartmentName;
	/**
	 * VBS——销售部FullKey
	 */
	private String vbsSalesDepartmentKey;
	/**
	 * VBS——分部名称
	 */
	private String vbsDivisionName;
	/**
	 * VBS——分部FullKey
	 */
	private String vbsDivisionKey;
	//columns END 数据库字段结束
	
	private String saleNo;

	public String getSaleNo() {
		return saleNo;
	}

	public void setSaleNo(String saleNo) {
		this.saleNo = saleNo;
	}

	//get and set
	public void setAttentionId(String attentionId) {
	    
		    if(StringUtils.isNotBlank(attentionId)){
			 attentionId=attentionId.trim();
			}
		this.attentionId = attentionId;
	}
	
	
	public String getAttentionId() {
		return this.attentionId;
	}
	public void setWechatNo(String wechatNo) {
	    
		    if(StringUtils.isNotBlank(wechatNo)){
			 wechatNo=wechatNo.trim();
			}
		this.wechatNo = wechatNo;
	}
	
	
	public String getWechatNo() {
		return this.wechatNo;
	}
	public void setWechatNickname(String wechatNickname) {
	    
		    if(StringUtils.isNotBlank(wechatNickname)){
			 wechatNickname=wechatNickname.trim();
			}
		this.wechatNickname = wechatNickname;
	}
	
	
	public String getWechatNickname() {
		return this.wechatNickname;
	}
	public void setVbsSaleSaleAgentId(String vbsSaleSaleAgentId) {
	    
		    if(StringUtils.isNotBlank(vbsSaleSaleAgentId)){
			 vbsSaleSaleAgentId=vbsSaleSaleAgentId.trim();
			}
		this.vbsSaleSaleAgentId = vbsSaleSaleAgentId;
	}
	
	
	public String getVbsSaleSaleAgentId() {
		return this.vbsSaleSaleAgentId;
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
	public void setVbsSaleTeamFullKey(String vbsSaleTeamFullKey) {
	    
		    if(StringUtils.isNotBlank(vbsSaleTeamFullKey)){
			 vbsSaleTeamFullKey=vbsSaleTeamFullKey.trim();
			}
		this.vbsSaleTeamFullKey = vbsSaleTeamFullKey;
	}
	
	
	public String getVbsSaleTeamFullKey() {
		return this.vbsSaleTeamFullKey;
	}
	public void setVbsSaleStoreKey(String vbsSaleStoreKey) {
	    
		    if(StringUtils.isNotBlank(vbsSaleStoreKey)){
			 vbsSaleStoreKey=vbsSaleStoreKey.trim();
			}
		this.vbsSaleStoreKey = vbsSaleStoreKey;
	}
	
	
	public String getVbsSaleStoreKey() {
		return this.vbsSaleStoreKey;
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
	public void setVbsSaleCityName(String vbsSaleCityName) {
	    
		    if(StringUtils.isNotBlank(vbsSaleCityName)){
			 vbsSaleCityName=vbsSaleCityName.trim();
			}
		this.vbsSaleCityName = vbsSaleCityName;
	}
	
	
	public String getVbsSaleCityName() {
		return this.vbsSaleCityName;
	}
	public void setVbsSaleRegionKey(String vbsSaleRegionKey) {
	    
		    if(StringUtils.isNotBlank(vbsSaleRegionKey)){
			 vbsSaleRegionKey=vbsSaleRegionKey.trim();
			}
		this.vbsSaleRegionKey = vbsSaleRegionKey;
	}
	
	
	public String getVbsSaleRegionKey() {
		return this.vbsSaleRegionKey;
	}
	public void setOpenId(String openId) {
	    
		    if(StringUtils.isNotBlank(openId)){
			 openId=openId.trim();
			}
		this.openId = openId;
	}
	
	
	public String getOpenId() {
		return this.openId;
	}
		/*
	public String getattention_timeString() {
		return DateUtils.convertDate2String(FORMAT_ATTENTION_TIME, getattention_time());
	}
	public void setattention_timeString(String value) throws ParseException{
		setattention_time(DateUtils.convertString2Date(FORMAT_ATTENTION_TIME,value));
	}*/
	
	public void setAttentionTime(Date attentionTime) {
	    
		this.attentionTime = attentionTime;
	}

	public Date getAttentionTime() {
		return this.attentionTime;
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
	public String getmodify_timeString() {
		return DateUtils.convertDate2String(FORMAT_MODIFY_TIME, getmodify_time());
	}
	public void setmodify_timeString(String value) throws ParseException{
		setmodify_time(DateUtils.convertString2Date(FORMAT_MODIFY_TIME,value));
	}*/
	
	public void setModifyTime(Date modifyTime) {
	    
		this.modifyTime = modifyTime;
	}
	
	
	public Date getModifyTime() {
		return this.modifyTime;
	}
	public void setVbsSaleAgentName(String vbsSaleAgentName) {
	    
		    if(StringUtils.isNotBlank(vbsSaleAgentName)){
			 vbsSaleAgentName=vbsSaleAgentName.trim();
			}
		this.vbsSaleAgentName = vbsSaleAgentName;
	}
	
	
	public String getVbsSaleAgentName() {
		return this.vbsSaleAgentName;
	}
	public void setVbsCityCode(Integer vbsCityCode) {
	    
		this.vbsCityCode = vbsCityCode;
	}
	
	
	public Integer getVbsCityCode() {
		return this.vbsCityCode;
	}
	public void setVbsSalesDepartmentName(String vbsSalesDepartmentName) {
	    
		    if(StringUtils.isNotBlank(vbsSalesDepartmentName)){
			 vbsSalesDepartmentName=vbsSalesDepartmentName.trim();
			}
		this.vbsSalesDepartmentName = vbsSalesDepartmentName;
	}
	
	
	public String getVbsSalesDepartmentName() {
		return this.vbsSalesDepartmentName;
	}
	public void setVbsSalesDepartmentKey(String vbsSalesDepartmentKey) {
	    
		    if(StringUtils.isNotBlank(vbsSalesDepartmentKey)){
			 vbsSalesDepartmentKey=vbsSalesDepartmentKey.trim();
			}
		this.vbsSalesDepartmentKey = vbsSalesDepartmentKey;
	}
	
	
	public String getVbsSalesDepartmentKey() {
		return this.vbsSalesDepartmentKey;
	}
	public void setVbsDivisionName(String vbsDivisionName) {
	    
		    if(StringUtils.isNotBlank(vbsDivisionName)){
			 vbsDivisionName=vbsDivisionName.trim();
			}
		this.vbsDivisionName = vbsDivisionName;
	}
	
	
	public String getVbsDivisionName() {
		return this.vbsDivisionName;
	}
	public void setVbsDivisionKey(String vbsDivisionKey) {
	    
		    if(StringUtils.isNotBlank(vbsDivisionKey)){
			 vbsDivisionKey=vbsDivisionKey.trim();
			}
		this.vbsDivisionKey = vbsDivisionKey;
	}
	
	
	public String getVbsDivisionKey() {
		return this.vbsDivisionKey;
	}
	
	public String toString() {
		return new StringBuffer()
			.append("attentionId=").append(getAttentionId()).append(",")
			.append("wechatNo=").append(getWechatNo()).append(",")
			.append("wechatNickname=").append(getWechatNickname()).append(",")
			.append("vbsSaleSaleAgentId=").append(getVbsSaleSaleAgentId()).append(",")
			.append("vbsSaleTeamName=").append(getVbsSaleTeamName()).append(",")
			.append("vbsSaleTeamFullKey=").append(getVbsSaleTeamFullKey()).append(",")
			.append("vbsSaleStoreKey=").append(getVbsSaleStoreKey()).append(",")
			.append("vbsSaleStoreName=").append(getVbsSaleStoreName()).append(",")
			.append("vbsSaleCityName=").append(getVbsSaleCityName()).append(",")
			.append("vbsSaleRegionKey=").append(getVbsSaleRegionKey()).append(",")
			.append("openId=").append(getOpenId()).append(",")
			.append("attentionTime=").append(getAttentionTime()).append(",")
			.append("createTime=").append(getCreateTime()).append(",")
			.append("modifyTime=").append(getModifyTime()).append(",")
			.append("vbsSaleAgentName=").append(getVbsSaleAgentName()).append(",")
			.append("vbsCityCode=").append(getVbsCityCode()).append(",")
			.append("vbsSalesDepartmentName=").append(getVbsSalesDepartmentName()).append(",")
			.append("vbsSalesDepartmentKey=").append(getVbsSalesDepartmentKey()).append(",")
			.append("vbsDivisionName=").append(getVbsDivisionName()).append(",")
			.append("vbsDivisionKey=").append(getVbsDivisionKey()).append(",")
			.toString();
	}
	
	
}

	
