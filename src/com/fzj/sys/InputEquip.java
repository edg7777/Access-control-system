package com.fzj.sys;

import java.util.Scanner;

public class InputEquip {
    private String input=null;

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }
    public void input(ControlSys controlSys){
        Computer computer=new Computer();
        Scanner scan=new Scanner(System.in);
        System.out.println("身份验证");
        String passStr=scan.next();
        this.setInput(passStr);
        if(computer.validate(this.getInput())){
            System.out.println("验证通过");
            controlSys.setOpenSign(1);
        }
        else{
            System.out.println("验证未通过");
            controlSys.setOpenSign(0);
        }
    }

}
