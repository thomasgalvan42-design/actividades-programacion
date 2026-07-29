class Guerrero extends Personaje {

    private int fuerza;
    private int defensa;
    private int nivel;

    public Guerrero(String nombre, int salud, int fuerza, int defensa, int nivel) {

        super(nombre, salud);

        this.fuerza = fuerza;
        this.defensa = defensa;
        this.nivel = nivel;
    }

    @Override
    public void atacar() {

        int daño = fuerza + (nivel * 2);

        System.out.println(getNombre() + " ataca causando " + daño + " puntos de daño.");
    }

    public void usarEspada() {

        int daño = fuerza + (nivel * 5);

        System.out.println(getNombre() + " usa su espada y causa " + daño + " puntos de daño.");
    }

    public void gritarDesafio() {

        defensa += 5;

        System.out.println(getNombre() + " grita un desafío.");
        System.out.println("Defensa aumentada a: " + defensa);
    }

    public void gritarGuerra() {

        fuerza += 5;

        System.out.println(getNombre() + " grita: ¡A LA GUERRA!");
        System.out.println("Fuerza aumentada a: " + fuerza);
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}