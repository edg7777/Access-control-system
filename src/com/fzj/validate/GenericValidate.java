package com.fzj.validate;

public abstract class GenericValidate implements Validate{//抽象类实现Validate接口

    @Override
    public abstract boolean check(String pasString);
}
