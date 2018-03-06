package com.zking.controller;

import com.jfinal.core.Controller;

public class Hellowcontroller extends Controller {


    public void index(){

        renderText("hellow jfinal");
    }

    public void add(){
        renderText("hellow add");
    }

    public void div(){
        renderText("hellow div");
    }
}
