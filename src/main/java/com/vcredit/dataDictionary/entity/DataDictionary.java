package com.vcredit.dataDictionary.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.StringUtils;



/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-03 15:40:36
 * @see com.vcredit.entity.DataDictionary
 */

public class DataDictionary  implements Serializable{
	
	//columns START
	/**
	 * ID
	 */
	private Long id;
	/**
	 * 类型
	 */
	private String codeType;
	/**
	 * KEY值
	 */
	private String codeKey;
	/**
	 * VALUE值
	 */
	private String codeValue;
	/**
	 * 描述
	 */
	private String codeDescribe;
	/**
	 * 是否启用(0：停用；1：启用)
	 */
	private String isEnable;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	//columns END 数据库字段结束
	
	

	//get and set
	public void setId(Long id) {
	    
		this.id = id;
	}
	
	
	public Long getId() {
		return this.id;
	}
	public void setCodeType(String codeType) {
	    
		    if(StringUtils.isNotBlank(codeType)){
			 codeType=codeType.trim();
			}
		this.codeType = codeType;
	}
	
	
	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeKey(String codeKey) {
	    
		    if(StringUtils.isNotBlank(codeKey)){
			 codeKey=codeKey.trim();
			}
		this.codeKey = codeKey;
	}
	
	
	public String getCodeKey() {
		return this.codeKey;
	}
	public void setCodeValue(String codeValue) {
	    
		    if(StringUtils.isNotBlank(codeValue)){
			 codeValue=codeValue.trim();
			}
		this.codeValue = codeValue;
	}
	
	
	public String getCodeValue() {
		return this.codeValue;
	}
	public void setCodeDescribe(String codeDescribe) {
	    
		    if(StringUtils.isNotBlank(codeDescribe)){
			 codeDescribe=codeDescribe.trim();
			}
		this.codeDescribe = codeDescribe;
	}
	
	
	public String getCodeDescribe() {
		return this.codeDescribe;
	}
	public void setIsEnable(String isEnable) {
	    
		    if(StringUtils.isNotBlank(isEnable)){
			 isEnable=isEnable.trim();
			}
		this.isEnable = isEnable;
	}
	
	
	public String getIsEnable() {
		return this.isEnable;
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
	
	public String toString() {
		return new StringBuffer()
			.append("id=").append(getId()).append(",")
			.append("codeType=").append(getCodeType()).append(",")
			.append("codeKey=").append(getCodeKey()).append(",")
			.append("codeValue=").append(getCodeValue()).append(",")
			.append("codeDescribe=").append(getCodeDescribe()).append(",")
			.append("isEnable=").append(getIsEnable()).append(",")
			.append("updateTime=").append(getUpdateTime()).append(",")
			.toString();
	}
	
	
}

	
