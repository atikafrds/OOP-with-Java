/**
 * Kelas World.
 * @author 13514007/Sri Umay N. S.
 */

public class World {
  /** cell : matriks sebagai representasi world. **/
  private char[][] cell;
  /** row : banyaknya baris pada cell. **/
  private int row;
  /** column : banyaknya kolom pada world. */
  private int column;
  /** lom : list dari makhluk. */
  private ListOfMakhlukSTL lom;

  /** Konstruktor dari kelas World. */
  World() {
    setRow(7);
    setColumn(5);
    setCellSize();
    setlom(10);
  }

  /**Konstruktor dari kelas World dengan parameter.
    * @param r banyaknya baris dari world
    * @param c banyaknya kolom dari world
    * @param nMax banyaknya makhluk yang diciptakan
    */
  World(final int r, final int c, final int nMax) {
    setRow(r);
    setColumn(c);
    setCellSize();
    setlom(nMax);
  }

  //GETTER
  /** Getter dari ListOfMakhluk.
    * @return lom ListOfMakhluk
    */
  public ListOfMakhlukSTL getlom() {
    return lom;
  }

  /** Getter absis dari posisi makhluk dalam ListOfMember.
    * @param i indeks dari makhluk dalam ListOfMakhluk
    * @return absis dari posisi makhluk dalam ListOfMakhluk pada indeks ke-i
    */
  public int getXMem(final int i) {
    return lom.getMem(i).getPosition().getX();
  }

  /** Getter ordinat dari posisi makhluk dalam lom.
    * @param i indeks dari makhluk dalam lom
    * @return ordinat dari posisi makhluk dalam lom pada indeks ke-i
    */
  public int getYMem(final int i) {
    return lom.getMem(i).getPosition().getY();
  }

  /** Getter dari posisi makhluk.
    * @param i indeks dair makhluk dalam lom
    * @return posisi makhluk dalam lom indeks ke-i dalam Point
    */
  public Point getPositionMem(final int i) {
    return lom.getMem(i).getPosition();
  }

  /** Getter dari id makhluk.
    * @param i indeks dari makhluk dalam lom
    * @return id dari makhluk dalam lom indeks ke-i
    */
  public char getIDMem(final int i) {
    return lom.getMem(i).getID();
  }

  /** Getter dari strength makhluk.
    * @param i indeks dari makhluk dalam lom
    * @return strength dari makhluk dalam lom indeks ke-i
    */
  public int getStrengthMem(final int i) {
    return lom.getMem(i).getStrength();
  }

  /** Getter dari speed makhluk.
    * @param i indeks dari makhluk dalam lom
    * @return speed dari makhluk dalam lom indeks ke-i
    */
  public int getSpeedMem(final int i) {
    return lom.getMem(i).getSpeed();
  }

  /** Getter dari direction makhluk.
    * @param i indeks dari makhluk dalam lom
    * @return direction dari makhluk dalam lom indeks ke-i
    */
  public int getDirectionMem(final int i) {
    return lom.getMem(i).getDirection();
  }

  /** Getter dari banyaknya baris pada World.
    * @return banyaknya baris pada World
    */
  public int getRow() {
    return row;
  }

  /** Getter dari banyaknya kolom pada World.
    * @return banyaknya kolom pada World
    */
  public int getColumn() {
    return column;
  }

  /** Getter dari element dalam suatu cell.
    * @param i absis dari cell
    * @param j ordinat dari cell
    * @return element dari cell(i,j)
    */
  public char getCellElmt(final int i, final int j) {
    return cell[i][j];
  }


  //SETTER
  /** Setter dari posisi Makhluk.
    * @param i indeks dari makhluk dalam ListOfMakhluk
    * @param x absis dari posisi makhluk yang ingin di-set
    * @param y ordinat dari posisi makhluk yang ingin di-set
    */
  public void setPositionMem(final int i, final int x, final int y) {
    lom.getMem(i).setPosition(x, y);
  }

  /** Setter direction dari Makhluk.
    * @param i indeks dari makhluk dalam ListOfMakhluk
    * @param direction direction yang ingin di-set
    */
  public void setDirectionMem(final int i, final int direction) {
    lom.getMem(i).setDirection(direction);
  }

  /** Setter dari jumlah baris pada World.
    * @param r banyaknya baris yang di-set pada World
    */
  private void setRow(final int r) {
    row = r;
  }

