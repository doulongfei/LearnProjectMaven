package com.dou.learnproject.factory.SimpleFactory;

/**
 * 工厂操作
 *
 * @author doulongfei
 * @date 2022/10/12
 */
public class OperationFactory {
    public static Operation createOperation(String operation) {
        Operation op = null;
        switch (operation) {
            case "+":
                op = new OperationAdd();
                break;
            case "-":
                op = new OperationSub();
                break;
            case "*":
                op = new OperationMul();
                break;
            case "/":
                op = new OperationDiv();
                break;
            default:
                throw new UnsupportedOperationException("不支持该操作");
        }
        return op;
    }
}
