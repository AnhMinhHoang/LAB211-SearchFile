/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.FileData;
import repository.SearchFileRepository;
import view.Menu;

/**
 *
 * @author GoldCandy
 */
public class SearchFileController extends Menu {

    protected static String[] mc = {"Count Word in File",
        "Find File By Word", "Exit"};
    protected FileData data;
    protected SearchFileRepository repo;
    
    public SearchFileController() {
        super("============ Word Program =========", mc);
        repo = new SearchFileRepository();
        data = new FileData();
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("-------- Count Word --------");
                repo.countWord(data);
                break;
            }
            case 2: {
                System.out.println("-------- Find File By Word --------");
                repo.findFileByWord(data);
                break;
            }
            case 3: {
                System.out.println("EXIT...");
                System.exit(0);
            }
            default: {
                System.out.println("No such choice!");
            }
        }
    }
}