  /** Setter dari jumlah kolom pada World.
    * @param c banyaknya baris yang di-set pada World
    */
  private void setColumn(final int c) {
    column = c;
  }

  /** Prosedur untuk menge-set cell dari World. */
  private void setCellSize() {
    cell = new char[getColumn()][getRow()];
    for (int i = 0; i < getColumn(); ++i) {
      for (int j = 0; j < getRow(); ++j) {
        setCellElmt(i, j, '.');
      }
    }
  }

  /** Prosedur untuk menge-set element cell dari World.
    * @param i absis dari element yang di-set
    * @param j ordinat dari element yang di-set
    * @param karakter karakter yang akan ditampilkan ke World
    */
  public void setCellElmt(final int i, final int j, final char karakter) {
    cell[i][j] = karakter;
  }

  /** Setter dari banyaknya makhluk dari lom.
    * @param nMax banyaknya makhluk yang ingin di-set
    */
  private void setlom(final int nMax) {
    lom = new ListOfMakhlukSTL(nMax);
  }

  /** Prosedur untuk menambahkan makhluk pada World.
    * @param M makhluk yang ingin ditambahkan ke World
    */
  public void add(final Makhluk M) {
    lom.add(M);
    int n = lom.getNEff();
    n = n - 1;
    int a = getXMem(n);
    int b = getYMem(n);
    char c = getIDMem(n);
    setCellElmt(a, b, c);
  }


  //FUNGSI LAIN
  /** Fungsi untuk memeriksa apakah lom kosong atau tidak.
   * @return status apakah lom kosong atau tidak
   */
  public boolean islomEmpty() {
    return (lom.getAllMem().isEmpty());
  }

  /** Prosedur untuk memindahkan Makhluk dalam World.
    * @param i indeks dari makhluk dalam lom
    */
  public void move(final int i) {
    Point P = lom.getMem(i).getPosition();
    switch (getDirectionMem(i)) {
      /*
      -2  1  2
      -3     3
      -4 -1  4
      */
      case 1:
        P.move(0, -1);
        break;
      case 2:
        P.move(1, -1);
        break;
      case 3:
        P.move(1, 0);
        break;
      case 4:
        P.move(1, 1);
        break;
      case -1:
        P.move(0, 1);
        break;
      case -2:
        P.move(-1, -1);
        break;
      case -3:
        P.move(-1, 0);
        break;
      case -4:
        P.move(-1, 1);
        break;
      default:
        break;
    }
    lom.getMem(i).setPosition(P);
  }

  /** Prosedur untuk membatalkan perpindahan Makhluk.
    * @param i indeks dari makhluk dalam lom
    */
  public void undoMove(final int i) {
    Point P = lom.getMem(i).getPosition();
    switch (getDirectionMem(i)) {
    /*
    -2  1  2
    -3     3
    -4 -1  4
    */
      case 1:
        P.move(0, getSpeedMem(i));
        break;
      case 2:
        P.move(-getSpeedMem(i), getSpeedMem(i));
        break;
      case 3:
        P.move(-getSpeedMem(i), 0);
        break;
      case 4:
        P.move(-getSpeedMem(i), -getSpeedMem(i));
        break;
      case -1:
        P.move(0, -getSpeedMem(i));
        break;
      case -2:
        P.move(getSpeedMem(i), getSpeedMem(i));
        break;
      case -3:
        P.move(getSpeedMem(i), 0);
        break;
      case -4:
        P.move(getSpeedMem(i), -getSpeedMem(i));
        break;
      default:
        break;
    }
    lom.getMem(i).setPosition(P);
  }

