package ru.kpfu.itis.rodsher.tanchiki.models;

import javax.swing.text.html.parser.Entity;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Field {
    //Предполагаемый размер 16x16
    private Floor[][] floorCells;
    private List<AbstractEntity> entities;

    public Field(int fieldWidth, int fieldHeight) {
        entities = new ArrayList<>();
        floorCells = new Floor[fieldWidth][fieldHeight];
        for(int i = 0; i < fieldWidth; i++) {
            for(int j = 0; j < fieldHeight; j++) {
                floorCells[i][j] = new Floor(null);
            }
        }
    }



    public void addEntity(AbstractEntity entity) {
        floorCells[Math.round(entity.getX())][Math.round(entity.getY())].setEntity(entity);
        entities.add(entity);
    }

    public Floor[][] getFloorCells() {
        return floorCells;
    }

    //Получить любую сущность
    public void getEntity(Float x, Float y) {

    }

    public List<AbstractEntity> getEntities() {
        return entities;
    }

    //Получить танк по игроку
    public Tank getTankByPlayer(Player player) {
        for(AbstractEntity e : entities) {
            if(e instanceof Tank) {
                if(((Tank)e).getOwner() != null) {
                    if(((Tank)e).getOwner().equals(player)) {
                        return (Tank) e;
                    }
                }
            }
        }
        return null;
    }

    public void setFloorCells(Floor[][] floorCells) {
        this.floorCells = floorCells;
    }
}
