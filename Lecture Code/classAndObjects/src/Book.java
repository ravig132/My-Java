public class Book {
    static int totalNoOfBooks ;
    String author ;
    String title  ;
    String isbn ;
    boolean isBorrowed ;


    static{
        totalNoOfBooks = 0 ;
    }
    {
        totalNoOfBooks++ ;
    }

    Book(String isbn ,String title ,String author   ){
        this.isbn = isbn ;
        this.title = title ;
        this.author = author ;
    }
    Book(String isbn ){
        this(isbn , "unknown" ,"unknown");
    }

    static int getTotalNoOfBooks (){
        return totalNoOfBooks ;
    }

    void borrowBook (){
        if (isBorrowed){
            System.out.println("Book is already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("Enjoy "+this.title);
        }
    }

    void returnBook(){
        if (isBorrowed){
            isBorrowed = false ;
            System.out.println("Hope you enjoyed the book");
        } else {
            System.out.println("This book is in library");
        }

    }



    public static void main (String [] args){
        Book Hindi = new Book("AB45C", "Hindi Vardmala", "Ravi Kant");
        Book Maths = new Book("AR46V");
        Book Language  = new Book ("BY12H");

        System.out.println(getTotalNoOfBooks());

        Hindi.borrowBook();
        Maths.returnBook();
        Language.borrowBook();

        Hindi.returnBook();
        Language.returnBook();



    }


}
