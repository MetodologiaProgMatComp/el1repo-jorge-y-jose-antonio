package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2Composicion.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author author = new Author("Guillermo", "guille@gmail.com");
        assertEquals("Guillermo", author.getName());
        Book book = new Book("123456789", "Java para tontos", author, 29.99);

        assertEquals("123456789", book.getIsbn());
    }

    @Test
    void getName() {
        Author author = new Author("Guillermo", "guille@gmail.com");
        assertEquals("Guillermo", author.getName());
        Book book = new Book("123456789", "Java para tontos", author, 29.99);

        assertEquals("Java para tontos", book.getName());
    }

    @Test
    void getAuthor() {
        Author author = new Author("Guillermo", "guille@gmail.com");
        assertEquals("Guillermo", author.getName());
        Book book = new Book("123456789", "Java para tontos", author, 29.99);

        assertEquals(author, book.getAuthor());
    }

    @Test
    void getPrice() {
        Author author = new Author("Guillermo", "guille@gmail.com");
        assertEquals("Guillermo", author.getName());
        Book book = new Book("123456789", "Java para tontos", author, 29.99);

        assertEquals(29.99, book.getPrice());
    }

    @Test
    void setPrice() {
        Author author = new Author("Guillermo", "guille@gmail.com");
        assertEquals("Guillermo", author.getName());
        Book book = new Book("123456789", "Java para tontos", author, 29.99);

        book.setPrice(23.80);
        assertEquals(23.80, book.getPrice());
    }

    @Test
    void getQty() {
        Author author = new Author("Guillermo", "guille@gmail.com");
        assertEquals("Guillermo", author.getName());
        Book book = new Book("123456789", "Java para tontos", author, 29.99);

        assertEquals(0, book.getQty()); //Cantidad por defecto es 0
    }

    @Test
    void setQty() {
        Author author = new Author("Guillermo", "guille@gmail.com");
        assertEquals("Guillermo", author.getName());
        Book book = new Book("123456789", "Java para tontos", author, 29.99,5);

        book.setQty(23);
        assertEquals(23, book.getQty());
    }

    @Test
    void getAuthorName() {
        Author author = new Author("Guillermo", "guille@gmail.com");
        assertEquals("Guillermo", author.getName());
        Book book = new Book("123456789", "Java para tontos", author, 29.99);

        assertEquals("Guillermo", book.getAuthorName());
    }

    @Test
    void testToString() {
        Author author = new Author("Guillermo", "guille@gmail.com");
        assertEquals("Guillermo", author.getName());
        Book book = new Book("123456789", "Java para tontos", author, 29.99,5);

        String StringEsperado = "Book[Isbn=123456789, Name=Java para tontos, Author[Name=Guillermo, email=guille@gmail.com], Price=29.99, Qty=5]";
        assertEquals(StringEsperado, book.toString());
    }
}