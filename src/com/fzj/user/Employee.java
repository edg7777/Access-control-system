package com.fzj.user;

import com.fzj.sys.ControlSys;
//员工具有门禁系统，可以通过3种方式进行访问
public class Employee extends Guest{
    private String passWord;
    public void input(ControlSys controlSys){
        controlSys.getInputEquip().input(controlSys);
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }
}
