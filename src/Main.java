import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Libro> libros = new ArrayList<>();

        Libro libro = new Libro();
        Libro libro1 = new Libro("titulo1", "autor1", 1.00, 1);
        Libro libro2 = new Libro("titulo2", "autor2", 2.00, 2);
        Libro libro3 = new Libro("titulo3", "autor3", 3.00, 3);
        Libro libro4 = new Libro("titulo4", "autor4", 4.00, 4);
        libros.addAll(libros libro1, libro2, libro3, libro4);
        String titulo;
        String autor;
        Double precio;
        int anio;


        System.out.println("Agregamos el libro. ya hay cargados ");
        System.out.println("Ingrese titulo\n");
        titulo = scanner.nextLine();
        System.out.println("ingrese autor\n");
        autor = scanner.nextLine();
        System.out.println("ingrese precio\n");
        precio = scanner.nextDouble();
        System.out.println("ingrese anio\n");
        anio = scanner.nextInt();

        System.out.println("comprobamos los datos...\n");
        if (titulo.isEmpty() || autor.isEmpty()|| precio <= 0.0 || anio > 2026){
            System.out.println("Datos erroneos");
        }else {
            System.out.println("datos correctos, procedemos a cargar el libro");
            String mensaje = libro.agregarLibro(libros, libro1);
            System.out.println(mensaje);
        }

        System.out.println("mostramos el invetario");

        System.out.println("vamos a eliminar un libro del inventario");







    }
}