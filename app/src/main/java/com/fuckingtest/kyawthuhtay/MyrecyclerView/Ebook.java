package com.fuckingtest.kyawthuhtay.MyrecyclerView;

/**
 * Created by KyawThuHtay on 7/11/2016.
 */

public class Ebook {
    int id;
    String title;
    String author;

    public Ebook(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
