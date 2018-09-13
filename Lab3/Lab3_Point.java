//author: shardul vaidya
//date: 06/09/18
//Point object for Lab3

public class Lab3_Point {
	private int x, y;

	public Lab3_Point (int x, int y){
		this.x = x;
		this.y = y;
	}

	//accessors and mutators
	public int getX () { return x; }
	public void setX (int x) { this.x = x; }
	public int getY () { return y; }
	public void setY (int y) { this.y = y; }

	public boolean isVertical (Lab3_Point otherPoint){ 
		return (otherPoint.getX() == this.x) ? true : false; 
	}

	public int getQuadrant (){
		if (x > 0 && y > 0) // 1st quad
			return 1;
		else if (x < 0 && y > 0) // 2nd quad
			return 2;
		else if (x < 0 && y < 0) // 3rd quad
			return 3;
		
		return 4; // catch all
	}


	@Override
	public String toString(){ 
		return "Point: (" + x + ", " + y + ")"; 
	}
}