/**
 * Kelas abstrak Hewan.
 * @author 13514007/Sri Umay N. S. 13514009/Atika Firdaus 13514054/M. Kamal Nadjieb 13514098/Joshua Atmadja
 */

import java.util.*;
import java.io.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame implements KeyListener {
    /** W : World pada main program. */
	public static World W = new World();
    /** stop : variabel untuk menyimpan apakah pengamatan berhenti. */
	public static boolean stop;
    /** isPaused : variabel untuk menyimpan apakah pengamatan berhenti sementara. */
    public static boolean isPaused;
    /** kar : kar untuk menyimpan karakter yang diterima keylistener. */
    public static char kar = 0;
    /** label : variabel bertipe JLabel untuk interface. */
    JLabel label;

    /** Konstruktor dari kelas Main dengan Parameter.
     * @param W World untuk Main
     */
	public Main(World W) {
        JPanel p = new JPanel();
        label = new JLabel("Key Listener!");
        p.add(label);
        add(p);
        addKeyListener(this);
        setSize(200, 100);
        setVisible(true);

		this.W = W;
		stop = false;
		isPaused = false;
	}

    /** Prosedur untuk menerima input keyboard yang diketikkan.
    * @param e KeyEvent
    */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /** Prosedur untuk menerima input keyboard yang ditekan.
    * @param e KeyEvent
    */
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 0x51 /*Q*/) {
            kar = 'Q';
        } else if (e.getKeyCode() == 0x43 /*C*/) {
            kar = 'C';
        } else if (e.getKeyCode() == 0x50 /*P*/) {
            kar = 'P';
        } else if (e.getKeyCode() == 0x4E /*N*/) {
            kar = 'N';
        } else if (e.getKeyCode() == 0x49 /*I*/) {
            kar = 'I';
        }
    }

    /** Prosedur untuk menerima tombol keyboard yang dilepaskan.
    * @param e KeyEvent
    */
    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    /** Main program.
    * @param args String[]
    */
	public static void main(String[] args) throws IOException {
		int row;
		int column;
		int nTumbuhan;
		int nHerbivora;
		int nKarnivora;
		int nOmnivora;

		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan besar Kolom: ");
		column = input.nextInt();
		System.out.print("Masukkan besar Baris: ");
		row = input.nextInt();
		System.out.print("Masukkan jumlah Tumbuhan yang ingin dibuat: ");
		nTumbuhan = input.nextInt();
		System.out.print("Masukkan jumlah Herbivora yang ingin dibuat: ");
		nHerbivora = input.nextInt();
		System.out.print("Masukkan jumlah Karnivora yang ingin dibuat: ");
		nKarnivora = input.nextInt();
		System.out.print("Masukkan jumlah Omnivora yang ingin dibuat: ");
		nOmnivora = input.nextInt();

        W = new World(row, column, row*column);
		new Main(W);
	
		//Inisialisasi Makhluk
		for (int i = 0; i < nTumbuhan; ++i) {
			W.add(new Tumbuhan());
		}

		for (int i = 0; i < nHerbivora; ++i) {
			W.add(new Herbivora());
		}

		for (int i = 0; i < nKarnivora; ++i) {
			W.add(new Karnivora());
		}

		for (int i = 0; i < nOmnivora; ++i) {
			W.add(new Omnivora());
		}

		//Insialisasi Posisi
		for (int i = 0; i < W.getlom().getNEff(); ++i) {
			boolean isSame;
			do {
				isSame = false;
				Random ran = new Random();
				int x = ran.nextInt(W.getColumn());
				int y = ran.nextInt(W.getRow());
				W.setPositionMem(i, x, y);
				int j = 0;
				do {
					if ((i != j) && (W.getPositionMem(i) == W.getPositionMem(j))) {
						isSame = true;
					}
					++j;
				} while ((j < W.getlom().getNEff()) && (!isSame));
			} while (isSame);
		}

		//Mulai simulasi kehidupan
		do {
			do {
				W.print();
				W.update();
                long start = (System.nanoTime() / 1000000);
                long time;
                while ((kar == 0) && ((time = (System.nanoTime() / 1000000) - start) < 1000)) {

                }
			} while ((!isPaused) && (!W.islomEmpty()) && (kar == 0));
			
            if ((W.islomEmpty()) || (kar == 'Q')) {
				stop = true;
			} else if (kar == 'P') {
                isPaused = !isPaused;
                kar = 0;
                if (isPaused) {
                    while ((kar != 'N') && (kar != 'P')) {
                     
                    }                    
                }
            } else if (kar == 'N') {
                kar = 0;
                while ((kar != 'N') && (kar != 'P')) {
                     
                }
            } else if (kar == 'C') {
                System.out.print("\033[2J\033[1;1H");
                System.out.print("Masukkan filename untuk menyimpan kondisi world: ");

                String filename = input.nextLine();
                filename = input.nextLine();
                // System.out.println("Masukkan filename untuk menyimpan kondisi world: ");
                FileWriter fw = new FileWriter(filename);
                PrintWriter pw = new PrintWriter(fw);
                for (int i = 0; i < W.getRow(); ++i) {
                    for (int j = 0; j < W.getColumn(); ++j) {
                        pw.print(W.getCellElmt(j,i) + " ");
                    }
                    pw.println();
                }

                pw.flush();
                pw.close();
                fw.close();

                kar = 0;
            } else if (kar == 'I') {
                Random rnd = new Random();
                int i = rnd.nextInt(4) + 1;
                if (i == 1) {
                 W.add(new Tumbuhan());
                } else if (i == 2) {
                 W.add(new Herbivora());
                } else if (i == 3) {
                 W.add(new Karnivora());
                } else {
                 W.add(new Omnivora());
                }

                i = W.getlom().getNEff()-1;
                boolean isSame;

                do {
                isSame = false;
                W.setPositionMem(i, rnd.nextInt(W.getColumn()), rnd.nextInt(W.getRow()));
                    int j = 0;
                    do {
                     if ((i != j) && (W.getPositionMem(i) == W.getPositionMem(j))) {
                         isSame = true;
                     }
                     ++j;
                    } while ((j < W.getlom().getNEff()) && (!isSame));
                } while (isSame);

                kar = 0;
            }

		} while (!stop);
		System.out.print("\033[2J\033[1;1H");
        System.exit(0);
	}
}