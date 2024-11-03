package org.example.creational.factory;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WordDocument implements Document {
    private final String filePath;

    public WordDocument(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void open() {
        System.out.println("Opening Word document at " + filePath);
        // Opening logic can be implemented here if needed
    }

    @Override
    public void save(String content) throws IOException {
        // Create a blank document
        XWPFDocument document = new XWPFDocument();

        // Create a new paragraph in the document
        XWPFParagraph paragraph = document.createParagraph();
        paragraph.createRun().setText(content); // Add content to the paragraph

        // Write the document to the specified file
        try (FileOutputStream out = new FileOutputStream(new File(filePath))) {
            document.write(out);
        }

        // Close the document
        document.close();
        System.out.println("Word document saved at " + filePath);
    }

    @Override
    public void delete() {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("Word document deleted at " + filePath);
        } else {
            System.out.println("Failed to delete Word document at " + filePath);
        }
    }
}
