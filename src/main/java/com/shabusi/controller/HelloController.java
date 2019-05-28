package com.shabusi.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller {
    //指定当前actionkey
//    @ActionKey("/hello123")
    public void index(){
        renderText("Hello");
    }
}
