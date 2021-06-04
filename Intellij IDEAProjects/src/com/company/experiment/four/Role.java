package com.company.experiment.four;

/**
 * @author Data
 */
public abstract class Role {
    private String name;
    private int blood;
    private boolean survive;
    private int x;
    private int y;

    private void kill() {
        if (this.blood <= 0) {
            this.survive = false;
        }
    }

    /**
     * 抽象方法attack为每个角色的攻击方法
     *
     * @param arms 为攻击方式
     * @param role 攻击对象
     */
    abstract void attack(Arms arms, Role role);

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public abstract void move(Role role);
}