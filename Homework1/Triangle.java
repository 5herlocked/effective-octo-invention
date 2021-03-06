//author: shardul vaidya
//date: 7/9/18
//Triangle Pristine cLass

public class Triangle {
	private int side1;
	private int side2;
	private int side3;

	// constructor
	public Triangle (int side1, int side2, int side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// accessors
	public int getSide1() { return side1; }
	public int getSide2() { return side2; }
	public int getSide3() { return side3; }

	public boolean isEquilateral () { return (side1 == side2 && side2 == side3); }

	public boolean isIsoceles () {
		if (isEquilateral() || isScalene()) return false;

		return true;
	}

	public boolean isScalene () { return (side1 != side2 && side2 != side3 && side3 != side1); }

	@Override
	public String toString() {
		return "side 1: " + side1 + " side 2: " + side2 + " side 3: " + side3;
	}
}