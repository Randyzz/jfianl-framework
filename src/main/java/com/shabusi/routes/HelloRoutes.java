package com.shabusi.routes;

import com.jfinal.config.Routes;
import com.shabusi.controller.HelloController;

public class HelloRoutes extends Routes {
    @Override
    public void config() {
        setBaseViewPath("/view/hello");
        add("/", HelloController.class);
    }
}
