import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Guerrero guerrero = null;
        Mago mago = null;

        Mascota mascota = new Mascota("Lobo", 80);
        ObjetoMagico baston = new ObjetoMagico("Baston Arcano", "Baston", 50, 5);
        Inventario inventario = new Inventario(3);

        System.out.println("===== SELECCION DE PERSONAJE =====");
        System.out.println("1. Arthur (Guerrero)");
        System.out.println("2. Merlin (Mago)");
        System.out.println("3. Crear personaje");
        System.out.print("Opcion: ");
        int eleccion = sc.nextInt();
        sc.nextLine();

        switch (eleccion) {

            case 1:
                guerrero = new Guerrero("Arthur", 100, 25, 15, 5);
                System.out.println("Has elegido a Arthur.");
                break;

            case 2:
                mago = new Mago("Merlin", 80, 100, 90, 7);
                mago.aprenderHechizo("Bola de Fuego");
                mago.aprenderHechizo("Rayo");
                System.out.println("Has elegido a Merlin.");
                break;

            case 3:

                System.out.print("Nombre del personaje: ");
                String nombre = sc.nextLine();

                System.out.println("Rol:");
                System.out.println("1. Guerrero");
                System.out.println("2. Mago");
                System.out.print("Opcion: ");
                int rol = sc.nextInt();
                sc.nextLine();

                if (rol == 1) {

                    guerrero = new Guerrero(nombre, 100, 25, 15, 5);

                } else {

                    mago = new Mago(nombre, 80, 100, 90, 7);
                    mago.aprenderHechizo("Bola de Fuego");
                    mago.aprenderHechizo("Rayo");

                }

                break;

            default:

                System.out.println("Opcion invalida. Se cargara Arthur por defecto.");
                guerrero = new Guerrero("Arthur", 100, 25, 15, 5);

        }

        int opcion;

        do {

            System.out.println("\n===== MENU =====");

            if (guerrero != null) {
                System.out.println("1. Usar espada");
                System.out.println("2. Gritar desafio");
                System.out.println("3. Gritar guerra");
            }

            if (mago != null) {
                System.out.println("4. Recuperar mana");
                System.out.println("5. Lanzar hechizo");
                System.out.println("6. Invocar elemento");
                System.out.println("7. Usar objeto magico");
            }

            System.out.println("8. Acompanar mascota");
            System.out.println("9. Agregar item");
            System.out.println("10. Mostrar inventario");
            System.out.println("0. Salir");

            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    if (guerrero != null)
                        guerrero.usarEspada();
                    break;

                case 2:
                    if (guerrero != null)
                        guerrero.gritarDesafio();
                    break;

                case 3:
                    if (guerrero != null)
                        guerrero.gritarGuerra();
                    break;

                case 4:
                    if (mago != null)
                        mago.recuperarMana();
                    break;

                case 5:
                    if (mago != null) {
                        System.out.print("Hechizo: ");
                        String hechizo = sc.nextLine();
                        mago.lanzarHechizo(hechizo);
                    }
                    break;

                case 6:
                    if (mago != null) {
                        System.out.print("Elemento: ");
                        String elemento = sc.nextLine();
                        mago.invocarElemento(elemento);
                    }
                    break;

                case 7:
                    if (mago != null)
                        mago.usarObjetoMagico(baston);
                    break;

                case 8:
                    mascota.acompanar();
                    break;

                case 9:
                    System.out.print("Item: ");
                    String item = sc.nextLine();
                    inventario.agregarItem(item);
                    break;

                case 10:

                    String[] lista = inventario.consultarInventario();

                    System.out.println("Inventario:");

                    for (String i : lista) {
                        if (i != null) {
                            System.out.println("- " + i);
                        }
                    }

                    break;

                case 0:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");

            }

        } while (opcion != 0);

        sc.close();
    }
}