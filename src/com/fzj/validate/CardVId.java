package com.fzj.validate;

import java.util.ArrayList;
import java.util.List;

public class CardVId extends GenericValidate{ //卡用户
    private List<String>inner=new ArrayList<>();//系统已有的信息
    private String input;//需要验证的信息
    public CardVId(){
        this.inner.add("1234");
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    @Override
    public boolean check(String pasString) {//卡类用户的验证
        this.setInput(pasString);
        for(String input:inner){
            if(input.equals(this.getInput())){
                return true;
            }
        }
        return false;
    }
}
