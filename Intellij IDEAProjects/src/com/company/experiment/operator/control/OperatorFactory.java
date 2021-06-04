package com.company.experiment.operator.control;

import com.company.experiment.operator.mode.*;

/**
 * @author Data
 * 运算符工厂类
 * 作用：产生运算对象
 *
 */
public class OperatorFactory {
    public static Operator createOperator(String op){
        Operator p = null;
        switch (op){
            case "+":
                p =new AddOperator();
                break;
            case "-":
                p = new SubOperator();
                break;
            case "*":
                p = new mulOperator();
                break;
            case "/":
                p = new divOperator();
                break;
            default:
                System.out.println("输入错误");
        }
        return p;
    }
}
