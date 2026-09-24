package retroalimentacion.parcial1;


public class RetroalimentacionParcial1 {

  
    public static void main(String[] args) {
        Empleado empleado1= new Empleado();
        empleado1.setNombre("Jhorjan");
        empleado1.setCargo("Programador");
        empleado1.setSalarioBase(40000000);
        empleado1.setAñosExperiencia(3);
        
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getCargo());
        System.out.println(empleado1.getSalarioBase());
        System.out.println(empleado1.getAñosExperiencia());
        
        empleado1.setNombre("Jhorjan");
        empleado1.setCargo("Programador");
         empleado1.setAñosExperiencia(3);
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getCargo());
        System.out.println(empleado1.getSalarioBase());
        System.out.println(empleado1.getAñosExperiencia());
        System.out.println(empleado1.verDetalle());
        System.out.println(empleado1.trabajar(5));
        System.out.println(empleado1.tomarDescanso(4));
        System.out.println(empleado1.trabajaryDescansar(6));
        System.out.println(empleado1.calcularBono(6));
        System.out.println(empleado1.calcularBono(3));
        System.out.println(empleado1.calculaSalarioTotal1(3, 5));
                
    
    }
    
    
}
