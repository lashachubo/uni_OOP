public class MLSTtest{
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setName("OOP");
        book1.setAuthor("Maka");
        book1.setYear(2025);


        book2.setName("OOP");
        book2.setAuthor("Maka");
        book2.setYear(2025);    

        LMS lms = new LMS();
        lms.addBook(book1);
        lms.addBook(book2);

        lms.printInfo();
    }
}