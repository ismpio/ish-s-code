/**
 * TESTING USAGE OF GIT COMMIT123
 *
 */
package com.example;
import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
/**
This method reads elms directly from the command line. Run project helloworld.java from the command line
 and pass arguments by writing them right after the command
*/

        System.out.println("Number of Command Line Argument = "+args.length);

        for(int i = 0; i< args.length; i++) {
            System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
        }

    }
}
