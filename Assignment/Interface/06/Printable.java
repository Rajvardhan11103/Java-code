/* Problem 6: Printable Documents
Description: Create an interface Printable to represent different types of documents that can be 
printed.
Requirements:
1. Create an interface Printable with a method print().
2. Implement this interface in classes PDFDocument, WordDocument, and SpreadsheetDocument.
3. Each class should provide its own implementation of the print() method.
4. Implement a main method to create instances of each document type and demonstrate 
printing them. */ 


 
interface Printable {
    void print();
}


class PDFDocument implements Printable {
    @Override
    public void print() {
        System.out.println("Printing PDF document...");
    }
}

 
class WordDocument implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Word document...");
    }
}


class SpreadsheetDocument implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Spreadsheet document...");
    }
}

// Main class to demonstrate printing documents
class PrintableDocuments {
    public static void main(String[] args) {
         
        Printable pdf = new PDFDocument();
        Printable word = new WordDocument();
        Printable spreadsheet = new SpreadsheetDocument();

        
        pdf.print();
        word.print();
        spreadsheet.print();
    }
}
