package com.capinfo;

import java.io.*;
import java.util.List;


import com.opencsv.CSVReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String path = "/Users/justinhan/Desktop/MT_Apply.txt.gz";

        String charset = "gb18030";

        FileInputStream fileInputStream = new FileInputStream(path);

        Reader reader = new InputStreamReader(fileInputStream, charset);

        CSVReader csvReader = new CSVReader(reader);
        List<String[]> readAll = csvReader.readAll();
        for (String[] strings : readAll) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }
}
