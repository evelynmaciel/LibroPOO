import java.util.Scanner;

public class MainLibro {
    public static void main(String[] args) {
        Scanner l1 = new Scanner(System.in);
System.out.println(" ingresa el autor");
String autor = l1.next();
System.out.println("ingresa el titulo");
String titulo = l1.next();
System.out.println("ingresa el ISBN");
int ISBN = l1.nextInt();
System.out.println("ingresa el numero de paginas que tiene el libro");
      int paginas = l1.nextInt();
      Libro Libro1 = new Libro();
      Libro1.autor= autor;
      Libro1.titulo= titulo;
      Libro1.ISBN = ISBN;
      Libro1.paginas = paginas;
      Libro1.mostrarautor();
      Libro1.mostrartitulo();
      Libro1.mostrarISBN();
      Libro1.mostrarpaginas(); 
    }
}
