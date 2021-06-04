package com.company.experiment.four;

/**
 * @author Data
 * 防御类父类
 */
public class DefencePlant extends Plant {
    private Arms arms;
    private int ablood;

    public DefencePlant(String name, int blood,int x,int y,String n,int ap) {
        super(name, blood,x,y);
        this.arms = new Arms(n,ap);
        this.ablood = this.getBlood();
    }

    @Override
    public void attack(Arms arms, Role role) {
        if(this.getBlood()<this.ablood){
            this.setBlood(this.getBlood()+this.arms.getAp());
        }
    }
}
