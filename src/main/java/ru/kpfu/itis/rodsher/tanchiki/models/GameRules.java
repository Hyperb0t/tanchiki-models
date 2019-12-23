package ru.kpfu.itis.rodsher.tanchiki.models;

public class GameRules {
    //знаечние по умолчанию
    private final int fieldHeight = 16;
    private final int fieldWidth = 16;
    private float tankSpeed = 0.1f;
    private float bulletSpeed = 1f;
    private int tankHp = 5;
    private int wallHp = 3;

    public GameRules() {
    }

    public GameRules(float tankSpeed, float bulletSpeed, int tankHp, int wallHp) {
        this.tankSpeed = tankSpeed;
        this.bulletSpeed = bulletSpeed;
        this.tankHp = tankHp;
        this.wallHp = wallHp;
    }

    public int getFieldHeight() {
        return fieldHeight;
    }

    public int getFieldWidth() {
        return fieldWidth;
    }

    public float getTankSpeed() {
        return tankSpeed;
    }

    public float getBulletSpeed() {
        return bulletSpeed;
    }

    public int getTankHp() {
        return tankHp;
    }

    public int getWallHp() {
        return wallHp;
    }
}
