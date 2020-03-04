import java.util.ArrayList;

/**
 * Personaje
 */
public class Personaje {
    private String nombre;
    private int vidaMaxima;
    private int vidaActual;
    private int estaminaMaxima;
    private int estaminaActual;
    private Inventario inventario;
    private char sexo;
    private Clase clase;
    private int dineroActual;
    private int nivel;
    private int EXP;
    private Item itemPrimario;
    private Item itemSecundario;
    private int ataqueFisico;
    private int afinidadMagica;
    private ArrayList<Item> vestuario;
    
    /***
     * Setter para el nombre
     * @param nombre el nombre que se le asignará al nuevo personaje
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getVidaMaxima() {
        return this.vidaMaxima;
    }

    public void setVidaActual(int vidaActual) {
        if(vidaActual < getVidaMaxima()) {
            this.vidaActual = vidaActual;
        } else {
            this.vidaActual = 0;
        }
    }

    public int getVidaActual() {
        return this.vidaActual;
    }

    public void setEstaminaMaxima(int estaminaMaxima) {
        this.estaminaMaxima = estaminaMaxima;
    }

    public int getEstaminaActual() {
        return this.estaminaActual;
    }

    public int getEstaminaMaxima() {
        return this.estaminaMaxima;
    }

    public void setEstaminaActual(int estaminaActual) {
        if(estaminaActual < getEstaminaMaxima()) {
            this.estaminaActual = estaminaActual;
        } else {
            this.estaminaActual = 0;
        }
    }

    public void setInventario(Inventario inventario) {
        //if inventario is not null, then assign inventario al inventario de jugador
    }

    public Inventario getInventario() {
        return this.inventario;
    }

    public void setSexo(char sexo) {
        if(Character.toUpperCase(sexo) == 'M' || Character.toUpperCase(sexo) == 'F') {
            this.sexo = sexo;
        }
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Clase getClase() {
        return this.clase;
    }

    public void setDineroActual(int dineroActual) {
        this.dineroActual = dineroActual;
    }

    public int getDineroActual() {
        return this.dineroActual;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setEXP(int EXP) {
        this.EXP = EXP;
    }

    public int getEXP() {
        return this.EXP;
    }

    public void setItemPrimario(Item itemPrimario) {
        this.itemPrimario = itemPrimario;
    }

    public Item getItemPrimario() {
        return this.itemPrimario;
    }

    public void setItemSecundario(Item itemSecundario) {
        this.itemSecundario = itemSecundario;
    }

    public Item getItemSecundario() {
        return this.itemSecundario;
    }

    public void setAtaqueFisico(int ataqueFisico) {
        this.ataqueFisico = ataqueFisico;
    }

    public int getAtaqueFisico() {
        return this.ataqueFisico;
    }

    public void setAfinidadMagica(int afinidadMagica) {
        this.afinidadMagica = afinidadMagica;
    }

    public int getAfinidadMagica() {
        return this.afinidadMagica;
    }

    public void setVestuario(ArrayList<Item> vestuario) {
        //Implementar metodo en clase Vestuario para cambiar vestuario completo
    }

    public ArrayList<Item> getVestuario() {
        return this.vestuario;
    }

    public Personaje(String nombre, int vidaMaxima, int estaminaMaxima, int ataqueFisico, int afinidadMagica) {
        this.setNombre(nombre);
        this.setVidaMaxima(vidaMaxima);
        
    }
}
 