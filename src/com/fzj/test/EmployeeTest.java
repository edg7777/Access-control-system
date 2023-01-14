package com.fzj.test;

import com.fzj.sys.ControlSys;
import com.fzj.user.Employee;

import java.awt.image.renderable.ContextualRenderedImageFactory;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("jiejie");
        ControlSys controlSys=new ControlSys();
        System.out.println("门禁系统---雇员测试");
        System.out.println("**************************************************");
        while(true){
            employee.input(controlSys);
            controlSys.work();
        }
    }
}
