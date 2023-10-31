/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import model.FileData;

/**
 *
 * @author GoldCandy
 */
public interface ISearchFileRepository {

    void countWord(FileData data);

    void findFileByWord(FileData data);

}
