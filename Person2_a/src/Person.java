
public class Person {
	public String name=null;
	public int age=0;

	public Person(){
		this.name=name;
		this.age=age;
	}

	public Person(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println(this.name);
		System.out.println(this.age);
	}

	public Person(String name){
		this.name=name;
		this.age=0;
	}

	public Person(int age){
		this.name="名無し";
		this.age=age;
	}

	public Person(int age,String name){
		this.name=name;
		this.age=age;
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
