/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fileheadlingjava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jehan
 */
public class FileHeadlingJAVA {

    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("readfile.text");
            
            FileWriter fw = new FileWriter("outfile.txt");
            
            String str = "";
            
            int i;
            
            while((i = fr.read()) != -1){
                str += (char)i;
            }
            
            System.out.println(str);
        }
        catch(IOException e){
            System.out.println("Error");
        }
            
    }
}
