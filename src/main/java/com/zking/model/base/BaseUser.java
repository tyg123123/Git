package com.zking.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setTUid(java.lang.Integer tUid) {
		set("t_uid", tUid);
	}
	
	public java.lang.Integer getTUid() {
		return getInt("t_uid");
	}

	public void setTUser(java.lang.String tUser) {
		set("t_user", tUser);
	}
	
	public java.lang.String getTUser() {
		return getStr("t_user");
	}

	public void setTPassword(java.lang.String tPassword) {
		set("t_password", tPassword);
	}
	
	public java.lang.String getTPassword() {
		return getStr("t_password");
	}

	public void setAuthority(java.lang.Integer authority) {
		set("authority", authority);
	}
	
	public java.lang.Integer getAuthority() {
		return getInt("authority");
	}

	public void setIsvoid(java.lang.Integer isvoid) {
		set("isvoid", isvoid);
	}
	
	public java.lang.Integer getIsvoid() {
		return getInt("isvoid");
	}

}
