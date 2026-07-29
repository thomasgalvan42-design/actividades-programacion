public class Mascota {

    private String nombre;
    private int lealtad;

    public Mascota(String nombre, int lealtad) {
        this.nombre = nombre;
        this.lealtad = lealtad;
    }

    public void acompanar() {
        System.out.println(nombre + " acompaña a su dueño.");
        System.out.println("Lealtad: " + lealtad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLealtad() {
        return lealtad;
    }

    public void setLealtad(int lealtad) {
        this.lealtad = lealtad;
    }
}