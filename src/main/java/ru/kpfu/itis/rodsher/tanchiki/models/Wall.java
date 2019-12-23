package ru.kpfu.itis.rodsher.tanchiki.models;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Wall extends AbstractEntity {

    //путь до текстур(целая, слегка битая, избитая и т.д.)
    private BufferedImage[] textures;
    //Индекс текстуры в текущий момент из списка textures
    private int currentTextureIndex;

    private Integer health;

    public Wall(Float x, Float y, Integer health, BufferedImage[] textures) {
        super(x, y);
        this.health = health;
        this.textures = textures;
        this.currentTextureIndex = 0;
    }

    public void lowerHealth(int value) {
        health -= value;
        // !
        currentTextureIndex += value;
    }

    @Override
    public BufferedImage getTexture() {
        return textures[currentTextureIndex];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wall wall = (Wall) o;
        return currentTextureIndex == wall.currentTextureIndex &&
                Arrays.equals(textures, wall.textures) &&
                Objects.equals(health, wall.health);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(currentTextureIndex, health);
        result = 31 * result + Arrays.hashCode(textures);
        return result;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "textures=" + Arrays.toString(textures) +
                ", currentTextureIndex=" + currentTextureIndex +
                ", health=" + health +
                '}';
    }
}
