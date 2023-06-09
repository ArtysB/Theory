package com.java.baltrukartyom.javacore.Rps;

import java.util.Scanner;
import java.util.Random;

import static com.java.baltrukartyom.javacore.Rps.Field.Figure.*;


public class GameLogic extends Field {
    Random random = new Random();
    private final Field field = new Field();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        Figure f1 = getFirstPlayerFigure();
        Figure f2 = getSecondPlayerFigure();
        field.setF1(f1);
        field.setF2(f2);
        checkWinner();
    }

    private String checkWinner() {
        if (getFirstPlayerFigure() == getSecondPlayerFigure()) {
            return "tie";
        } else if (getFirstPlayerFigure().equals(ROCK) && getSecondPlayerFigure().equals(SCISSORS)) {
            return "user win";
        } else if (getFirstPlayerFigure().equals(PAPER) && getSecondPlayerFigure().equals(ROCK)) {
            return "userwin";
        } else if (getFirstPlayerFigure().equals(SCISSORS) && getSecondPlayerFigure().equals(PAPER)) {
            return "user won";
        } else
            return "computer won";
    }



    private Figure getFirstPlayerFigure() {
        System.out.println("Игрок выберите фигуру: К=КАМЕНЬ, Б=БУМАГА, Н=НОЖНИЦЫ");
        char playerMove = scanner.nextLine().toUpperCase().charAt(0);
        switch (playerMove) {
            case 'К':
                return ROCK;
            case 'Б':
                return PAPER;
            case 'Н':
                return SCISSORS;
        }
        System.out.println("Некоректный ввод попробуйте снова");
        return getFirstPlayerFigure();
    }


    private Figure getSecondPlayerFigure() {
        int ComputerMove = random.nextInt(3) + 1;
        switch (ComputerMove){
            case 1:
                return ROCK;
            case 2:
                return PAPER;
        }
        return SCISSORS;
    }
}
