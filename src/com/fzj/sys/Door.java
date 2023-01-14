package com.fzj.sys;

enum Door {//枚举类
    CLOSE("关闭"),
    OPEN("打开");
    private final String state;
    private Door(String state){
        this.state=state;
    }
    public String getState(){
        return state;
    }
}
