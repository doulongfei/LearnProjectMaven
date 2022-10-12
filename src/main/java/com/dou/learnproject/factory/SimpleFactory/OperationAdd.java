package com.dou.learnproject.factory.SimpleFactory;

public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        return getValue1() + getValue2();
    }
}
