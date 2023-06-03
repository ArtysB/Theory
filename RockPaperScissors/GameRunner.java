package com.java.baltrukartyom.javacore.RockPaperScissors;

import java.util.Scanner;

public class GameRunner extends GameLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameLogic gameLogic = new GameLogic();
        char quit = ' ';

        while (quit != 'С'){
            gameLogic.play();
            System.out.println("Хочешь продолжить? Нажми любую кнопку для продолжения или 'С' для выхода из игры");
            quit = scanner.nextLine().toUpperCase().charAt(0);
        }
        scanner.close();
        gameLogic.displayStats();
    }
}
