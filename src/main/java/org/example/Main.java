package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("What is the speed of your car?");
        var speed = scanner.nextDouble();

        while (true) {
            System.out.println( "How long are you traveling?" );
            var time = scanner.nextDouble();

            if(time == 0)
                break;

            var distance = speed * time;

            System.out.println( "You traveled the distance during this time: " + distance );
        }
    }
}