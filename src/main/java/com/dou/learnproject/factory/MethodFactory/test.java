package com.dou.learnproject.factory.MethodFactory;

import com.dou.learnproject.factory.SimpleFactory.Operation;

public class test {
    public static void main(String[] args) {
        IFactory addOper = new AddOper();
        Operation option = addOper.createOption();
        option.setValue1(10);
        option.setValue2(5);
        System.out.println(option.getResult());
    }
}
