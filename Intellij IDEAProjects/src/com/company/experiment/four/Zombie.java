package com.company.experiment.four;

/**
 * @author Data
 * 僵尸父类
 */
public abstract class Zombie extends Role{
    private int pace;
    private Arms arms;
    public Zombie(){};
    public Zombie(String name,int blood,int pace,int x,int y,String n,int ap){
        super();
        this.setName(name);
        this.setBlood(blood);
        this.setX(x);
        this.setY(y);
        this.pace = pace;
        this.arms = new Arms(n,ap);
    };

    @Override
    public void move(Role role){
        if (this.getY()-role.getY()>=2){
            this.setY(this.getY()-pace);
        }

    }

    public Arms getArms() {
        return arms;
    }
}
