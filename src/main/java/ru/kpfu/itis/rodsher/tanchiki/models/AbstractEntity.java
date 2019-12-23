package ru.kpfu.itis.rodsher.tanchiki.models;

import java.awt.image.BufferedImage;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return Objects.equals(x, that.x) &&
                Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}