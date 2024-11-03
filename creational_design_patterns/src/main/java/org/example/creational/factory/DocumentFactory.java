package org.example.creational.factory;

public class DocumentFactory {
    public static Document createDocument(String type) {
        switch (type) {
            case "PDF":
                return new PDFDocument("output.pdf");
            case "Word":
                return new WordDocument("output.docx");
            case "HTML":
                return new HTMLDocument("output.html");
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}
