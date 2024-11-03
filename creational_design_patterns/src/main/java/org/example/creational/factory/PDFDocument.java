package org.example.creational.factory;

import java.io.IOException;

public class PDFDocument implements Document {
    private final PDFManager pdfManager;
    private final String filePath;

    public PDFDocument(String filePath) {
        this.filePath = filePath;
        this.pdfManager = new PDFManager();
    }

    @Override
    public void open() {
        System.out.println("Opening PDF document at " + filePath);
        // Opening logic if needed
    }

    @Override
    public void save(String content) throws IOException {
        pdfManager.createPDF(filePath, content);
    }

    @Override
    public void delete() {
        pdfManager.deletePDF(filePath);
    }
}
