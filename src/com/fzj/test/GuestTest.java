package com.fzj.test;

import com.fzj.sys.ControlSys;
import com.fzj.user.Admin;
import com.fzj.user.Guest;

public class GuestTest {
    public static void main(String[] args) {
        Guest g =new Guest();
        g.setName("meiko");
        Admin admin=new Admin();
        admin.setName("edg");
        ControlSys controlSys=new ControlSys();
        System.out.println("门禁系统---访客测试");
        System.out.println("****************************");
        while(true){
            g.pressRing(controlSys);
            admin.work(controlSys,g);
            controlSys.work();
        }
    }
}
