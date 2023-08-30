package day09;

import java.util.Scanner;

public class Gwajae {

	public static void main(String[] args) {
		Student student[] = new Student[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하십시오.(2명)");
		student[0] = new Student();
		student[1] = new Student();
		student[2] = new Student("aaa",15,"111-222-3333","seoul");
		student[3] = new Student("add",5);
//		student[0].set_name(scan.next());
//		student[1].set_name(scan.next());
//		
//		System.out.println("학생의 나이를 입력하십시오.(2명)");
//		student[0].set_old(scan.nextInt());
//		student[1].set_old(scan.nextInt());
//		
//		System.out.println("학생의 전화번호를 입력하십시오.(2명)");
//		student[0].set_phone(scan.next());
//		student[1].set_phone(scan.next());
//		
//		System.out.println("학생의 주소를 입력하십시오.(2명)");
//		student[0].set_address(scan.next());
//		student[1].set_address(scan.next());
		
		student[0].Print();
		student[1].Print();
		student[2].Print();
		student[3].Print();
		scan.close();
	}

}

class Student
{
	private String name;
	private int old;
	private String phone;
	private String address;
	
	public Student(String name,int age,String phone,String address)
	{
		this(name,age);
		this.old=age;
		this.phone=phone;
	}
	
	public Student(String name,int age)
	{
		this.name=name;
		this.old=age;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int get_old()
	{
		return old;
	}
	
	public String get_name()
	{
		return name;
	}
	
	public String get_phone()
	{
		return phone;
	}
	
	public String get_address()
	{
		return address;
	}
	public void set_old(int old) 
	{
		this.old = old;
	}
	
	public void set_name(String name) 
	{
		this.name = name;
	}
	
	public void set_phone(String phone) 
	{
		this.phone = phone;
	}
	
	public void set_address(String address) 
	{
		this.address = address;
	}
	
	public void Print()
	{
		System.out.println(name + "(" + old + ")" + " " +phone + "\n" + address);
	}
}