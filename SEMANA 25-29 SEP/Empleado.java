
package retroalimentacion.parcial1;

/**
 *
 * @author prestamo
 */
public class Empleado {
    private String nombre;
    private String cargo;
    private double salarioBase;
    private int añosExperiencia;

    public Empleado() {
    }           

    public Empleado(String nombre, String cargo, double salarioBase, int añosExperiencia) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.añosExperiencia = añosExperiencia;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    public String verDetalle(){
        return " El empleado se llama" + this.nombre + "\nEl cargo del empleado" + this.cargo + "\nEl salario del empleado" + this.salarioBase + "\nEl empleado tiene años de experiencia " + this.añosExperiencia;
    }
    public String trabajar(int horas){
     return "El empleado llamado" + this.nombre + "\nTrabaja:" + horas;  
    }
    public String tomarDescanso(int Descanso){
       return "El empleado llamado" + this.nombre + "Toma horas de descanso" + Descanso; 
    }
    public String trabajaryDescansar (int horas){
        String traba = this.trabajar(horas);
        String descan = this.tomarDescanso(horas);
        return traba + descan;
    }
    
    }  
