package com.fzj.sys;

public class ControlSys {
    private Door door;//电子门
    private Computer computer;//计算机
    private InputEquip inputEquip;//输入设备
    private int ring;//客人按的门铃,0为关闭，1为开启
    private int openSign;//开门信号，由管理员按下按钮
    public ControlSys(){
        this.door=Door.CLOSE;
        this.computer=new Computer();
        this.inputEquip=new InputEquip();
        this.ring=0;
        this.openSign=0;
        System.out.println("门禁系统的使用方法\n" +
                " 1.模拟输入密码：以“pa”开头，后跟密码\n" +
                " 2.模拟刷卡：以“ca”开头，后跟卡号\n" +
                " 3.模拟取指纹：以“fi”开头，后跟表示指纹的字符串\n"+
                " 4.模拟管理员按下开门按钮：输入“y”");
        System.out.println("***********************************************");
        System.out.println("门禁系统启动");
    }
    public void work(){
        if(this.getOpenSign()==1){
            door=Door.OPEN;
            System.out.println(door.getState()+"电子门处于开启状态，5秒后关闭");
            try {
                Thread.sleep(5000);
                this.setOpenSign(0);
                door= Door.CLOSE;
                System.out.println(door.getState());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Door getDoor() {
        return door;
    }

    public Computer getComputer() {
        return computer;
    }

    public InputEquip getInputEquip() {
        return inputEquip;
    }

    public int getRing() {
        return ring;
    }

    public int getOpenSign() {
        return openSign;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setInputEquip(InputEquip inputEquip) {
        this.inputEquip = inputEquip;
    }

    public void setRing(int ring) {
        this.ring = ring;
    }

    public void setOpenSign(int openSign) {
        this.openSign = openSign;
    }
}
