package ru.kpfu.itis.rodsher.tanchiki.models;

import java.util.Objects;

public class Player {
    private String name;
    //Какие либо еще персональные настройки типо бонусов и т.п.

    // для более быстрого доступа (можно в принципе проверять через здоровья танка, но это на случай если победа будет не по смертям)
    private boolean winner;

    public Player(String name) {
        this.name = name;
        winner = false;
    }

    public String getName() {
        return name;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setAsWinner() {
        winner = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return winner == player.winner &&
                Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, winner);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", winner=" + winner +
                '}';
    }
}
