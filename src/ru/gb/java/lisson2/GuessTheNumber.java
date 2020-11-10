package ru.gb.java.lisson2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main (String[]args) {
        System.out.println(GuessTheNumber());
    }
        public static char[] GuessTheNumber() {
            Scanner input = new Scanner(System.in);
            Random numbers = new Random();
            int try3 = 0;
            int random = numbers.nextInt(9);
            System.out.println("Угадайте число, у вас три попытки!)");
            while (try3 < 3) {
                System.out.println("введи от 0 до 9: ");
                int number = input.nextInt();
                if (number > random) {
                    System.out.println("Загаданное число меньше):");
                } else if (number < random) {
                    System.out.println("Загаданное число больше):");
                } else if (number == random) {
                    System.out.println("Ты отгадал!");
                }
                try3++;
            }
            System.out.println("Ваши попытки закончились. Начать игру заново? Да? жми 1; Нет? нажми 0:");
            String userData = input.next();
            if (userData.equals("1")) {
                main(null);
            }
            return new char[0];
        }
    }
