package com.tts;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner input = new Scanner(System.in);


        System.out.print("\nPlease enter your name: ");
        String userName = input.next();

        System.out.println("Hello " + userName );

        String continueOption;
        System.out.print("If you wish to continue, Enter yes/no:  ");
        String chooseOption = input.next();

        if(chooseOption.equals("yes") || chooseOption.equals("y")){
            do{
                System.out.print("Do you have a red car?(yes, no) : ");
                String redCar = input.next();

                System.out.print("What is the name of your favorite pet? ");
                String petName = input.next();

                System.out.print("What is the age of your favorite pet? ");
                int petAge = input.nextInt();

                System.out.print("What is your lucky number? ");
                int luckyNum = input.nextInt();

                System.out.print("Do they have a favorite quarterback?(yes/no): ");
                chooseOption = input.next();
                int jerseyNum = 0;
                if(chooseOption.equals("yes") || chooseOption.equals("y")){
                    System.out.println("What is your jersey number? ");
                    jerseyNum = input.nextInt();
                }

                System.out.print("What is two-digit model year of your car? ");
                int modelYear = input.nextInt();

                System.out.print("What is the first name of your favorite actor or actress? ");
                String actFirstName = input.next();

                System.out.print("Enter a random number between 1 and 50: ");
                int randomNum = input.nextInt();

                Random random = new Random();
                int magicBallNum;

                int random1 = random.nextInt(50);
                int random2 = random.nextInt(50);
                int random3 = random.nextInt(50);

                if((random.nextInt(2) == 1) && (jerseyNum != 0)){
                    //choose quarterback jersey number *or* their lucky number
                    magicBallNum = jerseyNum * random1;
                }else {
                    magicBallNum = luckyNum * random1;
                }

                while(magicBallNum > 75){

                    magicBallNum = magicBallNum - 75;
                }
                //generate other 5 number
                int num1, num2, num3, num4, num5;

                //Use the two digit model year of their car and add their lucky number to it.
                num1 = modelYear + luckyNum;
                //Checking the number are in range
                if(num1 > 65){
                    num1 -= 65;
                }
                if(num1 < 1){
                    num1 += 65;
                }

                //Use the random number between 1 and 50, subtracting one of the generated random numbers.
                num2 = random.nextInt(50) - random2;
                //Checking the number are in range
                if(num2 > 65){
                    num2 -= 65;
                }
                if(num2 < 1){
                    num2 += 65;
                }

                //Use the age of their favorite pet + their car model year.
                num3 = petAge + modelYear;
                //Checking the number are in range
                if(num3 > 65){
                    num3 -= 65;
                }
                if(num3 < 1){
                    num3 += 65;
                }

                //Favorite quarterback number + age of pet + lucky number.
                num4 = jerseyNum + petAge + luckyNum;
                //Checking the number are in range
                if(num4 > 65){
                    num4 -= 65;
                }
                if(num4 < 1){
                    num4 += 65;
                }

                //Convert the first letter of their favorite actor/actress to an integer and use that value.
                num5 = (int)actFirstName.charAt(0);
                //Checking the number are in range
                if(num5 > 65){
                    num5 -= 65;
                }
                if(num5 < 1){
                    num5 += 65;
                }

                System.out.print("\nLottery numbers: " + num1 + ", " + num2 + ", " + num3 + ", " + num4
                                    + ", " + num5 + " " + "Magic ball: " + magicBallNum);

                System.out.println("\nif you like to answer questions to generate another set of numbers,(yes/no)? ");
                continueOption = input.next();


            }while(continueOption.equals("yes"));

        }else{
            System.out.println("Please return later to complete the process.");
        }

        System.out.println("Thank you!");



    }
}
