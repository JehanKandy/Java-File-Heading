/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fileheadlingjava;

import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
/**
 *
 * @author Jehan
 */
public class FileHeadlingJAVA {

    public static void main(String[] args) {
        try {
            File myObj = new File("readfile.txt");
            myObj.getAbsolutePath();
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
          }

    }
}
