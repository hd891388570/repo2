package com.itheima.demo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import  java.util.ArrayList;

class Book{
    boolean checkedOut = false;
    Book(boolean checkout){
        checkedOut = checkout;
    }
    void checkeIn(){
        checkedOut = false;
    }
    protected void finalize(){
        if (checkedOut)
            System.out.println("Error:checked out");
    }
}

public class ClassText2 {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkeIn();
        new Book(true);
        System.gc();
    }
}
