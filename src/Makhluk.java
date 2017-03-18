/**
 * Kelas Abstrak Makhluk.
 * @author 13514009/Atika Firdaus
 */

public abstract class Makhluk {

    /** id : id dari Makhluk. */
    private char id;
    /** age : umur dari makhluk. */
    private int age;
    /** strength : kekuatan dari makhluk. */
    private int strength;
    /** position : posisi dari makhluk. */
    private Point position;

    /** Prosedur untuk inisialisasi. */
    public abstract void inisialisasi();

    /** Konstruktor dari kelas Makhluk.  */
    Makhluk() { // kosong

    }

    //GETTER
    /** Getter id Makhluk.
     * @return id dari Makhluk
     */
    public char getID() {
        return this.id;
    }

    /** Getter dari age Makhluk.
     * @return age dari Makhluk
     */
    public int getAge() {
        return this.age;
    }

    /** Getter dari strength Makhluk.
     * @return strength dari Makhluk
     */
    public int getStrength() {
        return this.strength;
    }

    /** Getter dari posisi Makhluk.
     * @return posisi Makhluk dalam Point
     */
    public Point getPosition() {
        return this.position;
    }

    /** Getter dari speed Makhluk.
     * @return speed Speed Makhluk
     */
    public abstract int getSpeed();

    /** Getter dari direction Makhluk.
     * @return direction Direction Makhluk
     */
    public abstract int getDirection();

    //SETTER
    /** Setter id Makhluk.
     * @param iid id yang ingin di-set pada Makhluk
     */
    public void setID(final char iid) {
        this.id = iid;
    }

    /** Setter dari age makhluk.
     * @param a age yang ingin di-set pada Makhluk
     */
    public void setAge(final int a) {
        this.age = a;
    }

    /** Setter dari strength Makhluk.
     * @param s strength yang ingin di-set kepada Makhluk
     */
    public void setStrength(final int s) {
        this.strength = s;
    }

    /** Setter dari posisi Makhluk.
     * @param xx absis yang posisi Makhluk
     * @param yy oradiant dari posisi Makhluk
     */
    public void setPosition(final int xx, final int yy) {
        Point p = new Point();
        p.setXY(xx, yy);
        this.position = p;
    }

    /** Setter dari posisi Makhluk.
     * @param p posisi dari Makhluk dalam Point
     */
    public void setPosition(final Point p) {
        this.position = p;
    }

    /** Prosedur abstrak untuk set speed dari Makhluk.
     * @param sp speed dari makhluk
     */
    public abstract void setSpeed(int sp);

    /** Prosedur abstrak untuk set direction dari Makhluk.
     * @param dir direction dari Makhluk
     */
    public abstract void setDirection(int dir);

    //FUNGSI LAIN
    /** Prosedur untuk update Makluk. */
    public void update() {
        setAge(getAge() - 1);
    }
};