package com.company.experiment.four;

/**
 * @author Data
 * 攻击类植物
 */
public class AttackPlant extends Plant {

    private int ad;
    private Arms arms;

    public AttackPlant(String name, int blood,int ad,int x,int y,String n,int ap) {
        super(name, blood,x,y);
        this.ad =ad;
        this.arms = new Arms(n,ap);
    }
    @Override
    public void attack(Arms arms,Role role){
        if(this.getY()-role.getY()<=this.ad){
            role.setBlood(getBlood()-this.arms.getAp());
        }
    }
}
