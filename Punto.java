public class Punto {

    private double x;
    private double y;

    /**
     * Constructor sin parametros que degine las variables "x" y "y" en "0"
     */
    public Punto() {

        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructor que recibe las variables "x" y "y"
     * 
     * @param x Parametro que define a la "x"
     * @param y Prametro que define a la "y"
     */
    public Punto(double x, double y) {

        this.x = x;
        this.y = y;

    }

    /**
     * Metodo que regresa la variable "x"
     * 
     * @return El valor de "x"
     */
    public double getX() {

        return this.x;
    }

    /**
     * Metodo que regresa la variable "y"
     * 
     * @return El valor de "y"
     */
    public double getY() {

        return this.y;
    }

    /**
     * Metodo que define la varible "x"
     * 
     * @param float el nuevo valor de "x"
     */
    public void setX(float x) {

        this.x = x;
    }

    /**
     * Metodo que define la variable "y"
     * 
     * @param float el nuevo valor de "y"
     */
    public void setY(float y) {

        this.y = y;
    }

    @Override
    public String toString() {

        return "(" + x + ", " + y + ")";

    }

    /**
     * Metodo para sacara la raiz del valor x
     * 
     * @return Regresa la raiz cuadrada de x
     * @throws Exception Cuando x < 0
     */
    public double raizX() throws ExcepcionNumeroInvalido {

        if (this.x < 0) {
            throw new ExcepcionNumeroInvalido("sacando la raiz de un numero negativo");
        }
        return Math.sqrt(this.x);
    }

    public double raizY() {

        return Math.sqrt(this.y);
    }
}