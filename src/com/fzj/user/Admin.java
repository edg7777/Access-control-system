package com.fzj.user;

import com.fzj.sys.Computer;
import com.fzj.sys.ControlSys;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends Employee{
    public void work(ControlSys controlSys){//是否开门
        Scanner scan=new Scanner(System.in);
        System.out.println("管理员"+this.getName()+"按开门按钮[y/n]:");
        String ans=scan.next();
        if(ans.equalsIgnoreCase("y")){
            controlSys.setOpenSign(1);
            System.out.println("管理员"+this.getName()+"按下了开门键");
        }
        else{
            controlSys.setOpenSign(0);
            System.out.println("管理员没有按下开门键");
        }
    }
    public void work(ControlSys controlSys,Guest guest){//管理访客
        int Ringing=controlSys.getRing();
        if(Ringing==1){//访客按下了门铃
            System.out.println("管理员是否开门[y/n]");
            Scanner scan=new Scanner(System.in);
            String ac=scan.next();
            if(ac.equalsIgnoreCase("y")){//管理员开门
                controlSys.setRing(0);
                controlSys.setOpenSign(1);
                System.out.println("门铃关闭");
                System.out.println("管理员"+getName()+"同意开门");
            }
            else{//管理员不同意开门
                controlSys.setOpenSign(0);
                if(controlSys.getRing()>0){
                    System.out.println("门铃鸣响");
                }
                else{
                    System.out.println("门铃安静");
                }
                System.out.println("管理员不开门");
            }
        }
    }
    public void managerUser(Computer computer){
        List<Integer> usePaList=new ArrayList<>();//密码用户
        List<String> useCardList=new ArrayList<>();//卡用户
        List<String> useFingerMarkList=new ArrayList<>();//指纹用户
        System.out.println("=========================密码用户========================\n");
        for(int use:usePaList){
            if(use==0){
                System.out.println("暂无用户");
            }
            else{
                System.out.println(use);
            }
        }
        System.out.println("=========================卡用户========================\n");
        for (String use : useCardList) {
            if(use.isEmpty())
            {
                System.out.println("暂无用户");
            }else {
                System.out.println(use);
            }
        }
        System.out.println("=========================指纹用户========================\n");
        for (String use : useFingerMarkList) {
            if(use.isEmpty())
            {
                System.out.println("暂无用户");
            }else {
                System.out.println(use);
            }
        }
    }
}
