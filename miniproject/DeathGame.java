package miniproject;

import java.util.Scanner;
import java.io.IOException;

public class DeathGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sysNum = (int)(Math.random()*100);
        int usrNum;
        int count = 0;
        do{
            System.out.print("Guess any number (1-100): ");
            usrNum = input.nextInt();
            if(sysNum == usrNum){
                System.out.println("yay! you guessed the number in " + count + " tries!");

                DelayedExecution();
            }

            else if(sysNum > usrNum){
                System.out.println("Your guess is too small! Try again, Haha!");
            }

            else{
                System.out.println("Your guess is too large! Try again, Haha!");
                }

            count ++;
        }while(usrNum >0);
    }

    // System Shuts Down!
    public static void ShutDown(){
        String shutdownCommand;
        String operatingSystem = System.getProperty("os.name");

        try {
            if (operatingSystem.toLowerCase().contains("windows")) {
                shutdownCommand = "shutdown.exe -s -t 0";
            } else if (operatingSystem.toLowerCase().contains("linux") || operatingSystem.toLowerCase().contains("mac")) {
                shutdownCommand = "shutdown -h now";
            } else {
                throw new UnsupportedOperationException("Unsupported operating system.");
            }

            Runtime.getRuntime().exec(shutdownCommand);
        } catch (IOException | UnsupportedOperationException e) {
            e.printStackTrace(System.out);
        }
    }

    //Delay
    public static void DelayedExecution(){
        System.out.println("Wait for 5 seconds to see a magic!");

        // Delay execution for 5 seconds
        try {
            Thread.sleep(5000); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
        ShutDown();
    }


}
