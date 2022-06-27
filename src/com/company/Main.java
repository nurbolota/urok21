package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            FileWriter Filewriter=new FileWriter("alvavit");
            for (char i = 'A'; i <='Z'; i++) {
                for (char j = 'a'; j <='z' ; j++) {
                   if((j-i)==32){
                       Filewriter.append(i+" "+j+"\n");
                   }

                }

            }
            for (char i = 0; i <='9' ; i++) {
                Filewriter.append(i+"\n");

            }Filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader(" alfavit ");
            Scanner scanner = new Scanner(fileReader);
            int count=1;
            while (scanner.hasNextLine()) {
                System.out.println(count+") "+scanner.nextLine());
                count++;

            }
        } catch (IOException e) {
            e.printStackTrace();
    }
}}
