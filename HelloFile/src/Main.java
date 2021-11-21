/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import java.io.*;

/**
 * @author Lenovo
 */

public class Main {
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader("Hello.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);
    }
}

