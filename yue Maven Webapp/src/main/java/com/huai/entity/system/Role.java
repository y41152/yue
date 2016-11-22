package com.huai.entity.system;

import java.util.Date;

/**
 * 角色类
 * @author huai
 * @date 2016年11月22日
 * @version V1.0
 */
public class Role {
	private int     ROLE_ID;          //角色ID
	private String  ROLE_NAME;        //角色名
	private int     PARENT_ID;        //角色组 
	private String  ROLE_PEMISSION;   //角色权限
	private String  REMARK;           //备注
	private Date    ADD_TIME;         // 创建时间
	private String  ADD_WHO;          // 创建人
	private Date    EDIT_TIME;        // 修改时间
	private String  EDIT_WHO;         // 修改人
	public int getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(int rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	public String getROLE_NAME() {
		return ROLE_NAME;
	}
	public void setROLE_NAME(String rOLE_NAME) {
		ROLE_NAME = rOLE_NAME;
	}
	public int getPARENT_ID() {
		return PARENT_ID;
	}
	public void setPARENT_ID(int pARENT_ID) {
		PARENT_ID = pARENT_ID;
	}
	public String getROLE_PEMISSION() {
		return ROLE_PEMISSION;
	}
	public void setROLE_PEMISSION(String rOLE_PEMISSION) {
		ROLE_PEMISSION = rOLE_PEMISSION;
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
	@Override
	public String toString() {
		return "Role [ROLE_ID=" + ROLE_ID + ", ROLE_NAME=" + ROLE_NAME
				+ ", PARENT_ID=" + PARENT_ID + ", ROLE_PEMISSION="
				+ ROLE_PEMISSION + ", REMARK=" + REMARK + ", ADD_TIME="
				+ ADD_TIME + ", ADD_WHO=" + ADD_WHO + ", EDIT_TIME="
				+ EDIT_TIME + ", EDIT_WHO=" + EDIT_WHO + "]";
	}
	
	
}
