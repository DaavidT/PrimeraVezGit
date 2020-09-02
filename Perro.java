public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private boolean gatos;

    /**
     * Constructor con parametros para definir el nombre, la raza, la edad y si le
     * ladra a los gatos
     * 
     * @param nombre Parametro que define el nombre del perro
     * @param raza   Parametro que define la raza del perro
     * @param edad   Parametro que define la edad del perro
     * @param gatos  Parametro que define si el perro le ladra a los gatos
     */
    public Perro(String nombre, String raza, int edad, boolean gatos) {

        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.gatos = gatos;
    }

    public Perro() {
        this.nombre = "Bones";
        this.raza = "dalmata";
        this.edad = 5;
        this.gatos = false;
    }

    @Override
    public String toString() {

        return "Nombre: " + nombre + "\nRaza: " + raza + "\nEdad: " + edad + "\nLe ladra a los gatos?: " + getGatos();

    }

    public String getNombre() {

        return this.nombre;
    }

    public String getRaza() {

        return this.raza;
    }

    public int getEdad() {

        return this.edad;
    }

    public String getGatos() {

        if (this.gatos) {
            return "si";
        }
        return "no";

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGatos(boolean gatos) {
        this.gatos = gatos;
    }

}
