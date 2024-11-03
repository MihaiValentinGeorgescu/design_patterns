package org.example.creational.factory;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public interface Document {
    void open();
    void save(String content) throws IOException;
    void delete();
}

