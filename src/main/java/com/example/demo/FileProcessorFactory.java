package com.example.demo;

import com.example.demo.util.ProcessTypeEnum;

public class FileProcessorFactory {

    public static FileProcessor createFileProcessor(ProcessTypeEnum processTypeEnum, String fileType) {
        switch (processTypeEnum) {
            case CUSTOMER_CONTACT:
                switch (fileType) {
                    case "csv":
                        return new CustomerContactCsvFileProcessor();
                    case "excel":
                        return new CustomerContactExcelFileProcessor();
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported combination of functionality and file type");
    }
}
