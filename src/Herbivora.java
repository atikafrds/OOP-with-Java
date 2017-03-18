import java.util.*;

/**
 * Kelas Herbivora.
 * @author 13514054/Muhammad Kamal Nadjieb
 */
public class Herbivora extends Hewan {

    /** Prosedur untuk menginisialisasi atribut di kelas Herbivora. */
    public void inisialisasi() {
        Random rnd = new Random();
        int x = rnd.nextInt(5) + 26;
        setID('H');
        setAge(x);
        setStrength(2);
        setSpeed(3);
        int temp = 1;
        x = rnd.nextInt(2) + 1;
        for (int i = 1; i <= x; ++i) {
            temp = -temp;
        }
        x = rnd.nextInt(4) + 1;
        setDirection(temp * x);
    }

    /** Konstruktor dari kelas Herbivora. */
    Herbivora() {
        inisialisasi();
        setPosition(0, 0);
    }

    /** Konstruktor dari kelas Herbivora dengan parameter.
     * @param x absis dari posisi Herbivora
     * @param y ordinat dari posisi Herbivora
     */
    Herbivora(final int x, final int y) {
        inisialisasi();
        setPosition(x, y);
    }

    /** Konstruktor dari kelas Herbivora dengan parameter.
     * @param pos posisi dari Herbivora dalam point
     */
    Herbivora(final Point pos) {
        inisialisasi();
        setPosition(pos);
    }
}
