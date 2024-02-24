package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author author = new Author("Guillermo", "guille@gmail.com");
        assertEquals("Guillermo", author.getName());
    }

    @Test
    void getEmail() {
        Author author = new Author("Guillermo", "guille@gmail.com");
        assertEquals("guille@gmail.com", author.getEmail());
    }

    @Test
    void setEmail() {
        Author author = new Author("Guillermo", "guille@gmail.com");

        author.setEmail("nuevo@gmail.com");
        assertEquals("nuevo@gmail.com", author.getEmail());
    }

    @Test
    void testToString() {
        Author author = new Author("Guillermo", "guille@gmail.com");

        String StringEsperado = "Author[Name=Guillermo, email=guille@gmail.com]";
        assertEquals(StringEsperado, author.toString());
    }
}