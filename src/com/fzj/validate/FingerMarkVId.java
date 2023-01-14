package com.fzj.validate;

import java.util.ArrayList;
import java.util.List;

public class FingerMarkVId extends GenericValidate{
    private List<String> inner=new ArrayList<>();
    private String input;
    public FingerMarkVId(){
        this.inner.add("1234");
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    @Override
    public boolean check(String pasString) {
        this.setInput(pasString);
        for(String input:inner){
            if(input.equals(this.getInput())){
                return true;
            }
        }
        return false;
    }
}
