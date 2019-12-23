package ru.kpfu.itis.rodsher.tanchiki.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameState {
    private Field field;

    // Статус самой игры
    private GameStatus currentGameStatus;

    //Карта допустимого здоровья ("tank":3, "wall":2) - чтобы каждый раз не прописывать новое значение
    private Map<String, Integer> healths;

    // Сначала можно для двух, если успеем то сразу на 4
    private List<Player> players;

    public GameState(int tankHealth) {
        players = new ArrayList<>();
        healths = new HashMap<>();
        healths.put("tank", tankHealth);
    }

    public GameState(int tankHealth, int wallHealth, int fieldWidth, int fieldHeight) {
        players = new ArrayList<>();
        healths = new HashMap<>();
        healths.put("tank", tankHealth);
        healths.put("wall", wallHealth);
        field = new Field(fieldWidth, fieldHeight);
    }

    public void addPlayer(String name) {
        //Логика добавления игрока - создание класса + добавление танка на поле
        Player player = new Player(name);
        // Tank tank = new Tank ...
        // field.addEntity(tank);
    }

    //Добавление игрока с уже заготовленными характеристиками - на случай если будут поля кроме имени(что хранятся на диске)
    public void addPlayer(Player player) {}

    //Вышел из игры
    public void removePlayer(Player player) {}

    // После этого уже менять поле
    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
