package com.adapter.example;

import com.adapter.example.exception.FilesDAOException;

public interface IFilesDAO
{
    public void writeIntToFile(String filename, int number) throws FilesDAOException;
    public int readIntFromFile(String filename) throws FilesDAOException;
    public void copyIntegerFromFileToFile(String filename1, String filename2) throws FilesDAOException;
}
