package com.adapter.example;

import com.adapter.example.exception.FilesDAOException;

import java.io.*;

public class SimpleFilesDAO implements ISimpleFilesDAO {

    @Override
    public void writeIntegerToFile(String filename, int number) throws FilesDAOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(number);
        } catch (IOException e) {
            throw new FilesDAOException("Error writing to file: " + filename, e);
        }
    }

    @Override
    public int readIntegerFromFile(String filename) throws FilesDAOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            if (line != null) {
                return Integer.parseInt(line);
            } else {
                throw new FilesDAOException("File is empty: " + filename);
            }
        } catch (IOException | NumberFormatException e) {
            throw new FilesDAOException("Error reading from file: " + filename, e);
        }
    }
}

