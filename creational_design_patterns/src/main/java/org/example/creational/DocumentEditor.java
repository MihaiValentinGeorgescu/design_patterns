package org.example.creational;

import org.example.creational.factory.Document;
import org.example.creational.factory.DocumentFactory;

import java.io.IOException;

public class DocumentEditor {

    public void openDocument(String type) {
        Document doc = DocumentFactory.createDocument(type);
        doc.open();
    }

    public void saveDocument(String type, String content) {
        Document doc = DocumentFactory.createDocument(type);
        try {
            doc.save(content);
        } catch (IOException e) {
            System.out.println("Failed to save document: " + e.getMessage());
        }
    }

    public void deleteDocument(String type) {
        Document doc = DocumentFactory.createDocument(type);
        doc.delete();
    }

    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();

        // Open, save, and delete different types of documents
        editor.openDocument("PDF");
        editor.saveDocument("PDF", "This is the content of a PDF document.");
//        editor.deleteDocument("PDF");

        editor.openDocument("Word");
        editor.saveDocument("Word", "This is the content of a Word document.");
//        editor.deleteDocument("Word");

        editor.openDocument("HTML");
        editor.saveDocument("HTML", "<html><body>This is the content of an HTML document.</body></html>");
//        editor.deleteDocument("HTML");
    }
}
