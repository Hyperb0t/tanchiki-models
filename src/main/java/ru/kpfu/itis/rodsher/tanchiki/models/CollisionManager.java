package ru.kpfu.itis.rodsher.tanchiki.models;

import java.awt.event.KeyEvent;

public class CollisionManager {
    public boolean canMove(GameState gameState, AbstractEntity entity, Direction direction, float speed) {
        if (direction.equals(Direction.UP)) {
            if((int)Math.floor(entity.getY() - speed) >= 0) {
                AbstractEntity entityNear = gameState.getField().getFloorCells()[Math.round(entity.getX())][(int) Math.floor(entity.getY() - speed)]
                        .getEntity();
                if(entityNear == null){
                    return true;
                }
                else {
                    return entityNear.equals(entity);
                }
            }else return false;
        } else if (direction.equals(Direction.DOWN)) {
            if((int)Math.ceil(entity.getY() + speed) < gameState.getField().getFloorCells()[0].length) {
                AbstractEntity entityNear = gameState.getField().getFloorCells()[Math.round(entity.getX())][(int) Math.ceil(entity.getY() + speed)]
                        .getEntity();
                if(entityNear == null) {
                    return true;
                }else {
                    return entityNear.equals(entity);
                }
            }else return false;
        } else if (direction.equals(Direction.LEFT)) {
            if((int)Math.floor(entity.getX() - speed) >= 0) {
                AbstractEntity entityNear = gameState.getField().getFloorCells()[(int) Math.floor(entity.getX() - speed)][Math.round(entity.getY())]
                        .getEntity();
                if(entityNear == null) {
                    return true;
                }
                else return entityNear.equals(entity);
            }else return false;
        } else if (direction.equals(Direction.RIGHT)) {
            if((int)Math.ceil(entity.getX() + speed) < gameState.getField().getFloorCells().length) {
                AbstractEntity entityNear = gameState.getField().getFloorCells()[(int) Math.ceil(entity.getX() + speed)][Math.round(entity.getY())]
                        .getEntity();
                if(entityNear == null) {
                    return true;
                } else return entityNear.equals(entity);
            } else return false;
        }
        else {
            return false;
        }
    }
}
