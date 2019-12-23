package ru.kpfu.itis.rodsher.tanchiki.models;

import java.awt.image.BufferedImage;

public abstract class AbstractEntity {
    //Координаты сущности
    private Float x;
    private Float y;

    public AbstractEntity(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public void setCoordinates(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    //Путь до текстуры или как мы ее храним?
    public abstract BufferedImage getTexture();
}