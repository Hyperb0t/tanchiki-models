package ru.kpfu.itis.rodsher.tanchiki.models;

import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Objects;

public class Tank extends AbstractEntity {
    // Так же как и у стены
    private BufferedImage[] textures;
    private int currentTextureIndex;

    private Integer health;

    private Direction direction;

    private Player owner;

    public Tank(Float x, Float y, Integer health, Direction direction, BufferedImage[] textures, Player player) {
        super(x, y);
        this.textures = textures;
        this.direction = direction;
        setCurrentTextureIndex(health, direction);
        this.owner = player;
    }

    private void setCurrentTextureIndex(Integer health, Direction direction) {
        if(direction.equals(Direction.UP)) {
            currentTextureIndex = 0;
        }
        else if(direction.equals(Direction.DOWN)) {
            currentTextureIndex = 1;
        }
        else if(direction.equals(Direction.LEFT)) {
            currentTextureIndex = 2;
        }
        else if(direction.equals(Direction.RIGHT)) {
            currentTextureIndex = 3;
        }
    }

    public void lowerHealth(int value) {
        health -= value;
        setCurrentTextureIndex(health, direction);
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
        setCurrentTextureIndex(health, direction);
    }

    public Direction getDirection() {
        return direction;
    }

    public Player getOwner() {
        return owner;
    }

    public void setCoordinatesWithoutDirection(Float x, Float y) {
        // Определение Direction - super.getX(), super.getY() и их сравнение
        setCurrentTextureIndex(health, direction);
    }

    @Override
    public BufferedImage getTexture() {
        return textures[currentTextureIndex];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tank tank = (Tank) o;
        return currentTextureIndex == tank.currentTextureIndex &&
                Arrays.equals(textures, tank.textures) &&
                Objects.equals(health, tank.health) &&
                direction == tank.direction &&
                Objects.equals(owner, tank.owner);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(currentTextureIndex, health, direction, owner);
        result = 31 * result + Arrays.hashCode(textures);
        return result;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "textures=" + Arrays.toString(textures) +
                ", currentTextureIndex=" + currentTextureIndex +
                ", health=" + health +
                ", direction=" + direction +
                ", owner=" + owner +
                '}';
    }
}
