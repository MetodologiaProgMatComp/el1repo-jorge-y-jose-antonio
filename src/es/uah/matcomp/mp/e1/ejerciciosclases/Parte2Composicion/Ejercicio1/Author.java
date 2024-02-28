package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2Composicion.Ejercicio1;

public class Author {

    private String name;
    private String email;

    public Author(String n,String e) {
        this.name = n;
        this.email = e;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author[Name=" + name + ", email=" + email + "]";
    }

}
