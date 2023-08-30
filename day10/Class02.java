package day10;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(false,0,"K5",2023,"black");
		car.Turn_on();
		car.Print();
		car.Spd_up(55);
		car.Spd_up(124);
		car.Spd_up(5);
		car.Spd_down(56);
		car.Turn_off();
		car.Spd_down(180);
		car.Spd_down(94);
		car.Print();
		car.Turn_off();
	}

}

//자동차 클래스
class Car {
	private String name;
	private boolean power;
	private int year;
	private String color;
	private int speed;
	
	public Car(){};
	
	public Car(boolean power,int speed,String name,int year,String color)
	{
		this.name = name;
		this.power = power;
		this.speed = speed;
		this.year = year;
		this.color = color;
	}
	
	public void Turn_on()
	{
		System.out.println("\nTurn On");
		this.power = true;
	}
	
	public void Turn_off()
	{
		if (this.speed < 30)
		{
			System.out.println("\nTurn Off\nSpeed will set " + this.speed + "km/h to 0km/h");
			this.speed = 0;
			this.power = false;
		}
		else System.out.println("\nCan't Turn Off when speed over 30km/h.\nNow Speed : " +this.speed + "km/h");
	}
	
	public void Spd_up(int a)
	{
		if (this.speed+a < 180)
		{
			System.out.println("\nSpeed up by "+a+ "\nSpeed : " + (this.speed+a) + "km/h");
			this.speed = this.speed+a;
		}
		else System.out.println("\nCan't Accelation over 180km/h.\nNow Speed : "+this.speed + "km/h");
	}
	
	public void Spd_down(int a)
	{
		if (this.speed-a > 0)
		{
			System.out.println("\nSpeed down by "+a + "\nSpeed : " + (this.speed-a) + "km/h");
			this.speed = this.speed-a;
		}
		else System.out.println("\nCan't Speed down under 0km/h.\nNow Speed : "+this.speed + "km/h");
		
	}
	//
	public boolean Get_power()
	{
		return this.power;
	}
	
	public String Get_color()
	{
		return this.color;
	}
	
	public int Get_year()
	{
		return this.year;
	}
	
	public String Get_name()
	{
		return this.name;
	}
	
	public int Get_spd()
	{
		return this.speed;
	}
	
	public void Set_power(boolean power)
	{
		this.power = power;
	}
	
	public void Set_spd(int speed)
	{
		this.speed = speed;
	}
	
	public void Print()
	{
		System.out.println("\n[Car Status]" + "\nActive : " + this.power + "\nSpeed : " + this.speed + "km/h\nColor : " + this.color);
	}
}
