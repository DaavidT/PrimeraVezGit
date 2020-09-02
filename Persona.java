public class Persona {
    private int edad;
    private float dinero;
    private boolean esMayorDeEdad;
    private String nombre;

    /**
     * Constructor sin parametros que define las variables edad en 18, dinero en 10,
     * es mayor de edad en Verdadero y nombre en David
     */
    public Persona() {
        this.edad = 18;
        this.dinero = 10;
        this.esMayorDeEdad = true;
        this.nombre = "David";

    }

    /**
     * Constructor que recibe la edad el dinero y el nombre
     * 
     * @param edad   parametro que define la edad en entero
     * @param dinero parametro que define el dinero en float
     * @param nombre parametro que define el nombre en String
     */
    public Persona(int edad, float dinero, String nombre) {

        this.edad = edad;
        this.dinero = dinero;
        this.nombre = nombre;
        if (this.edad >= 18) {
            this.esMayorDeEdad = true;
        } else {
            this.esMayorDeEdad = false;
        }

    }

    /**
     * Representacion en cadena de una persona
     * 
     * @return Cadena que representa a una persona
     */
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad() + "\nDinero: " + this.getDinero()
                + "\nEs mayor de edad: " + this.getEsMayorDeEdad();
    }

    /**
     * Metodo que regresa la edad de la persona
     * 
     * @return la edad de la persona
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Metodo que regresa el dinero de la persona
     * 
     * @return El dinero de la persona
     */
    public float getDinero() {
        return this.dinero;
    }

    /**
     * Metodo que regresa el nombre de la persona
     * 
     * @return Nombre de la persona
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Metodo que regresa si es mayor de edad la persona
     * 
     * @return True si edad >= 18, False en otro caso
     */
    public boolean getEsMayorDeEdad() {
        return this.esMayorDeEdad;
    }

    /**
     * Metodo que define la edad de una persona
     * 
     * @param edad la nueva edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
        if (this.edad >= 18) {
            this.esMayorDeEdad = true;
        } else {
            this.esMayorDeEdad = false;
        }

    }

    /**
     * Metodo que define el dinero de la persona
     * 
     * @param dinero el dinero nuevo de la persona
     */
    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    /**
     * Metodo que define el nombre de la persona
     * 
     * @param nombre el nuevo nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
