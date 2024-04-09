public class Book {

    String authar;
    int publicationYear;
    String Genre;
    String BookName;
    double Price;

    Book(){

    }

    Book(String authar,int publicationYear,String Genre,String BookName,double Price){

        this.authar=authar;
        this.publicationYear=publicationYear;
        this.BookName=BookName;
        this.Genre=Genre;
        this.Price=Price;

    }
    public void PrintValues(){

        System.out.println("Name of the book is:"+BookName);
        System.out.println("Publication Year:"+publicationYear);
        System.out.println("Genre:"+Genre);
        System.out.println("Name of authar:"+authar);


    }



}
