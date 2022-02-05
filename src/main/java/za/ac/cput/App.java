package za.ac.cput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Book b = new Book("Hog", 500);
        Book a = new Book("Chi", 250);
        Book c = new Book("pom", 100);

        System.out.println(b.checkout(5));
    }
}
