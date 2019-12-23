package ru.kpfu.itis.rodsher.tanchiki.models;

import java.awt.event.KeyEvent;

public class CollisionManager {
    public boolean canMove(GameState gameState, AbstractEntity entity, Direction direction, float speed) {
        if (direction.equals(Direction.UP)) {
            return gameState.getField().getFloorCells()[Math.round(entity.getX())][(int)Math.floor(entity.getY() - speed)]
                    .getEntity() == null && (int)Math.floor(entity.getY() - speed) >= 0;
        } else if (direction.equals(Direction.DOWN)) {
            return gameState.getField().getFloorCells()[Math.round(entity.getX())][(int)Math.ceil(entity.getY() + speed)]
                    .getEntity() == null
                    && (int)Math.ceil(entity.getY() + speed) < gameState.getField().getFloorCells()[0].length;
        } else if (direction.equals(Direction.LEFT)) {
            return gameState.getField().getFloorCells()[(int)Math.floor(entity.getX() - speed)][Math.round(entity.getY())]
                    .getEntity() == null && (int)Math.floor(entity.getX() - speed) >= 0;
        } else if (direction.equals(Direction.RIGHT)) {
            return gameState.getField().getFloorCells()[(int)Math.ceil(entity.getX() + speed)][Math.round(entity.getY())]
                    .getEntity() == null
                    && (int)Math.ceil(entity.getX() + speed) < gameState.getField().getFloorCells().length;
        }
        else {
            return false;
        }
    }
}
