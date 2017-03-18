class mWorld {
	public static void main(String args[]) {
		World W = new World(8, 8, 64);
		System.out.println("")
		ListOfMakhlukSTL* getLOM();
	int getXMem(int);
	int getYMem(int);
	Point getPositionMem(int);
	char getIDMem(int);
	int getStrengthMem(int);
	int getSpeedMem(int);
	int getDirectionMem(int);
	int getRow();
	int getColumn();
	char getCellElmt(int, int);

	//SETTER
	void setPositionMem(int, int, int);
	void setDirectionMem(int, int);
	void setRow(int);
	void setColumn(int);
	void setCellSize();
	void setCellElmt(int, int, char);
	void setLOM(int);
	void add(Makhluk*);

	//FUNGSI LAIN
	bool isLOMEmpty();
	void move(int);
	void undoMove(int);
	void update();
	void print();
	}	
};