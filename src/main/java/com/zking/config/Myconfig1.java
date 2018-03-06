package com.zking.config;

import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.zking.controller.Hellowcontroller;
import com.zking.controller.Usercontroller;
import com.zking.model._MappingKit;

//路由
public class Myconfig1 extends JFinalConfig{
    public void configConstant(Constants me) {
         me.setDevMode(true);//设置开发模式
         me.setViewType(ViewType.JSP);//

    }

    //配置路由
    public void configRoute(Routes me) {
        me.add("/hellow", Hellowcontroller.class);
        me.add("/user", Usercontroller.class);

    }

    public void configEngine(Engine engine) {

    }

    public void configPlugin(Plugins me) {
        //配置并添加C3P0连接池插件
        loadPropertyFile("jdbc.properties");//加载属性文件
        C3p0Plugin cp = new C3p0Plugin(getProperty("jdbc.url"), getProperty("jdbc.username"), getProperty("jdbc.password"));
        me.add(cp);

        ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
        arp.setShowSql(true);//显示sql
        _MappingKit.mapping(arp);
        me.add(arp);
        //ORM配置
        //添加数据库与Model的关系映射，Book需要继承Model<E>类
        //默认id作为主键，若主键不是id 那么可以采用以下方式
        //arp.addMapping("t_book", Book.class);
        // arp.addMapping("t_book", "book_id", Book.class);

    }

    public void configInterceptor(Interceptors interceptors) {
        //哈哈哈哈哈哈

    }

    public void configHandler(Handlers handlers) {

    }
}
