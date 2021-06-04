package com.company.experiment.operator.view;

import com.company.experiment.operator.control.OperatorFactory;
import com.company.experiment.operator.mode.Operator;
import java.util.Scanner;

/**
 * @author Data
 */
public class Entry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int left = input.nextInt();
        int right = input.nextInt();
        String op = input.next();
        Operator oper = OperatorFactory.createOperator(op);
        oper.setRight(right);
        oper.setLeft(left);
        int result = oper.cal();   // 多态
        System.out.println(result);
    }
}
