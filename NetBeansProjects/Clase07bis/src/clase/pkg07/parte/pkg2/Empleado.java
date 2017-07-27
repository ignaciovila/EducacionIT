/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg07.parte.pkg2;

/**
 *
 * @author educacionit
 */
public class Empleado {
    private int legajo;
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;

    public Empleado() {
    }

    public Empleado(int legajo, String nombre, String apellido, String direccion, int edad) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }

        /**
     * @return the legajo
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * @param legajo the legajo to set
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