  /** Prosedur untuk meng-update World. */
  public void update() {
    lom.update();
    final int NORTH = 1, EAST = 3, SOUTH = -1, WEST = -3;
    final int NORTHEAST = 2, SOUTHEAST = 4, SOUTHWEST = -4, NORTHWEST = -2;
    //Memperbaiki posisi hewan yang berada di luar world
    for (int i = 0; i < lom.getNEff(); ++i) {
      boolean periksa1 = (getXMem(i) < 0) || (getXMem(i) > (getColumn() - 1));
      boolean periksa2 = (getYMem(i) < 0) || (getYMem(i) > (getRow() - 1));
      boolean periksa = periksa1 || periksa2;
      if ((getIDMem(i) != 'T') && periksa) {
        undoMove(i);
        for (int j = 1; j <= getSpeedMem(i); ++j) {
        /*
        -2  1  2
        -3     3
        -4 -1  4
        */

        // posisi ada di baris paling atas
          if (getYMem(i) == 0) {
            // posisi ada di kolom paling kiri
            if (getXMem(i) == 0) {
              if ((getDirectionMem(i) == WEST) || (getDirectionMem(i) == NORTH)) {
                setDirectionMem(i, (-1 * getDirectionMem(i)));
              } else if (getDirectionMem(i) == NORTHWEST) {
                setDirectionMem(i, SOUTHEAST);
              }
            // posisi ada di kolom paling kanan
            } else if (getXMem(i) == (getColumn() - 1)) {
              if ((getDirectionMem(i) == EAST) || (getDirectionMem(i) == NORTH)) {
                setDirectionMem(i, (-1 * getDirectionMem(i)));
              } else if (getDirectionMem(i) == NORTHEAST) {
                setDirectionMem(i, SOUTHWEST);
              }
            } else {
                switch (getDirectionMem(i)) {
                  case NORTH:
                    setDirectionMem(i, SOUTH);
                    break;
                  case NORTHEAST:
                    setDirectionMem(i, SOUTHEAST);
                    break;
                  case NORTHWEST:
                    setDirectionMem(i, SOUTHWEST);
                    break;
                  default:
                    break;
                }
            }
            // posisi ada di baris paling bawah
          } else if (getYMem(i) == (getRow() - 1)) {
            // posisi ada di kolom paling kiri
            if (getXMem(i) == 0) {
              if ((getDirectionMem(i) == WEST) || (getDirectionMem(i) == SOUTH)) {
                setDirectionMem(i, (-1 * getDirectionMem(i)));
              } else if (getDirectionMem(i) == SOUTHWEST) {
                setDirectionMem(i, NORTHEAST);
              }
            // posisi ada di kolom paling kanan
            } else if (getXMem(i) == (getColumn() - 1)) {
              if ((getDirectionMem(i) == EAST) || (getDirectionMem(i) == SOUTH)) {
                setDirectionMem(i, (-1 * getDirectionMem(i)));
              } else if (getDirectionMem(i) == SOUTHEAST) {
                setDirectionMem(i, NORTHWEST);
              }
            } else {
                switch (getDirectionMem(i)) {
                    case SOUTH:
                        setDirectionMem(i, (-1 * getDirectionMem(i)));
                        break;
                    case SOUTHEAST:
                        setDirectionMem(i, NORTHEAST);
                        break;
                    case SOUTHWEST:
                        setDirectionMem(i, NORTHWEST);
                        break;
                    default:
                        break;
                }
            }
          } else {
            // posisi ada di kolom paling kiri
            if (getXMem(i) == 0) {
              if ((getDirectionMem(i) <= NORTHWEST) && (getDirectionMem(i) >= SOUTHWEST)) {
                setDirectionMem(i, (-1 * getDirectionMem(i)));
              }
            // posisi ada di kolom paling kanan
            } else if (getXMem(i) == (getColumn() - 1)) {
              if ((getDirectionMem(i) >= NORTHWEST) && (getDirectionMem(i) <= SOUTHEAST)) {
                setDirectionMem(i, (-1 * getDirectionMem(i)));
              }
            }
          }
          move(i);
        }
      }
    }
    //Memeriksa makhluk yang posisinya sama

    for (int i = 0; i < lom.getNEff(); ++i) {
      for (int j = i + 1; j < lom.getNEff(); ++j) {
        if (lom.getMem(i).getPosition() == lom.getMem(j).getPosition()) {
          if (getStrengthMem(i) >= getStrengthMem(j)) {
            lom.remove(j);
          } else {
            lom.remove(i);
          }
        }
      }
    }
  }

  /** Prosedur untuk mencetak World. */
  public void print() {
    //Inisialisasi semua cell menjadi '.'
    for (int i = 0; i < getRow(); ++i) {
      for (int j = 0; j < getColumn(); ++j) {
        setCellElmt(j, i, '.');
      }
    }

    // Update ID di Cell
    for (int i = 0; i < lom.getNEff(); ++i) {
      setCellElmt(getXMem(i), getYMem(i), getIDMem(i));
    }

    // Menampilkan
    System.out.print("\033[2J\033[1;1H");
    for (int i = 0; i < getRow(); ++i) {
      for (int j = 0; j < getColumn(); ++j) {
        System.out.printf("%c ", getCellElmt(j, i));
      }
      System.out.println("");
    }
  }
}