package ru.kpfu.itis.rodsher.tanchiki.models;

import java.awt.image.BufferedImage;

public class FieldGenerator {
    public static Field generateStaticField(Integer wallHealth, BufferedImage floorTexturePath, BufferedImage[] wallTextures) {
        Field field = new Field(16,16);
//Пол
        Floor[][] floors = new Floor[16][16];
        for(int i = 0; i < 16; i++) {
            for(int j = 0; j < 16; j++) {
                floors[i][j] = new Floor(floorTexturePath);
            }
        }
//Стены
        for(int i = 1; i < 15; i++) {
            for(int j = 1; j < 15; j++) {
                if(i == 1 || i == 14) {
                    if(j != 1 && j != 2 && j != 5 && j != 10 && j != 13 && j !=14) {
                        Wall wall = new Wall((float) i, (float) j, wallHealth, wallTextures);
                        floors[i][j].setEntity(wall);
                        field.addEntity(wall);
                    }
                    continue;
                }
                if(i == 2 || i == 13) {
                    if(j == 4 || j == 6 || j == 9 || j == 11) {
                        Wall wall = new Wall((float) i, (float) j, wallHealth, wallTextures);
                        floors[i][j].setEntity(wall);
                        field.addEntity(wall);
                    }
                    continue;
                }
                if(i == 3 || i == 7 || i == 8 || i == 12) {
                    if(j == 1 || j == 4 || j == 6 || j == 9 || j == 11 || j == 14) {
                        Wall wall = new Wall((float) i, (float) j, wallHealth, wallTextures);
                        floors[i][j].setEntity(wall);
                        field.addEntity(wall);
                    }
                    continue;
                }
                if(i == 4 || i == 6 || i == 9 || i == 11) {
                    if(j != 5 && j != 10) {
                        Wall wall = new Wall((float) i, (float) j, wallHealth, wallTextures);
                        floors[i][j].setEntity(wall);
                        field.addEntity(wall);
                    }
                }
            }
        }
        field.setFloorCells(floors);
        return field;
    }
}
