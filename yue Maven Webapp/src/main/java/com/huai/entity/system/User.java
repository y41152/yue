package com.huai.entity.system;

import java.util.Date;

import com.huai.entity.Page;

/**
 * 用户类
 * @author huai
 * @date 2016年11月22日
 * @version V1.0
 */
public class User {
	
	private int      USER_ID;           // 用户ID（自增）
	private String   USER_NAME;         // 用户名（登录名）
	private String   USER_PWD;          // 密码
	private String   SJ_CODE;           // 随机码
	private int      ROLE_ID;           // 角色ID
	private String   O_PERMISSIOM;      // 个人权限
	private int      FLAG;              // 账号状态：0：正常使用，1：出现异常，2，冻结状态
	private String   IP_ADDRESS;        // 最近三次登陆ip地址
	private String   EXCEPTION_MESSAGE; // 异常信息
	private String   E_MAIL;            // 邮箱地址
	private String   PHONE;             // 电话
	private String   REMARK;            // 备注
	private Date     ADD_TIME;          // 创建时间
	private String   ADD_WHO;           // 创建人
	private Date     EDIT_TIME;         // 修改时间
	private String   EDIT_WHO;          // 修改人
	private String   ZONE;              // 所属地区
	private String   NICK_NAME;         // 昵称
	private String   USER_PHOTO;        // 用户头像
	private Role     role;			    //角色
	private Page     page;			    //分页对象
	
	public int getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getUSER_PWD() {
		return USER_PWD;
	}
	public void setUSER_PWD(String uSER_PWD) {
		USER_PWD = uSER_PWD;
	}
	public String getSJ_CODE() {
		return SJ_CODE;
	}
	public void setSJ_CODE(String sJ_CODE) {
		SJ_CODE = sJ_CODE;
	}
	public int getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(int rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	public String getO_PERMISSIOM() {
		return O_PERMISSIOM;
	}
	public void setO_PERMISSIOM(String o_PERMISSIOM) {
		O_PERMISSIOM = o_PERMISSIOM;
	}
	public int getFLAG() {
		return FLAG;
	}
	public void setFLAG(int fLAG) {
		FLAG = fLAG;
	}
	public String getIP_ADDRESS() {
		return IP_ADDRESS;
	}
	public void setIP_ADDRESS(String iP_ADDRESS) {
		IP_ADDRESS = iP_ADDRESS;
	}
	public String getEXCEPTION_MESSAGE() {
		return EXCEPTION_MESSAGE;
	}
	public void setEXCEPTION_MESSAGE(String eXCEPTION_MESSAGE) {
		EXCEPTION_MESSAGE = eXCEPTION_MESSAGE;
	}
	public String getE_MAIL() {
		return E_MAIL;
	}
	public void setE_MAIL(String e_MAIL) {
		E_MAIL = e_MAIL;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	public Date getADD_TIME() {
		return ADD_TIME;
	}
	public void setADD_TIME(Date aDD_TIME) {
		ADD_TIME = aDD_TIME;
	}
	public String getADD_WHO() {
		return ADD_WHO;
	}
	public void setADD_WHO(String aDD_WHO) {
		ADD_WHO = aDD_WHO;
	}
	public Date getEDIT_TIME() {
		return EDIT_TIME;
	}
	public void setEDIT_TIME(Date eDIT_TIME) {
		EDIT_TIME = eDIT_TIME;
	}
	public String getEDIT_WHO() {
		return EDIT_WHO;
	}
	public void setEDIT_WHO(String eDIT_WHO) {
		EDIT_WHO = eDIT_WHO;
	}
	public String getZONE() {
		return ZONE;
	}
	public void setZONE(String zONE) {
		ZONE = zONE;
	}
	public String getNICK_NAME() {
		return NICK_NAME;
	}
	public void setNICK_NAME(String nICK_NAME) {
		NICK_NAME = nICK_NAME;
	}
	public String getUSER_PHOTO() {
		return USER_PHOTO;
	}
	public void setUSER_PHOTO(String uSER_PHOTO) {
		USER_PHOTO = uSER_PHOTO;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Page getPage() {
		if(page==null)
			page = new Page();
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
	@Override
	public String toString() {
		return "User [USER_ID=" + USER_ID + ", USER_NAME=" + USER_NAME
				+ ", USER_PWD=" + USER_PWD + ", SJ_CODE=" + SJ_CODE
				+ ", ROLE_ID=" + ROLE_ID + ", O_PERMISSIOM=" + O_PERMISSIOM
				+ ", FLAG=" + FLAG + ", IP_ADDRESS=" + IP_ADDRESS
				+ ", EXCEPTION_MESSAGE=" + EXCEPTION_MESSAGE + ", E_MAIL="
				+ E_MAIL + ", PHONE=" + PHONE + ", REMARK=" + REMARK
				+ ", ADD_TIME=" + ADD_TIME + ", ADD_WHO=" + ADD_WHO
				+ ", EDIT_TIME=" + EDIT_TIME + ", EDIT_WHO=" + EDIT_WHO
				+ ", ZONE=" + ZONE + ", NICK_NAME=" + NICK_NAME
				+ ", USER_PHOTO=" + USER_PHOTO + ", role=" + role + ", page="
				+ page + "]";
	}
	
}
