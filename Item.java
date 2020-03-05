/**
 * Item
 */
public abstract class Item {
    private String nombre;
    private String descripcion;
    private int costo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCosto() {
        return this.costo;
    }

    public Item(String nombre, String descripcion, int costo) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setCosto(costo);
    }
}
