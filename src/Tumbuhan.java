import java.util.*;

/**
 * Kelas Tumbuhan.
 * @author 13514098/Joshua Atmadja
 */
public class Tumbuhan extends Makhluk {
    /** Prosedur untuk inisialisasi atribut dari Tumbuhan. */
    public void inisialisasi() {
        Random rnd = new Random();
        int x = rnd.nextInt(5) + 31;
        setID('T');
        setAge(x);
	setStrength(1);
    }

    //konstruktor tanpa parameter
    /** Konstruktor dari kelas Tumbuhan. */
    Tumbuhan() {
        inisialisasi();
        setPosition(0, 0);
    }

    //konstruktor dengan parameter integer x dan y
    /** Konstruktor dari kelas Tumbuhan dengan parameter.
     * @param x absis dari posisi tumbuhan
     * @param y ordinat dari posisi tumbuhan
     */
    Tumbuhan(final int x, final int y) {
        inisialisasi();
        setPosition(x, y);
    }

    //konstruktor dengan parameter Point
    /** Konstruktor dari kelas Tumbuhan dengan parameter.
     * @param pos posisi Tumbuhan dalam Point
     */
    Tumbuhan(final Point pos) {
        inisialisasi();
        setPosition(pos);
    }

    /** Getter dari speed Tumbuhan.
     * @return speed Tumbuhan
     */
    public int getSpeed() {
        return 0;
    }

    /** Getter dari direction Tumbuhan.
     * @return direction Tumbuhan
     */
    public int getDirection() {
        return 0;
    }

    /** Setter speed Tumbuhan.
     * @param speed speed yang ingin di-set
     */
    public void setSpeed(final int speed) {
        
    }

    /** Setter dari direction Tumbuhan.
     * @param direction direction yang ingin di-set
     */
    public void setDirection(final int direction) {

    }
};