package com.bayviewglen.LessonOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileSort {

       public static void main(String[] args) {
              String[] allWords = new String[1000];
              int wordCount = 0;
              
              try {
                     Scanner input = new Scanner(new File ("data.txt"));
                     
              }catch(FileNotFoundException e){
                     e.printStackTrace();
              }
              while (input.hasNext()){
                     String word = input.next();
                     allWords[wordCount] = word;
                     wordCount++;
              }
              
              String[] newArray = new String[wordCount];
              
              for (int x=0; x<wordCount; x++){
                     newArray[x] = allWords[x];
              }
              
              Arrays.sort(newArray);
              
              for(int a = wordCount - 1; a>=0; --a){
                     System.out.println(newArray[a]);
              }
              input.close();
                     
       
              
       }

}

