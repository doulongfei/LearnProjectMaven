package com.dou.learnproject.factory.MethodFactory;

import com.dou.learnproject.factory.SimpleFactory.Operation;
import com.dou.learnproject.factory.SimpleFactory.OperationMul;


public class MulOper implements IFactory {
    @Override
    public Operation createOption() {
        return new OperationMul();
    }
}
