package io.project.app.wordcount;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ackage com.kscodes.test;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/**
 *
 * @author suzy
 */
public class ReadDocUsingPOI {

    public static void main(String args[]) {

        XWPFDocument document = null;
        FileInputStream fileInputStream = null;
        try {

            File fileToBeRead = new File("/home/suzy/JavaCourse/WordCount/createdocument.docx");
            fileInputStream = new FileInputStream(fileToBeRead);
            document = new XWPFDocument(fileInputStream);
            XWPFWordExtractor extractor = new XWPFWordExtractor(document);

            System.out.println("The Contents of the Word File are ::");
            System.out.println("--------------------------------------");
            String myText = extractor.getText();
            System.out.println(myText);
            
            
            //System.out.println(typeof(extractor.getText()));
            

        } catch (Exception e) {
            System.out.println("We had an error while reading the Word Doc");
        } finally {
            try {
                if (document != null) {
                    document.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception ex) {
            }
        }

    }

    private static boolean typeof(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
