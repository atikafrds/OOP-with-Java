import java.util.*;

/**
 * Kelas Omnivora.
 * @author 13514009/Atika Firdaus
 */
public class Omnivora extends Hewan {

    /** Konstruktor dari kelas Omnivora.
    */
    Omnivora() {
        inisialisasi();
        this.setPosition(0, 0);
    }

    /** Konstruktor dari kelas Omnivora dengan parameter.
     * @param x absis dari posisi Omnivora
     * @param y ordinat dari posisi Omnivora
     */
    Omnivora(final int x, final int y) {
        inisialisasi();
        setPosition(x, y);
    }

    /** Konstruktor dari kelas Omnivora dengan parameter.
     * @param p posisi Omnivora dalam Point
     */
    Omnivora(final Point p) {
        inisialisasi();
        setPosition(p);
    }

    /**Prosedur untuk inisialisasi atribut Omnivora. */
    public void inisialisasi() {
        setID('O');
        Random ran = new Random();
        int x = ran.nextInt(5) + 16;
        setAge(x);
        setStrength(4);
        setSpeed(1);
        int temp = 1;
        x = ran.nextInt(2) + 1;
        for (int i = 1; i <= x; ++i) {
            temp = -temp;
        }
        x = ran.nextInt(4) + 1;
        setDirection(temp * x);
    }
};