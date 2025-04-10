public class LMS{
    private List<book> books = new ArrayList<>();

    public void addBook(Book b){
        books.add(b);
    }

    public void removeBook(Book b){
        books.remove(b);
    }

    public void printInfo(){
        for (Book b: books){
            System.out.println("Name: " + b.getName() + "; Author: " + b.getAuthor() + "; Year: " + b.getYear())
        }
    }
}