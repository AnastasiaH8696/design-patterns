package com.adapter.example;

import com.adapter.example.exception.FilesDAOException;

public interface ISimpleFilesDAO
{
    public void writeIntegerToFile(String filename, int number) throws FilesDAOException;
    public int readIntegerFromFile(String filename) throws FilesDAOException;
}
