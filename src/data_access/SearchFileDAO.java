/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_access;

import common.Validation;
import java.io.File;
import model.FileData;

/**
 *
 * @author GoldCandy
 */
public class SearchFileDAO {

    private static SearchFileDAO instance = null;
    private final Validation valid = new Validation();

    public static SearchFileDAO Instance() {
        if (instance == null) {
            synchronized (SearchFileDAO.class) {
                if (instance == null) {
                    instance = new SearchFileDAO();
                }
            }
        }
        return instance;
    }

    public void countWord(FileData data) {
        String path = valid.inputString("Enter path");
        String word = valid.inputString("Enter Word");
        int bout = 0;
        int i = 0;
        StringBuilder str = data.openFile(path);
        if (str.isEmpty()) {
            System.out.println("File not found!");
            return;
        }
        while (str.toString().indexOf(word, i) > -1) {
            bout++;
            i = str.toString().indexOf(word, i) + 1;
        }
        System.out.println("Bout: " + bout);
    }

    public void findFileByWord(FileData data) {
        String path = valid.inputString("Enter path");
        String word = valid.inputString("Enter Word");
        int count = 0;
        File f = new File(path);
        File[] files = f.listFiles();
        if (files == null) {
            System.out.println("File not found!");
            return;
        }
        System.out.println("------------ File Name ------------");
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith("txt")) {
                StringBuilder str = data.openFile(path + "\\" + file.getName());
                if (str.toString().contains(word)) {
                    System.out.println(file.getName());
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Not found!");
        }
    }
}
