package main;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter something");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("You Entered: " + input);
        if(StringUtils.isNumeric(input)) {
            System.out.println(input + " is a number");
        } else {
            System.out.println(input + " is not a number");

        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));




    }
}
