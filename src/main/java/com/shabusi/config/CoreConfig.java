package com.shabusi.config;

import com.jfinal.config.*;
import com.jfinal.kit.PropKit;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;
import com.shabusi.controller.HelloController;
import com.shabusi.routes.HelloRoutes;

public class CoreConfig extends JFinalConfig {
    public static void main(String[] args) {
        UndertowServer.start(CoreConfig.class,80,true);
    }
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);//开发模式，每次请求会输出报告
    }

    @Override
    public void configRoute(Routes routes) {
//        routes.add("/hello", HelloController.class);
        routes.add(new HelloRoutes()); //模块化路由
    }

    @Override
    public void configEngine(Engine engine) {
        engine.addSharedFunction("/view/layout.html");
    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {
//        PropKit.use("");
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
