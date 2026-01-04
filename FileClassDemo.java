/*
 Program: Demonstration of File Class in Java
 Author : MCA Student
 Description: This program shows how to use File class methods.
*/

import java.io.File;
import java.io.IOException;

public class FileClassDemo {
    public static void main(String[] args) {
        try {
            // Create File object
            File file = new File("demo.txt");

            // Create new file (if it doesn't exist)
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // File Information
            System.out.println("Absolute Path : " + file.getAbsolutePath());
            System.out.println("Can Write?    : " + file.canWrite());
            System.out.println("Can Read?     : " + file.canRead());
            System.out.println("Is File?      : " + file.isFile());
            System.out.println("Is Directory? : " + file.isDirectory());
            System.out.println("File Size     : " + file.length() + " bytes");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
