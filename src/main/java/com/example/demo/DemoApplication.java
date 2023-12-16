package com.example.demo;

import com.example.demo.util.FileTypeDetector;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("File type is : " + FileTypeDetector.getFileType("username.csv"));
        System.out.println("File type is : " + FileTypeDetector.getFileType("username"));
        System.out.println("File type is : " + FileTypeDetector.getFileType("test.xlsx"));
        System.out.println("File type is : " + FileTypeDetector.getFileType("hgfhg"));
        System.out.println("File type is : " + FileTypeDetector.getFileType("test.txt"));

        // OUTPUTS
        /*
          File type is : text/csv
          File type is : application/octet-stream
          File type is : application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
          File type is : application/octet-stream
          File type is : text/plain
        * */
    }

}
