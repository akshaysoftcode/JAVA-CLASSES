import java.util.Scanner;

class employee{
	String name;
	int age;
	float salary;
	Scanner s=new Scanner(System.in);
	void add()
	{System.out.println("enter name");
		name = s.nextLine();
		System.out.println("enter age");
		age = s.nextInt();
		System.out.println("enter salary");
		salary = s.nextInt();
	}
	void display()
	{	 //System.out.println("emplyo number");
		System.out.println("employee name:"+ name +"\n"+"age:"+age+"\n"+"salary:"+salary);
	}
}
public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	employee emp1=new employee();
		emp1.name="Sam";
		emp1.age=33;
		emp1.salary=22000 ;
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("no of emp");
		int s = sc.nextInt();
		for(int i=1;i<s+1;i++)
		{ 	System.out.println("employee no"+ i);
			employee emp= new employee(); 
			emp.add();
			emp.display();	
		}
	/*	for(int i=0;i<s;i++) {
			emp[i].add();
			emp[i].display();	
		}
		*/
	}

}
