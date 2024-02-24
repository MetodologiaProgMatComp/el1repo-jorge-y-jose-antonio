package Introduccion2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        Book book = new Book("Java para tontos", author, 29.99);
        assertEquals("Java para tontos", book.getName());
    }

    @Test
    void getAuthor() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        Book book = new Book("Java para tontos", author, 29.99);
        assertEquals(author, book.getAuthor());
    }

    @Test
    void getPrice() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        Book book = new Book("Java para tontos", author, 29.99);
        assertEquals(29.99, book.getPrice());
    }

    @Test
    void setPrice() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        Book book = new Book("Java para tontos", author, 29.99);

        book.setPrice(23.80);
        assertEquals(23.80, book.getPrice());
    }

    @Test
    void getQty() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        Book book = new Book("Java para tontos", author, 29.99);
        assertEquals(0, book.getQty()); //Porque se ha usado el contructor que pone qty=0 por defecto
    }

    @Test
    void setQty() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        Book book = new Book("Java para tontos", author, 29.99,5);

        book.setQty(23);
        assertEquals(23, book.getQty());
    }

    @Test
    void testToString() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        Book book = new Book("Java para tontos", author, 29.99,5);

        String StringEsperado = "Book[Name=Java para tontos, Author[Name=Guillermo, email=guille@gmail.com, gender=m], Price=29.99, Qty=5]";
        assertEquals(StringEsperado, book.toString());
    }

    @Test
    void getAuthorName() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        Book book = new Book("Java para tontos", author, 29.99,5);
        assertEquals("Guillermo", book.getAuthorName());
    }

    @Test
    void getAuthorEmail() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        Book book = new Book("Java para tontos", author, 29.99,5);
        assertEquals("guille@gmail.com", book.getAuthorEmail());
    }

    @Test
    void getAuthorGender() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        Book book = new Book("Java para tontos", author, 29.99,5);
        assertEquals('m', book.getAuthorGender());
    }
}