package com.zking.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseFwlx<M extends BaseFwlx<M>> extends Model<M> implements IBean {

	public void setLxbh(java.lang.Integer lxbh) {
		set("lxbh", lxbh);
	}
	
	public java.lang.Integer getLxbh() {
		return getInt("lxbh");
	}

	public void setLxmc(java.lang.String lxmc) {
		set("lxmc", lxmc);
	}
	
	public java.lang.String getLxmc() {
		return getStr("lxmc");
	}

}
