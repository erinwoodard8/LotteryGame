package com.tts;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput = "";



        do {

            System.out.print("Enter the name of your favorite pet. ");
            String petName = input.next();

            System.out.println("Enter age of your favorite pet");
            int petAge = input.nextInt();

            System.out.println("What is your lucky number?");
            int luckyNum = input.nextInt();

            System.out.println("Do you have a favorite quarterback? If so what is their jersey number?");
            int jerseyNum = input.nextInt();

            System.out.println("What is two-digit model year of your car?");
            int carModel = input.nextInt();

            System.out.println("What is the first name of the your favorite actor or actress?");
            String faveAct = input.next();

            System.out.println("Enter a random number between 1 and 50.");
            int randomNum = input.nextInt();



            int magicBall = luckyNum * randomNum;
                if(magicBall > 75){
                    do{
                        magicBall = magicBall / 2;
                    } while(magicBall > 75);
                }

            int lottoNum1 = petName.charAt(2);

                if(lottoNum1 > 65){
                    do{
                        lottoNum1 = lottoNum1 / 2;
                    } while(lottoNum1 > 65);
                }


            int lottoNum2 = carModel + luckyNum;
                if(lottoNum2 > 65){
                    do{
                        lottoNum2 = lottoNum2 / 2;
                    } while(lottoNum2 > 65);
                }

            int lottNum3 = 42;


            int lottoNum4 = faveAct.charAt(0);
            if(lottoNum4 > 65){
                do{
                    lottoNum4 = lottoNum4 / 2;
                } while(lottoNum4 > 65);
            }


            int lottoNum5 = faveAct.charAt(faveAct.length() - 1);

                if(lottoNum5 > 65){
                    do{
                        lottoNum5 = lottoNum5 / 2;
                    } while(lottoNum5 > 65);
                }


            System.out.println("Lottery number:" + lottoNum1 + "," + lottoNum2 + "," + lottNum3 + "," + lottoNum4 + "," + lottoNum5);
            System.out.println("Magic ball:" + magicBall);
            System.out.println("Do you want to play again? No = n / Yes = y");

            userInput = input.next();

        } while(!userInput.equals("n"));
        



    }


}
