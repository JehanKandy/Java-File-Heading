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
        try{
            FileReader fr = new FileReader("readfile.txt");
            
            FileWriter fw = new FileWriter("outfile.txt");
            
            String str = "";
 
            int i;
            
            while ((i = fr.read()) != -1) {
                str += (char)i;
            }
            
            System.out.println(str);
            
            fw.write(str);
            
            fr.close();
            fw.close();
            
            System.out.println("file Read and Write Done");
        }
        catch(IOException e){
            System.out.println("Error in File Headling");
        }
            
    }
}
