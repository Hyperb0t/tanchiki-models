package ru.kpfu.itis.rodsher.tanchiki.models;

import java.awt.image.BufferedImage;

public class Floor {
    //Путь до текстуры или как мы ее храним?
    private BufferedImage texture;

    //Может быть null
    private AbstractEntity entity;

    public Floor(BufferedImage texture) {
        this.texture = texture;
        entity = null;
    }

    public Floor(BufferedImage texture, AbstractEntity entity) {
        this.texture = texture;
        this.entity = entity;
    }

    public void setEntity(AbstractEntity entity) {
        this.entity = entity;
    }

    public AbstractEntity getEntity() {
        return entity;
    }

    public BufferedImage getTexture() {
        return texture;
    }
}
