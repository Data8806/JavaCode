package com.company.experiment.operator.mode;

public class divOperator extends Operator{
    @Override
    public int cal() {
        return getLeft()/getRight();
    }
}
