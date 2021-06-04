package com.company.experiment.operator.mode;

public class mulOperator extends Operator{

    @Override
    public int cal() {
        return getLeft()*getRight();
    }
}
