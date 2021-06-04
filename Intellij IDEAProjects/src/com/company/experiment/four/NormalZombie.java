package com.company.experiment.four;

/**
 * @author Data
 * 携带武器的僵尸类
 */
public class NormalZombie extends Zombie{
    public NormalZombie(String name,int blood,int pace,int x,int y,String n,int ap){
        super(name,blood,pace,x,y,n,ap);
    }

    @Override
    void attack(Arms arms, Role role) {
        if (this.getY() - role.getY() <= 1) {
            role.setBlood(role.getBlood() - this.getArms().getAp());
            System.out.println(this.getName() + "用" + this.getArms().getName() + "攻击了" + role.getName());

        }
    }
}
