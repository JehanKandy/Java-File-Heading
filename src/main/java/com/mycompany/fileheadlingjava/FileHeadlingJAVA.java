/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fileheadlingjava;

import java.io.*;
import java.util.*;

/**
 *
 * @author Jehan
 */
public class FileHeadlingJAVA {

    public static void main(String[] args) {
        try {
            File input = new File("input");
            File output = new File("output");
            Scanner sc = new Scanner(input);
            PrintWriter printer = new PrintWriter(output);
            while(sc.hasNextLine()) {
                String s = sc.nextLine();
                printer.write(s);
            }
        }
            catch(FileNotFoundException e) {
            System.err.println("File not found. Please scan in new file.");
        }
            
    }
}
