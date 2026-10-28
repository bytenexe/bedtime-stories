package com.pluralsight;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class BedtimeStories {
    public static void main(String[] args) {

        try {
            // Prompt the user for the name of the story file
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which story would you like?: ");
            String fileName = scanner.nextLine().trim();

            String filePath = "src/main/resources/";
            String readFile = filePath + fileName;

            int line = 1;

            // Use a new BufferedReader
            BufferedReader bufReader = new BufferedReader(new FileReader(readFile));
            String input;

            // Read until here is no more data to be read
            while ((input = bufReader.readLine()) != null) {
                System.out.println(line + " " + input);
                line++;
            }
            // Close the stream and release the resources (?)
            bufReader.close();
        } catch (IOException e) {
            // Display stack track if no error
            e.printStackTrace();
        }

    }
}
