package com.company;

public class Main {

    public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------
        int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < month.length; i++) {
            if(month[i] >= 3 & month[i] < 6) {System.out.println("Весна");}
            else if(month[i] >= 6 & month[i] < 9) {System.out.println("Лето");}
            else if(month[i] >= 9 & month[i] < 12) {System.out.println("Осень");}
            else {System.out.println("Зима");}
        }
//-----------------------------------------------------------------------------------------------
        for (int i = 0; i < month.length; i++) {
          switch (month[i]) {
              case 1:
                  System.out.println("Зима");
                  break;
              case 2:
                  System.out.println("Зима");
                  break;
              case 3:
                  System.out.println("Весна");
                  break;
              case 4:
                  System.out.println("Весна");
                  break;
              case 5:
                  System.out.println("Весна");
                  break;
              case 6:
                  System.out.println("Лето");
                  break;
              case 7:
                  System.out.println("Лето");
                  break;
              case 8:
                  System.out.println("Лето");
                  break;
              case 9:
                  System.out.println("Осень");
                  break;
              case 10:
                  System.out.println("Осень");
                  break;
              case 11:
                  System.out.println("Осень");
                  break;
              case 12:
                  System.out.println("Зима");
                  break;
              default:
                  System.out.println("Неизвестное число");
          }
        }
//-----------------------------------------------------------------------------------------------
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = (array.length-1); i >= 0; i--) {
           System.out.println(array[i]);
        }
//-----------------------------------------------------------------------------------------------
        int[][] squareArray = new int[2][3];
        squareArray[0][0] = 1;
        squareArray[0][1] = 2;
        squareArray[0][2] = 3;
        squareArray[1][0] = 4;
        squareArray[1][1] = 5;
        squareArray[1][2] = 6;

        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + "["+i+"]"+"["+j+"] ");
            }
            System.out.println();
        }
//-----------------------------------------------------------------------------------------------

    }
}

