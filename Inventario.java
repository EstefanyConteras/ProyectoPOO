import java.util.ArrayList;

/**
 * Inventario
 */
public class Inventario {
    public int capacidad;
    public ArrayList<Item> contenido;

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setContenido(ArrayList<Item> contenido) {
        this.contenido = contenido;
    }

    public ArrayList<Item> getContenido() {
        return this.contenido;
    }

    public Inventario(int capacidad) {
        this.setCapacidad(capacidad);
        this.setContenido(new ArrayList<Item>(capacidad));
    }
}
