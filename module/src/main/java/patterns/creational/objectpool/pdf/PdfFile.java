package patterns.creational.objectpool.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import patterns.creational.objectpool.abstraction.File;
import patterns.creational.objectpool.abstraction.FileUtilityInterface;

import java.awt.*;
import java.io.IOException;

public class PdfFile extends File implements FileUtilityInterface {
    private static final String EXTENSION = ".pdf";
    private final java.io.File file = new java.io.File("C:\\Users\\hp\\Downloads\\Demo\\design-patterns\\module\\src\\main\\java\\patterns\\creational\\objectpool\\pdf\\files\\file-");
    private PDDocument document;

    public PdfFile() {
        document = new PDDocument();
    }

    @Override
    public String getExtension() {
        return EXTENSION;
    }

    @Override
    public void newBlankFile(String fileName) {
        try {
            document.addPage(new PDPage());
            if (fileName != null) {
                document.save(file + fileName + EXTENSION);
            }
            document.close();
            System.out.println("New PDF FILE is created!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void newContentFile(String fileName, String content) {
        try {
            document.addPage(new PDPage());
            PDPageContentStream contentStream = new PDPageContentStream(document, document.getPage(0));
            contentStream.beginText();
            contentStream.newLineAtOffset(25, 400);
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 10);
            contentStream.setStrokingColor(Color.BLACK);
            contentStream.showText(content);

            contentStream.endText();
            contentStream.close();
            if (fileName != null) {
                document.save(file + fileName + EXTENSION);
            }
            document.close();
            System.out.println("File with content is created!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void reset() {
        PDPageTree pages = document.getPages();
        for (int i = 0; i < pages.getCount(); i++) {
            document.removePage(i);
        }
        document = new PDDocument();
        System.out.println("PDF POOL RESET");
    }
}
