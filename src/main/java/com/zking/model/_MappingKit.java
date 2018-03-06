package com.zking.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("t_account", "user_name", Account.class);
		arp.addMapping("t_book", "book_id", Book.class);
		arp.addMapping("t_book_type", "type_id", BookType.class);
		arp.addMapping("t_customer", "customer_id", Customer.class);
		arp.addMapping("t_fwlx", "lxbh", Fwlx.class);
		arp.addMapping("t_fwxx", "fwbh", Fwxx.class);
		arp.addMapping("t_user", "t_uid", User.class);
		arp.addMapping("t_yh", "yhbh", Yh.class);
	}
}

