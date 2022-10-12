package com.dou.learnproject.factory.SimpleFactory;

public class OperationMul extends Operation{
    @Override
    public double getResult() {
        return getValue1() * getValue2();
    }
}
