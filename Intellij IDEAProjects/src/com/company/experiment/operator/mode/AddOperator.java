package com.company.experiment.operator.mode;

public class AddOperator extends Operator {
    @Override
    public int cal(){
        return getLeft()+getRight();
    }
}
