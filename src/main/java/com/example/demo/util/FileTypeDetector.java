package com.example.demo.util;

import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

public final class FileTypeDetector {
    public static final Detector detector = new DefaultDetector();

    private FileTypeDetector(){

    }

    public static String getFileType(String filePath){
        try {
            Metadata metadata = new Metadata();
            metadata.set("resourceName", filePath);
            MediaType mediaType = detector.detect(null, metadata);

            // Get the file type from the detected media type
            return mediaType.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "Unknown";
        }
    }
}
