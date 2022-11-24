package de.hfu;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Bitte eingeben: ");
        Scanner scanner = new Scanner(System.in);
        String eingabeText = scanner.next();
        System.out.println(eingabeText.toUpperCase());
    }
}
