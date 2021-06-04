package com.company.experiment.four;

/**
 * @author Data
 * 不带武器的僵尸类
 */
public class ArmsZombie extends Zombie{
    public ArmsZombie(String name,int blood,int pace,int x,int y){
        super(name,blood,pace,x,y,"嘴巴",5);
    }
    @Override
    public void attack(Arms arms,Role role){
        if(this.getY()-role.getY()<=1){
            role.setBlood(role.getBlood()-this.getArms().getAp());
            System.out.println(this.getName()+"用"+this.getArms().getName()+ "攻击了"+role.getName());
        }
    }
}
