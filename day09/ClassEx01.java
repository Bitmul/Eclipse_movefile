package day09;

public class ClassEx01 {

	public static void main(String[] args) {
		Point p = new Point();

		p.set_x(5);
		p.set_y(10);
		p.prn();
		
		Point p1 = new Point();
		System.out.println("----------------");
		p1.set_x(100);
		p1.set_y(200);
		p1.prn();
		
		System.out.println("----------------");
		Point1 p2 = new Point1();
		p2.print();
		p2.set_x(100);
		p2.set_y(200);
		p2.set_z(300);
		p2.print();
	}

}

class Point {
	
	private int x;
	private int y;
	
	public int get_x()
	{
		return x;
	}
	
	public int get_y()
	{
		return y;
	}
	
	public void set_x(int x)
	{
		this.x = x;
	}
	
	public void set_y(int y)
	{
		this.y = y;
	}
	
	public void prn()
	{
		System.out.println("("+x+","+y+")");
	}
}

//Point 1 클래스 생성 x,y,z. print메서드,겟셋.

class Point1 {
	
	private int x;
	private int y;
	private int z;
	
	public int get_x()
	{
		return x;
	}
	
	public int get_y()
	{
		return y;
	}
	
	public int get_z()
	{
		return z;
	}
	
	public void set_x(int x)
	{
		this.x = x;
	}
	
	public void set_y(int y)
	{
		this.y = y;
	}
	
	public void set_z(int z)
	{
		this.z = z;
	}
	
	public void print()
	{
		System.out.println("("+x+","+y+","+z+")");
	}
}
