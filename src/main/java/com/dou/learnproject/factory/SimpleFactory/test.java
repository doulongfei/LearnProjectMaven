package com.dou.learnproject.factory.SimpleFactory;

public class test {
    public static void main(String[] args) {
        OperationAdd operationAdd = new OperationAdd();
        operationAdd.setValue1(10);
        operationAdd.setValue2(5);
        System.out.println(operationAdd.getResult());

        Operation add=OperationFactory.createOperation("+");
        add.setValue1(10);
        add.setValue2(5);
        System.out.println(add.getResult());
    }
}
