package _5_1_ThePointAndLineClasses;
/*
 * 
 * @author DNABigBoss
 * 
 */
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int[] getXY(){
		int x = 0;
		int y = 0;
	    return new int[] {x, y};
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}
