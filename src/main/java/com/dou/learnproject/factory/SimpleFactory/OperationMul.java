package com.dou.learnproject.factory.SimpleFactory;

public class OperationMul extends Operation{
    @Override
    protected double getResult() {
        return getValue1()*getValue2();
    }
}
