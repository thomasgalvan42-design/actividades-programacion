import java.util.ArrayList;

public class Mago extends Personaje {

    private int mana;
    private int inteligencia;
    private int nivel;

    private ArrayList<String> hechizosConocidos;

    public Mago(String nombre, int salud, int mana, int inteligencia, int nivel) {

        super(nombre, salud);

        this.mana = mana;
        this.inteligencia = inteligencia;
        this.nivel = nivel;

        hechizosConocidos = new ArrayList<>();
    }

    @Override
    public void atacar() {

        int daño = inteligencia + (nivel * 3);

        System.out.println(getNombre() + " lanza un ataque mágico causando " + daño + " puntos de daño.");
    }

    public void aprenderHechizo(String hechizo) {

        hechizosConocidos.add(hechizo);
    }

    public void recuperarMana() {

        mana += 20;

        System.out.println(getNombre() + " recuperó maná.");
        System.out.println("Maná actual: " + mana);
    }

    public void lanzarHechizo(String hechizo) {

        if (!hechizosConocidos.contains(hechizo)) {

            System.out.println("No conoces ese hechizo.");
            return;
        }

        if (mana < 20) {

            System.out.println("No tienes suficiente maná.");
            return;
        }

        mana -= 20;

        int daño = inteligencia + (nivel * 4);

        System.out.println(getNombre() + " lanzó " + hechizo + ".");
        System.out.println("Daño causado: " + daño);
        System.out.println("Maná restante: " + mana);
    }

    public void invocarElemento(String elemento) {

        if (mana < 15) {

            System.out.println("No tienes suficiente maná.");
            return;
        }

        mana -= 15;

        System.out.println(getNombre() + " invocó el elemento " + elemento + ".");
    }

    public void usarObjetoMagico(ObjetoMagico objeto) {

        objeto.usar();
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<String> getHechizosConocidos() {
        return hechizosConocidos;
    }
}