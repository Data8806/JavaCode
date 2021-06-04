package com.company.experiment.four;

/**
 * @author Data
 * 植物父类
 */
public abstract class Plant extends Role{

    public Plant(String name,int blood,int x,int y){
        super();
        this.setName(name);
        this.setBlood(blood);
        this.setX(x);
        this.setY(y);
    }

    @Override
    public void move(Role role) {}
}



