package Introduccion2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        assertEquals("Guillermo", author.getName());
    }

    @Test
    void getEmail() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        assertEquals("guille@gmail.com", author.getEmail());
    }

    @Test
    void setEmail() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        assertEquals("guille@gmail.com", author.getEmail());

        author.setEmail("nuevoemail@gmail.com");
        assertEquals("nuevoemail@gmail.com", author.getEmail());
    }

    @Test
    void getGender() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        assertEquals('m', author.getGender());
    }

    @Test
    void testToString() {
        Author author = new Author("Guillermo", "guille@gmail.com", 'm');
        String StringEsperado = "Author[Name=Guillermo, email=guille@gmail.com, gender=m]";
        assertEquals(StringEsperado, author.toString());
    }
}