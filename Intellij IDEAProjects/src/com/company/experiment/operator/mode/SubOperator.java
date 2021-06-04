package com.company.experiment.operator.mode;

/**
 * @author Data
 */
public class SubOperator extends Operator {
    @Override
    public int cal(){
        return getLeft()-getRight();
    }
}
