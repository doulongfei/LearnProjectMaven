package com.dou.learnproject.factory.MethodFactory;

import com.dou.learnproject.factory.SimpleFactory.Operation;
import com.dou.learnproject.factory.SimpleFactory.OperationDiv;


public class DivOper implements IFactory {
    @Override
    public Operation createOption() {
        return new OperationDiv();
    }
}
