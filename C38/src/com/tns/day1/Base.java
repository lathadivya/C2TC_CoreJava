package com.tns.day1;

public class Base {
	
	int varDefault=10; 
	public int varPublic=20; 
	private int varPrivate=30; 
	protected int varProtected=40; /* * Declaring methods with default, public, private, protected types */ 
	void methodDefault() { 
		System.out.println("Default access Base class");
		System.out.println("Default Variable : "+varDefault);
		}
	public void methodPublic() {
		System.out.println("Public access Base class");
		System.out.println("Public Variable : "+varPublic); 
		}
	private void methodPrivate() { 
		System.out.println("Private access Base class");
		System.out.println("Private Variable : "+varPrivate); 
		}
	protected void methodProtected() {
		System.out.println("Protected access Base class");
		System.out.println("Protected Variable : "+varProtected);
		}
	}
public class Executor { 
	public static void main(String[] args) { 
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected(); b1.methodPublic();
		b1.varDefault=11; 
		b1.methodDefault(); 
		b1.varProtected=31;
		b1.methodProtected();
		b1.varPublic=41; 
		b1.methodPublic(); 
		System.out.println(b1 instanceof Base);
		}
	} 
public class Person {
	private String personName;
	private int personAge;
	private String personCity; 
	public String getPersonName() {
		return personName; 
		}
	public void setPersonName(String personName) { 
		this.personName = personName;
		}
	public int getPersonAge() {
return personAge;
}
	public void setPersonAge(int personAge) { 
		this.personAge = personAge; 
		}
	public String getPersonCity() {
		return personCity; 
		}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
		}
	public Person() {
		System.out.println("Default Constructor"); 
		}
	public Person(String personName, int personAge, String personCity) { 
		System.out.println("Parameterized Constructor");
		this.personName = personName;
		this.personAge = personAge;
        this.personCity = personCity;
        }
	}
    import java.util.Scanner;
    public class PersonDemo { public static void main(String args[]) { 
    	Person p1=new Person(); 
    	Scanner sc=new Scanner(System.in);
    	String name, city;
    	int age;
    	System.out.println("Enter Person details : Name, age and city");
    	name=sc.nextLine();
    	age=sc.nextInt(); 
    	city=sc.nextLine(); 
    }
       p1.setPersonName(name);
       p1.setPersonAge(age);
       p1.setPersonCity(city); 
       System.out.println("Person Details Name : "+p1.getPersonName()+"\tAge : "+p1.getPersonAge()+"\tCity : "+p1.getPersonCity()); 
       System.out.println("Enter Person details : Name, age and city");
       name=sc.nextLine(); 
       age=sc.nextInt();
       city=sc.nextLine(); 
       p1=new Person(name, age, city);
       System.out.println("Person Details Name : "+p1.getPersonName()+"\tAge : "+p1.getPersonAge()+"\tCity : "+p1.getPersonCity()); sc.close();
       }
    }
