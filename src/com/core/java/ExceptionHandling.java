package com.core.java;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            testExceptions();
        }catch (/*FileNotFoundException |*/ IOException e){
            //FileNotfoundException is child class of IOException hence we cannot it catch it like above
            e = new IOException("My custom made");
            e.printStackTrace();
        }

        try {
            foo();
        } catch (IOException  e) {
            e = new IOException();
            e.printStackTrace();
        }catch(Exception e){
            e = new Exception("");
            e.printStackTrace();
        }

    }

    public static void testExceptions() throws IOException, FileNotFoundException {
        throw new IOException("Testing ioexception");
    }

    public static void foo() throws IOException{

    }


}
