package com.fzj.test;

import com.fzj.sys.Computer;
import com.fzj.sys.ControlSys;
import com.fzj.user.Admin;

import java.util.Scanner;

public class AadminTest {
    public static void main(String[] args) {
        Admin admin=new Admin();
        Computer computer=new Computer();
        admin.setName("kenzhu");
        ControlSys controlSys=new ControlSys();
        Scanner scan=new Scanner(System.in);
        System.out.println("门禁系统---管理员测试");
        System.out.println("管理员测试请按 -->A\t用户管理请按--->B");
        String way=scan.next();
        System.out.println("*************************************************");
        if(way.equals("a")){
            while(true){
                System.out.println("门禁系统---管理员测试"+"===管理员："+admin.getName());
                admin.work(controlSys);
                controlSys.work();
            }
        }
        else if(way.equals("b")){
            admin.managerUser(computer);
        }
    }
}
