package com.java.baltrukartyom.javacore.RockPaperScissors;

public class GameLogic extends RockPaperScissors {
   private User user;
   private Computer computer;
   private CHOICES userChoice;
   private CHOICES computerChoice;
   private RESULT result;
   private int wins;
   private int loses;
   private int ties;

   public GameLogic(){
      super();
      user = new User();
      computer = new Computer();

   }
   public void play(){
      userChoice = user.getChoice();
      computerChoice = computer.getChoice();
      result = getResult();
      displayResults();
      stats();
   }
   public void displayStats(){
      System.out.println("Ты сыграл: " + (wins+loses+ties) + " раза");
      System.out.println("Ты победил: " + wins + " раза");
      System.out.println("Ты проиграл: " + loses + " раза");
      System.out.println("Сыграл в ничью: " + ties + " раза");
   }
   private void stats(){
      if (result == RESULT.ПОБЕДА){
         wins++;
      }else if (result == RESULT.ПОРАЖЕНИЕ){
         loses++;
      }else {
         ties++;
      }
   }
   private void displayResults(){
      switch (result){
         case ПОБЕДА :
            System.out.println(userChoice + " Победил " + computerChoice + ". Игрок победил");
            break;
         case ПОРАЖЕНИЕ:
            System.out.println(userChoice + " Проиграл " + computerChoice + ". Компьютер победил");
            break;
         case НИЧЬЯ:
            System.out.println(userChoice + " Ничья " + computerChoice + ". Это ничья");
      }
   }
   private RESULT getResult(){
      if (userChoice == computerChoice){
         return RESULT.НИЧЬЯ;
      }
      switch (userChoice){
         case КАМЕНЬ :
            return (computerChoice == CHOICES.НОЖНИЦЫ ? RESULT.ПОБЕДА : RESULT.ПОРАЖЕНИЕ);
         case БУМАГА:
            return (computerChoice == CHOICES.КАМЕНЬ ? RESULT.ПОБЕДА : RESULT.ПОРАЖЕНИЕ);
         case НОЖНИЦЫ:
            return (computerChoice == CHOICES.БУМАГА ? RESULT.ПОБЕДА : RESULT.ПОРАЖЕНИЕ);
      }
      return RESULT.ПОРАЖЕНИЕ;
   }
   }




