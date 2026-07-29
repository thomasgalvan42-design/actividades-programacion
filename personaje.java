public class Personaje {

    private String nombre;
    private int salud;

    public Personaje(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public void atacar() {
        System.out.println(nombre + " ataca al enemigo.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}