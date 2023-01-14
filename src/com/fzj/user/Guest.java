package com.fzj.user;

import com.fzj.sys.ControlSys;
//访客没有验证系统，访客只能按门铃进行访问
import java.util.Scanner;

public class Guest {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void pressRing(ControlSys controlSys){
        Scanner scan=new Scanner(System.in);
        System.out.println("访客"+this.getName()+"按门铃[y/n]");
        String res=scan.next();
        if(res.equalsIgnoreCase("y")){
            controlSys.setRing(1);
            System.out.println("访客"+getName()+"按下了门铃");
            System.out.println("门铃响了");
        }
        else{
            controlSys.setRing(0);
            controlSys.setOpenSign(0);
            System.out.println("访客没有按门铃");
        }
    }

}
