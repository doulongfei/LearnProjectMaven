package com.dou.learnproject.factory.MethodFactory;

import com.dou.learnproject.factory.SimpleFactory.Operation;
import com.dou.learnproject.factory.SimpleFactory.OperationSub;


public class SubOper implements IFactory {
    @Override
    public Operation createOption() {
        return new OperationSub();
    }
}
