/**
 * Kelas abstrak Hewan.
 * @author 13514098/Joshua Atmadja
 */

public abstract class Hewan extends Makhluk {
    /** speed : atribut untuk menyimpan speed dari hewan. */
    private int speed;
    /** direction : atribut untuk menyimpan arah gerak hewan. */
    private int direction;

    /** Getter dari speed hewan.
     * @return speed dari hewan
     */
    public final int getSpeed() {
        return speed;
    }

    /** Getter dari direction hewan.
     * @return direction dari hewan
     */
    public final int getDirection() {
        return direction;
    }

    /** Prosedur untuk mengeset speed hewan.
     * @param sp speed yang ingin di set kepada hewan
     */
    public final void setSpeed(final int sp) {
        speed = sp;
    }

    /** Prosedur untuk mengeset direction hewan.
     * @param dir direction yang ingin di set kepada hewan
     */
    public final void setDirection(final int dir) {
        direction = dir;
    }

    /** Prosedur untuk update hewan posisi dan direction hewan. */
    public final void update() {
        setAge(getAge() - 1);
        /*
        -2  1  2
        -3     3
        -4 -1  4
        */
        Point p = getPosition();
        switch (getDirection()) {
            case 1:
                p.move(0, -speed);
                break;
            case 2:
                p.move(speed, -speed);
                break;
            case 3:
                p.move(speed, 0);
                break;
            case 4:
                p.move(speed, speed);
                break;
            case -1:
                p.move(0, speed);
                break;
            case -2:
                p.move(-speed, -speed);
                break;
            case -3:
                p.move(-speed, 0);
                break;
            case -4:
                p.move(-speed, speed);
                break;
            default:
                break;
        }
        setPosition(p);
    }
};