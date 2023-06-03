package com.java.baltrukartyom.javacore.RockPaperScissors;

import java.util.Random;

public class Computer extends RockPaperScissors {
    private Random random;

    public Computer(){
        super();
        random = new Random();
    }
    public CHOICES getChoice(){
        int choice = random.nextInt(3) + 1;
        switch (choice){
            case 1:
                return CHOICES.КАМЕНЬ;
            case 2:
                return CHOICES.БУМАГА;

        }
        return CHOICES.НОЖНИЦЫ;
    }
}
