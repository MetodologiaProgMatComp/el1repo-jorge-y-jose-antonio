package Introduccion2Mejorada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author[] authors = {
                new Author("Guillermo", "guille@gmail.com", 'm'),
                new Author("Angela", "angela@gmail.com", 'f')
        };
        Book book = new Book("Java para tontos", authors, 29.99);

        assertEquals("Java para tontos", book.getName());
    }

    @Test
    void getAuthors() {
        Author[] authors = {
                new Author("Guillermo", "guille@gmail.com", 'm'),
                new Author("Angela", "angela@gmail.com", 'f')
        };
        Book book = new Book("Java para tontos", authors, 29.99);

        assertArrayEquals(authors, book.getAuthors());
    }

    @Test
    void getPrice() {
        Author[] authors = {
                new Author("Guillermo", "guille@gmail.com", 'm'),
                new Author("Angela", "angela@gmail.com", 'f')
        };
        Book book = new Book("Java para tontos", authors, 29.99);

        assertEquals(29.99, book.getPrice());
    }

    @Test
    void setPrice() {
        Author[] authors = {
                new Author("Guillermo", "guille@gmail.com", 'm'),
                new Author("Angela", "angela@gmail.com", 'f')
        };
        Book book = new Book("Java para tontos", authors, 29.99);

        book.setPrice(23.80);
        assertEquals(23.80, book.getPrice());
    }

    @Test
    void getQty() {
        Author[] authors = {
                new Author("Guillermo", "guille@gmail.com", 'm'),
                new Author("Angela", "angela@gmail.com", 'f')
        };
        Book book = new Book("Java para tontos", authors, 29.99);

        assertEquals(0, book.getQty()); //Porque volvemos a usar el que pone 0 como predeterminado
    }

    @Test
    void setQty() {
        Author[] authors = {
                new Author("Guillermo", "guille@gmail.com", 'm'),
                new Author("Angela", "angela@gmail.com", 'f')
        };
        Book book = new Book("Java para tontos", authors, 29.99,5);

        book.setQty(23);
        assertEquals(23, book.getQty());
    }

    @Test
    void testToString() {
        Author[] authors = {
                new Author("Guillermo", "guille@gmail.com", 'm'),
                new Author("Angela", "angela@gmail.com", 'f')
        };
        Book book = new Book("Java para tontos", authors, 29.99,5);
        String StringEsperado = "Book[Name=Java para tontos, Authors={Author[Name=Guillermo, email=guille@gmail.com, gender=m], Author[Name=Angela, email=angela@gmail.com, gender=f]}, Price=29.99, Qty=5]";
        assertEquals(StringEsperado, book.toString());
    }

    @Test
    void getAuthorNames() {
        Author[] authors = {
                new Author("Guillermo", "guille@gmail.com", 'm'),
                new Author("Angela", "angela@gmail.com", 'f')
        };
        Book book = new Book("Java para tontos", authors, 29.99);

        assertEquals("Guillermo, Angela", book.getAuthorNames());
    }
}