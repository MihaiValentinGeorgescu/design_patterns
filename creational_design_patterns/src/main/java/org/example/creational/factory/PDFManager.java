package org.example.creational.factory;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PDFManager {

    // Method to create a new PDF file with initial content
    public void createPDF(String filePath, String content) throws IOException {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
            Chunk chunk = new Chunk(content, font);
            document.add(chunk);
            System.out.println("PDF created successfully at " + filePath);
        } catch (DocumentException e) {
            throw new IOException("Error creating PDF", e);
        } finally {
            document.close();
        }
    }

    // Method to edit an existing PDF by adding new content
    public void editPDF(String filePath, String additionalContent) throws IOException {
        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath, true));
            document.open();
            Font font = FontFactory.getFont(FontFactory.COURIER, 12, BaseColor.BLACK);
            Chunk chunk = new Chunk(additionalContent, font);
            document.add(chunk);
            document.close();
            writer.close();
            System.out.println("PDF edited successfully at " + filePath);
        } catch (DocumentException e) {
            throw new IOException("Error editing PDF", e);
        }
    }

    // Method to delete an existing PDF file
    public void deletePDF(String filePath) {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("PDF deleted successfully at " + filePath);
        } else {
            System.out.println("Failed to delete the PDF at " + filePath);
        }
    }
}
