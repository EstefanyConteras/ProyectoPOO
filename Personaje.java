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

    public void setInventario(int espaciosInventario) {
        this.inventario = new Inventario(espaciosInventario);
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
        if(vestuario.size() != 5) {
            return;
        } else {
            this.vestuario = vestuario;
        }
    }

    public ArrayList<Item> getVestuario() {
        return this.vestuario;
    }

    public Personaje(String nombre, Clase clase) {
        this.setNombre(nombre);
        this.setClase(clase);

        switch(clase) {
            case MAGO:
                this.setVidaMaxima(700);
                this.setEstaminaMaxima(500);
                this.setAtaqueFisico(50);
                this.setAfinidadMagica(300);
            break;
            case GUERRERO:
                this.setVidaMaxima(800);
                this.setEstaminaMaxima(300);
                this.setAtaqueFisico(200);
                this.setAfinidadMagica(0);
            break;
            case CAZADOR:
                this.setVidaMaxima(600);
                this.setEstaminaMaxima(1000);
                this.setAtaqueFisico(100);
                this.setAfinidadMagica(100);
            break;
            case ASESINO:
                this.setVidaMaxima(400);
                this.setEstaminaMaxima(1000);
                this.setAtaqueFisico(200);
                this.setAfinidadMagica(150);
            break;
            case CABALLERO:
                this.setVidaMaxima(1000);
                this.setEstaminaMaxima(600);
                this.setAtaqueFisico(200);
                this.setAfinidadMagica(100);
            break;
            default:
                this.setVidaMaxima(100);
                this.setEstaminaMaxima(100);
                this.setAtaqueFisico(100);
                this.setAfinidadMagica(100);
            break;
        }

        this.setDineroActual(0);
        this.setEXP(0);
        this.setNivel(0);
        this.setItemPrimario(null);
        this.setItemSecundario(null);
        this.setInventario(10);
        this.setVestuario(new ArrayList<Item>(5));
    }

    public static void imprimirInformacionDePersonaje(Personaje personaje) {
        System.out.printf("Informacion de Personaje %s: %n", personaje.getNombre());
    }
}
 