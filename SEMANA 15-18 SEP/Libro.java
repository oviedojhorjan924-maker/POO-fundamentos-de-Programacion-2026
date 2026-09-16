
package sesion7;


public class Sesion7 {

    public static void main(String[] args) {
        Libro libro1 =new Libro();
        libro1.setTitulo("Luna de pluton");
        libro1.setAutor("Jose");
        libro1.setGenero("Fantasia");
        libro1.setNumPaginas(300);
        
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getGenero());
        
        
        System.out.println("\nDETALLE LIBRO");
        System.out.println(libro1.prestar("Jhoshua"));
        
        System.out.println(libro1.prestarYDevolver("Jhoshua"));
        System.out.println(libro1.calcularTiempoLectura(50, 2.6f));
        
        
        
    }
    
}
