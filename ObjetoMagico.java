public class ObjetoMagico {

    private String nombre;
    private String tipo;
    private int potencia;
    private int durabilidad;

    public ObjetoMagico(String nombre, String tipo, int potencia, int durabilidad) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
        this.durabilidad = durabilidad;
    }

    public void usar() {

        if (durabilidad > 0) {

            durabilidad--;

            System.out.println("Usaste " + nombre + ".");
            System.out.println("Potencia: " + potencia);
            System.out.println("Durabilidad restante: " + durabilidad);

        } else {

            System.out.println("El objeto mágico está roto.");
        }
    }

    public void reparar() {

        durabilidad = 5;

        System.out.println(nombre + " ha sido reparado.");
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getDurabilidad() {
        return durabilidad;
    }
}