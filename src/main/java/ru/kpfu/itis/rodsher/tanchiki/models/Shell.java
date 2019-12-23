package ru.kpfu.itis.rodsher.tanchiki.models;

import java.awt.image.BufferedImage;
import java.util.Objects;

public class Shell extends AbstractEntity { //Снаряд...
    private BufferedImage texture;

    // Если текстура не тупо квадрат
    private Direction direction;

    private Player owner;

    public Shell(Float x, Float y, Direction direction, BufferedImage texture, Player player) {
        super(x, y);
    }

    @Override
    public BufferedImage getTexture() {
        return texture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shell shell = (Shell) o;
        return Objects.equals(texture, shell.texture) &&
                direction == shell.direction &&
                Objects.equals(owner, shell.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(texture, direction, owner);
    }

    @Override
    public String toString() {
        return "Shell{" +
                "texture=" + texture +
                ", direction=" + direction +
                ", owner=" + owner +
                '}';
    }
}
