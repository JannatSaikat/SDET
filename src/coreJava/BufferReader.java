package coreJava;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/alifnabila/eclipse-workspace/SDET/src/coreJava/read.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());


    }








}


