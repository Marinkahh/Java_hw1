package Seminar1.hw1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String str = scanner.nextLine();
        String[] array=str.split(" ");
        for (int i = array.length; i > 0 ; i--) {
            System.out.print(array[i-1] +' ');;
        }

    }


}
