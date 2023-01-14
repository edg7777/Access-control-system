package com.fzj.validate;

import java.util.ArrayList;
import java.util.List;

public class PassWordVId extends GenericValidate{
    private List<Integer> inner=new ArrayList<>();
    private String input;
    public PassWordVId(){
        this.inner.add(2468);
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    @Override
    public boolean check(String pasString) {
        int pwd=Integer.parseInt(pasString);
        this.setInput(pasString);
        for(int input:inner){
            if(input==pwd){
                return true;
            }
        }
        return false;
    }
}
