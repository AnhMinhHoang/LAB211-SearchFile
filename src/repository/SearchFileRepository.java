/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import data_access.SearchFileDAO;
import model.FileData;

/**
 *
 * @author GoldCandy
 */
public class SearchFileRepository implements ISearchFileRepository {

    @Override
    public void countWord(FileData data) {
        SearchFileDAO.Instance().countWord(data);
    }

    @Override
    public void findFileByWord(FileData data) {
        SearchFileDAO.Instance().findFileByWord(data);
    }
}
