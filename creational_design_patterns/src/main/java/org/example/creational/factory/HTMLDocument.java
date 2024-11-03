package org.example.creational.factory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLDocument implements Document {
    private final String filePath;

    public HTMLDocument(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void open() {
        System.out.println("Opening HTML document at " + filePath);
    }

    @Override
    public void save(String content) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("HTML document saved at " + filePath);
        }
    }

    @Override
    public void delete() {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("HTML document deleted at " + filePath);
        } else {
            System.out.println("Failed to delete HTML document at " + filePath);
        }
    }
}
