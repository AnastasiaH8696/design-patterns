package com.adapter.example;

import com.adapter.example.exception.FilesDAOException;

public class SimpleFilesDAOAdapter implements IFilesDAO {
    ISimpleFilesDAO simpleFilesDAO;

    public SimpleFilesDAOAdapter(ISimpleFilesDAO simpleFilesDAO) {
        this.simpleFilesDAO = simpleFilesDAO;
    }

    @Override
    public void writeIntToFile(String filename, int number) throws FilesDAOException {
        this.simpleFilesDAO.writeIntegerToFile(filename, number);
    }

    @Override
    public int readIntFromFile(String filename) throws FilesDAOException {
        return this.simpleFilesDAO.readIntegerFromFile(filename);
    }

    @Override
    public void copyIntegerFromFileToFile(String filename1, String filename2) throws FilesDAOException {
        int num = this.readIntFromFile(filename1);
        this.writeIntToFile(filename2, num);
    }
}
