package com.company.experiment.four;

/**
 * @author Data
 * 武器类：可以具体化为植物的武器和僵尸的武器
 */
public class Arms {
    private String name;
    private int ap;
    public Arms(String name,int ap){
        this.name = name;
        this.ap = ap;
    }

    public String getName() {
        return name;
    }

    public int getAp(){
        return ap;
    }
}
