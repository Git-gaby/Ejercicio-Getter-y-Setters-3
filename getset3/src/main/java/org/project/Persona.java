package org.project;

public class Persona {
    
    // Atributos (sin cambios)
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private char sexo;
    private int edad;
    private String direccion;
    
    // Constructores (sin cambios)
    
    public Persona() {
    }
    
    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.apellidoPaterno = persona.apellidoPaterno;
        this.apellidoMaterno = persona.apellidoMaterno;
        this.sexo = persona.sexo;
        this.edad = persona.edad;
        this.direccion = persona.direccion;
    }
    
    public Persona(String nom, String app, String apm, char sexo, int edad, String dir) {
        this.nombre = nom;
        this.apellidoPaterno = app;
        this.apellidoMaterno = apm;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = dir;
    }
    
    // --- NUEVAS FUNCIONES ---
    
    /**
     * Simula la generación de un código de identificación (ej. iniciales + edad).
     */
    public String generarCodigoIdentificacion() {
        if (nombre == null || apellidoPaterno == null) {
            return "Datos incompletos para generar ID";
        }
        
        // Tomamos la primera letra del apellido paterno, materno y nombre
        char inicialAP = apellidoPaterno.toUpperCase().charAt(0);
        char inicialAM = apellidoMaterno.toUpperCase().charAt(0);
        char inicialN = nombre.toUpperCase().charAt(0);
        
        // Combinamos y añadimos la edad
        return "" + inicialAP + inicialAM + inicialN + this.edad;
    }

    /**
     * Verifica si la persona tiene derecho a votar (edad >= 18).
     */
    public String verificarDerechoVoto() {
        if (this.edad >= 18) {
            return "HABILITADO para votar (Mayor de edad).";
        } else {
            return "NO HABILITADO para votar (Menor de edad).";
        }
    }
    
    // --- MÉTODOS EXISTENTES (Modificación de salida) ---
    
    public void mayorEdad() {
        if (this.edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
    
    /**
     * Retorna una cadena con el resumen de los datos de la persona, usando la nueva ID.
     */
    public String mostrarDatos() {
        return "---  RESUMEN DE FICHA PERSONAL ---\n" +
               "Código ID Simplificado: " + generarCodigoIdentificacion() + "\n" +
               "---------------------------------------\n" +
               "Nombre Completo: " + this.nombre + " " + this.apellidoPaterno + " " + this.apellidoMaterno + "\n" +
               "Sexo: " + this.sexo + "\n" +
               "Edad: " + this.edad + " años\n" +
               "Dirección: " + this.direccion;
    }

    // --- Getters y Setters (Sin cambios) ---
    // ... (Mantener todos los Getters y Setters corregidos previamente)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    // ... (El resto de getters y setters)
    public String getApellidoPaterno() { return apellidoPaterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }
    public String getApellidoMaterno() { return apellidoMaterno; }
    public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }
    public char getSexo() { return sexo; }
    public void setSexo(char sexo) { this.sexo = sexo; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}