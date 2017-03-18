import java.util.*;

/**
 * Kelas Karnivora.
 * @author 13514098/Joshua Atmadja
 */
public class Karnivora extends Hewan {

    /** Prosedur untuk inisialisasi atribut dari hewan. */
    public void inisialisasi() {
        Random rnd = new Random();
        int x = rnd.nextInt(5) + 21;
        setID('K');
        setAge(x);
        setStrength(3);
        setSpeed(2);
        int temp = 1;
        x = rnd.nextInt(2) + 1;
        for (int i = 1; i <= x; ++i) {
            temp = -temp;
        }
        x = rnd.nextInt(4) + 1;
        setDirection(temp * x);
    }

    /** Konstrustor dari kelas Karnivora. */
    Karnivora() {
        inisialisasi();
        setPosition(0, 0);
    }

    /** Konstruktor dari kelas Karnivora dengan parameter.
     * @param x absis dari posisi Karnivora
     * @param y ordinat dari posisi Karnivora
     */
    Karnivora(final int x, final int y) {
        inisialisasi();
        setPosition(x, y);
    }

    /** Konstruktor dari kelas Karnivora dengan parameter.
     * @param pos posisi dari Karnivora dalam Point
     */
    Karnivora(final Point pos) {
        inisialisasi();
        setPosition(pos);
    }
}
