package com.fzj.sys;

import com.fzj.validate.CardVId;
import com.fzj.validate.FingerMarkVId;
import com.fzj.validate.PassWordVId;
import com.fzj.validate.Validate;
import com.sun.javaws.IconUtil;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> passWord=new ArrayList<>();//计算机存储的雇员密码
    private List<String> Card=new ArrayList<>();//计算机存储的卡号密码
    private List<String> fingerMark=new ArrayList<>();//计算机存储的指纹
    public Computer(){

    }
    public boolean validate(String passStr){
        Validate validate=null;
        int len=passStr.length();
        String realpass;
        if(len<6){
            System.out.println("密码不能少于6位数");
            return false;
        }
        else if(passStr.substring(0,2).equals("pa")){//判断用户是否为普通用户
            System.out.println("普通用户\n密码为:"+passStr.substring(2));
            realpass=passStr.substring(2);
            validate=new PassWordVId();
            return validate.check(realpass);
        }
        else if(passStr.substring(0,2).equals("ca")){//判断用户是否为卡用户
            System.out.println("card用户\n密码为:"+passStr.substring(2));
            realpass=passStr.substring(2);
            validate=new CardVId();
            return validate.check(realpass);
        }
        else if(passStr.substring(0,2).equals("fi")){//判断用户是否为指纹用户
            System.out.println("finger用户\n密码为:"+passStr.substring(2));
            realpass=passStr.substring(2);
            validate=new FingerMarkVId();
            return validate.check(realpass);
        }
        return false;
    }
    public void addPassWord(String passStr){

    }
    public void addCards(String card){

    }
    public void addFingerMark(String fingerMark){

    }
    public List<Integer> getPassWord() {
        return passWord;
    }

    public List<String> getCard() {
        return Card;
    }

    public List<String> getFingerMark() {
        return fingerMark;
    }

    public void setPassWord(List<Integer> passWord) {
        this.passWord = passWord;
    }

    public void setCard(List<String> card) {
        Card = card;
    }

    public void setFingerMark(List<String> fingerMark) {
        this.fingerMark = fingerMark;
    }
}
