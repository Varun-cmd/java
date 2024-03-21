package org.example.web_annotations.beans;

public class book {
    private  int bookid;
    private String bookName;
    private String desc;

    public book(int bookid, String bookName, String desc) {
        this.bookid = bookid;
        this.bookName = bookName;
        this.desc = desc;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }



}
