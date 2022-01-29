package com.company;

import java.lang.constant.Constable;
import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor + ' ';
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

    @Override
    public String toString() {
        return this.nameAuthor + " " + this.surnameAuthor;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author surnameAuthor2 = (Author) other;
        return surnameAuthor.equals(surnameAuthor2.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surnameAuthor);
    }
}
