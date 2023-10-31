/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author GoldCandy
 */
public class FileData {
    public StringBuilder openFile(String filename){
        StringBuilder str = new StringBuilder();
        try{
            File f = new File(filename);
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                str.append(sc.nextLine());
            }
        }
        catch(FileNotFoundException e){
            return new StringBuilder();
        }
        return str;
    }
}
