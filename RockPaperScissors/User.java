package com.java.baltrukartyom.javacore.RockPaperScissors;

import java.util.Scanner;

public class User extends RockPaperScissors {
    Scanner scanner;

    public User(){
        super();
        scanner = new Scanner(System.in);
    }
    public CHOICES getChoice(){
        System.out.println("Выберите вашу фигуру: К=КАМЕНЬ, Б=БУМАГА, Н=НОЖНИЦЫ");
        char userChoice = scanner.nextLine().toUpperCase().charAt(0);

        switch (userChoice){
            case 'К':
                return CHOICES.КАМЕНЬ;
            case 'Б':
                return CHOICES.БУМАГА;
            case 'Н':
                return CHOICES.НОЖНИЦЫ;
        }
        System.out.println("Некоректный ввод попробуйте снова");
        return getChoice();
    }
 }
