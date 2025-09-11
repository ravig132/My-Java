public class PC51bookClass {
    static int totalBooks ;
    String title ;
    String author ;
    String isbn ;
    boolean isBorrowed  ;


    static {
        totalBooks = 0 ;
    }
    {
        totalBooks++ ;
    }


    PC51bookClass (String isbn , String title ,String author){
        this.isbn = isbn ;
        this.title = title ;
        this.author = author ;
    }

    PC51bookClass(String isbn){
        this(isbn,"unknown","unknown");
    }


     public static int getTotalNoOfBooks(){
        return totalBooks ;
     }

     public void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is already Borrowed");
        }else{
            this.isBorrowed = true ;
            System.out.println("Enjoy the book");
        }

     }
     public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Hope you enjoyed the book ");
        } else {
            System.out.println("Book is already in the library");
        }
    }
     public static void main ( String [] args){
        PC51bookClass Hindi = new PC51bookClass("1234", "Manjri" , "Ravi Sharma");
        PC51bookClass English = new PC51bookClass("4567","Hornbill","AK CHutiya");
        int getTotalBooks = getTotalNoOfBooks();
        System.out.println(getTotalBooks);
        Hindi.borrowBook();
        English.borrowBook();
        Hindi.returnBook();
        Hindi.returnBook();
        English.returnBook();


     }


}
