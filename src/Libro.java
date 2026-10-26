import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private Double precio;
    private int anio;

    public Libro(String titulo, String autor, Double precio, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.anio = anio;
    }

    public Libro (){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String agregarLibro (ArrayList<Libro> libros, Libro nuevo) {
        libros.add(nuevo);
        return "Libro agregado correctamiente\n";

    }



}
