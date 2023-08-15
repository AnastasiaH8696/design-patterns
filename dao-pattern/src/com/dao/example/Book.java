package com.dao.example;

public class Book {
    private final int id;
    private String name;
    private String authorName;
    private int authorId;
    private int count;

    public Book(int id, String name, String authorName, int authorId, int count) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.authorId = authorId;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorId=" + authorId +
                ", count=" + count +
                '}';
    }
}

