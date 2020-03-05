/**
 * Juego
 */
public class Juego {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("Jesus", Clase.CAZADOR);

        Personaje.imprimirInformacionDePersonaje(personaje);
    }
}