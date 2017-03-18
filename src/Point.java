/**
 * Kelas Point.
 * @author 13514009/Atika Firdaus
 */

public class Point {
    /** x : absis. */
    private int x;
    /** y : ordinat. */
    private int y;

    /** Konstruktor dari kelas Point. */
    Point() {
        x = 0;
        y = 0;
    }

    /** Konstrktor dari kelas Point dengan Parameter.
     * @param xx absis dari Point
     * @param yy ordinat dari Point
     */
    Point(final int xx, final int yy) {
        x = xx;
        y = yy;
    }

    //GETTER
    /** Getter absis Point.
     * @return absis dari Point
     */
    public int getX() {
        return this.x;
    }

    /** Getter ordinat Point.
     * @return ordinat dari Point
     */
    public int getY() {
        return this.y;
    }

    //SETTER
    /** Setter Point.
     * @param xX absis yang ingin di-set
     * @param yY ordianat yang ingin di-set
     */
    public void setXY(final int xX, final int yY) {
        setX(xX);
        setY(yY);
    }

    /** Setter absis Point.
     * @param xX absis yang ingin di-set
     */
    public void setX(final int xX) {
        this.x = xX;
    }

    /** Setter ordinat Point.
     * @param yY ordinat yang ingin di-set
     */
    public void setY(final int yY) {
        this.y = yY;
    }

    // FUNGSI LAIN
    /** Fungsi untuk mengetahui apakah kedua Point sama atau tidak.
     * @param p Point yang ingin disamakan
     * @return boolean yang menyatakan apakah Point sama atau tidak
     */
    public boolean isEqual(final Point p) {
        return ((getX() == p.getX()) && (getY() == p.getY()));
    }

    /** Prosedur untuk memindahkan Omnivora.
     * @param dx nilai yang ditambahkan pada absis
     * @param dy nilai yang ditambahkan pada ordinat
     */
    public void move(final int dx, final int dy) {
        setXY(getX() + dx, getY() + dy);
    }
};

