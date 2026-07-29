public class Inventario {

    private String[] items;
    private int capacidad;
    private int cantidad;

    public Inventario(int capacidad) {

        this.capacidad = capacidad;
        items = new String[capacidad];
        cantidad = 0;
    }

    public void agregarItem(String item) {

        if (cantidad < capacidad) {

            items[cantidad] = item;
            cantidad++;

            System.out.println(item + " agregado al inventario.");

        } else {

            System.out.println("El inventario está lleno.");
        }
    }

    public String[] consultarInventario() {

        return items;
    }

    public int getCapacidad() {
        return capacidad;
    }
}