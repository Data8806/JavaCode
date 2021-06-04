package com.company.experiment.operator.mode;

/**
 * @author Data
 */
public abstract class Operator {
    private int left;
    private int right;

    public abstract int cal();
    public int add(int left,int right){
        return left+right;
    }
    public int sub(int left,int right){
        return left-right;
    }

    public int getLeft(){
        return this.left;
    }
    public int getRight(){
        return this.right;
    }
    public void setRight(int right){
        this.right = right;
    }

    public void setLeft(int left) {
        this.left = left;
    }
}
