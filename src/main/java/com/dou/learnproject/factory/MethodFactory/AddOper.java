package com.dou.learnproject.factory.MethodFactory;

import com.dou.learnproject.factory.SimpleFactory.Operation;
import com.dou.learnproject.factory.SimpleFactory.OperationAdd;


public class AddOper implements IFactory {
    @Override
    public Operation createOption() {
        return new OperationAdd();
    }
}
