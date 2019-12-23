package ru.kpfu.itis.rodsher.tanchiki.models;

public enum GameStatus {
    CREATING, // на случай если игрок подключается не сразу
    WAITING_FOR_PLAYERS,
    GAME_STARTED,
    GAME_FINISHED,
    PLAYER_LEFT
}
