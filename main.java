import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Guerrero guerrero = null;
        Mago mago = null;

        System.out.println("===== CREAR PERSONAJE =====");

        System.out.print("Nombre del personaje: ");
        String nombre = sc.nextLine();

        System.out.println("Rol:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.print("Opcion: ");
        int rol = sc.nextInt();

        if (rol == 1) {

            System.out.print("Salud: ");
            int salud = sc.nextInt();

            System.out.print("Fuerza: ");
            int fuerza = sc.nextInt();

            System.out.print("Defensa: ");
            int defensa = sc.nextInt();

            System.out.print("Nivel: ");
            int nivel = sc.nextInt();
            sc.nextLine();

            guerrero = new Guerrero(nombre, salud, fuerza, defensa, nivel);

        } else {

            System.out.print("Salud: ");
            int salud = sc.nextInt();

            System.out.print("Mana: ");
            int mana = sc.nextInt();

            System.out.print("Inteligencia: ");
            int inteligencia = sc.nextInt();

            System.out.print("Nivel: ");
            int nivel = sc.nextInt();
            sc.nextLine();

            mago = new Mago(nombre, salud, mana, inteligencia, nivel);

            System.out.print("Primer hechizo: ");
            mago.aprenderHechizo(sc.nextLine());

            System.out.print("Segundo hechizo: ");
            mago.aprenderHechizo(sc.nextLine());
        }

        System.out.println("\n===== CREAR MASCOTA =====");

        System.out.print("Nombre de la mascota: ");
        String nombreMascota = sc.nextLine();

        System.out.print("Lealtad: ");
        int lealtad = sc.nextInt();
        sc.nextLine();

        Mascota mascota = new Mascota(nombreMascota, lealtad);

        System.out.println("\n===== CREAR OBJETO MAGICO =====");

        System.out.print("Nombre del objeto: ");
        String nombreObjeto = sc.nextLine();

        System.out.print("Tipo: ");
        String tipo = sc.nextLine();

        System.out.print("Potencia: ");
        int potencia = sc.nextInt();

        System.out.print("Durabilidad: ");
        int durabilidad = sc.nextInt();
        sc.nextLine();

        ObjetoMagico objeto = new ObjetoMagico(nombreObjeto, tipo, potencia, durabilidad);

        System.out.print("Capacidad del inventario: ");
        int capacidad = sc.nextInt();
        sc.nextLine();

        Inventario inventario = new Inventario(capacidad);

        int opcion;

        do {

            System.out.println("\n===== MENU =====");

            if (guerrero != null) {
                System.out.println("1. Atacar");
                System.out.println("2. Usar espada");
                System.out.println("3. Gritar desafio");
                System.out.println("4. Gritar guerra");
            }

            if (mago != null) {
                System.out.println("5. Atacar");
                System.out.println("6. Recuperar mana");
                System.out.println("7. Lanzar hechizo");
                System.out.println("8. Invocar elemento");
                System.out.println("9. Usar objeto magico");
            }

            System.out.println("10. Acompañar mascota");
            System.out.println("11. Agregar item al inventario");
            System.out.println("12. Mostrar inventario");
            System.out.println("0. Salir");

            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    if (guerrero != null)
                        guerrero.atacar();
                    break;

                case 2:
                    if (guerrero != null)
                        guerrero.usarEspada();
                    break;

                case 3:
                    if (guerrero != null)
                        guerrero.gritarDesafio();
                    break;

                case 4:
                    if (guerrero != null)
                        guerrero.gritarGuerra();
                    break;

                case 5:
                    if (mago != null)
                        mago.atacar();
                    break;

                case 6:
                    if (mago != null)
                        mago.recuperarMana();
                    break;

                case 7:
                    if (mago != null) {

                        System.out.print("Nombre del hechizo: ");
                        String hechizo = sc.nextLine();

                        mago.lanzarHechizo(hechizo);
                    }
                    break;

                case 8:
                    if (mago != null) {

                        System.out.print("Elemento: ");
                        String elemento = sc.nextLine();

                        mago.invocarElemento(elemento);
                    }
                    break;

                case 9:
                    if (mago != null)
                        mago.usarObjetoMagico(objeto);
                    break;

                case 10:
                    mascota.acompanar();
                    break;

                case 11:

                    System.out.print("Nombre del item: ");
                    String item = sc.nextLine();

                    inventario.agregarItem(item);
                    break;

                case 12:

                    System.out.println("\nInventario:");

                    for (String item : inventario.consultarInventario()) {

                        if (item != null) {
                            System.out.println("- " + item);
                        }
                    }

                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
