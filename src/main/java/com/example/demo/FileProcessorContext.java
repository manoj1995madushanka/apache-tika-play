package com.example.demo;

public class FileProcessorContext {
    private FileProcessor fileProcessor;

    public void setFileProcessor(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }

    public void processFile(String filePath) {
        fileProcessor.processFile(filePath);
    }
}
