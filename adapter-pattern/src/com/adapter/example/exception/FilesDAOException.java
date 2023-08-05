package com.adapter.example.exception;

import java.io.IOException;

public class FilesDAOException extends Exception {

    public FilesDAOException(String message) {
        super(message);
    }

    public FilesDAOException(String message, Throwable cause) {
        super(message, cause);
    }
}

