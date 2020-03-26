package lesson1.part1;

public class DocumentEx4 {

    String title;
    String content;

    public DocumentEx4(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public DocumentEx4(String content) {
//        this.content = content;
        this("Unknown", content);
    }

    void printInfo() {
        System.out.println(title + System.lineSeparator() + content);
    }




    /* ---------------------------------- */
    public static void main(String[] args) {
        DocumentEx4 document1 = new DocumentEx4("document1", "Content of document1");
        document1.printInfo();

        DocumentEx4 document2 = new DocumentEx4("Content of document2");
        document2.printInfo();
    }
}


