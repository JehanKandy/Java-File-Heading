/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fileheadlingjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jehan
 */
public class FileHeadlingJAVA {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {
             
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write("\n"); // add a newline after each line
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
