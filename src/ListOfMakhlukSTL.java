import java.util.*;

/**
 * Kelas List of Makhluk.
 * @author 13514054/M. Kamal Nadjieb
 */
public class ListOfMakhlukSTL {
    /** DELTAMEM : konstanta. */
    private final static int DELTAMEM = 10;
    /** mem : list yang berisi makhluk. */
    private Vector<Makhluk> mem = new Vector<Makhluk>();
    /** nMax : jumlah maksimal yang dapat ditampung ListOfMakhluk. */
    private int nMax;

    /** Kostruktor dari kelas ListOfMakhlukSTL. */
    ListOfMakhlukSTL() {
        nMax = DELTAMEM;
    }

    /** Kostruktor dari kelas ListOfMakhlukSTL dengan parameter.
     * @param n jumlah makluk maksial dalam list
     */
    ListOfMakhlukSTL(final int n) {
        nMax = n;
    }

    /** Getter dari ListofMakhluk.
     * @return mengembalikan list of makhluk
     */
    public Vector<Makhluk> getAllMem() {
        return mem;
    }

    /** Getter untuk member ListOfMakhluk.
     * @param i indeks adri makhluk ynag ingin didapatkan
     * @return mengembalikan makhluk pada ListOfMakhluk indeks ke i
     */
    public Makhluk getMem(final int i) {
        return mem.get(i);
    }

    /** Getter untuk jumlah maksimal makhluk di dalam ListOfMakhluk.
     * @return jumlah makhluk maksimal yang bisa ditampung ListOfMakhluk
     */
    public int getNMax() {
        return nMax;
    }

    /** Getter dari banyaknya makhluk dalam ListOfMakhluk.
     * @return banyaknya makhluk dalam ListOfMakhluk
     */
    public int getNEff() {
        return mem.size();
    }

    /** Setter dari member ListOfMakhluk.
     * @param i indeks dimana makhluk ingin di set
     * @param m makhluk yang ingin dimasukkan kedalam ListOfMakhluk
     */
    public void setMem(final int i, final Makhluk m) {
        mem.insertElementAt(m, i);
    }

    /** Setter untuk jumlah maksimum makhluk dalam ListOfMakhluk.
     * @param n jumlah maksimal makhluk yang ingin di-set
     */
    public void setNMax(final int n) {
        nMax = n;
    }

    //FUNGSI LAIN
    /** Prosedur untuk menambahkan makhluk ke dalam ListOfMakhluk.
     * @param m makhluk yang ingin ditambahkan
     */
    public void add(final Makhluk m) {
        if (mem.size() < nMax) {
            mem.addElement(m);
        }
    }

    /** Prosedur untuk menghapus makhluk dari ListOfMakhluk.
     * @param i indeks dari amkhluk yang ingin dihapus
     */
    public void remove(final int i) {
        mem.removeElementAt(i);
    }

    /** Prosedur untuk meng-update ListOfMakhluk. */
    public void update() {
        for (int i = 0; i < mem.size(); ++i) {
            mem.get(i).update();
            if (mem.get(i).getAge() == 0) {
                remove(i);
            }
        }
    }
};