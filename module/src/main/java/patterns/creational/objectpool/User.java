package patterns.creational.objectpool;

import patterns.creational.objectpool.pdf.PdfFile;
import patterns.creational.objectpool.txt.TxtFile;

public class User {
    private static PdfFile pdfFile = new PdfFile();
    private static TxtFile txtFile = new TxtFile();

    private static final int POOL_SIZE = 10;

    private static final ObjectPool<PdfFile> PDF_POOL = new ObjectPool<>(() -> pdfFile, POOL_SIZE);
    private static final ObjectPool<TxtFile> TXT_POOL = new ObjectPool<>(() -> txtFile, POOL_SIZE);

    private static String CONTENT = "contents are written.";

    public static void main(String[] args) {
        PdfFile emptyPdfCreator = PDF_POOL.get();
        emptyPdfCreator.newBlankFile("empty-1");
        emptyPdfCreator.reset();
        emptyPdfCreator.newBlankFile("empty-2");
        emptyPdfCreator.reset();

        PdfFile contentPdfCreator = PDF_POOL.get();
        contentPdfCreator.newContentFile("content-1", CONTENT);
        contentPdfCreator.reset();
        contentPdfCreator.newContentFile("content-2", CONTENT);
        contentPdfCreator.reset();

        PDF_POOL.destroy("module/src/main/java/patterns/creational/objectpool/pdf/files/file-empty-pdf-2.pdf");

        PDF_POOL.release(emptyPdfCreator);
        PDF_POOL.release(contentPdfCreator);


        TxtFile blankTxtCreator = TXT_POOL.get();
        blankTxtCreator.newBlankFile("blank-1");
        blankTxtCreator.reset();
        blankTxtCreator.newBlankFile("blank-2");
        blankTxtCreator.reset();

        TxtFile contentTxtCreator = TXT_POOL.get();
        contentTxtCreator.newContentFile("content-1", CONTENT);
        contentTxtCreator.reset();
        contentTxtCreator.newContentFile("content-2", CONTENT);
        contentTxtCreator.reset();

        TXT_POOL.release(blankTxtCreator);
        TXT_POOL.release(contentTxtCreator);
    }
}
