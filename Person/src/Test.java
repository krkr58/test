
public class Test {

	public static void main(String[] args){

		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="080-1111-2222";
		taro.address="aaa@aaa.co.jp";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		System.out.println();

		Person jirou=new Person();
		jirou.name="木村次郎";
		jirou.age=18;
		jirou.phoneNumber="080-3333-4444";
		jirou.address="bbb@bbb.co.jp";
		System.out.println(jirou.name);
		System.out.println(jirou.age);
		System.out.println(jirou.phoneNumber);
		System.out.println(jirou.address);


		System.out.println();

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="080-5555-6666";
		hanako.address="ccc@ccc.co.jp";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		System.out.println();

		Robot aibo=new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		System.out.println();

		Robot asimo=new Robot();
		asimo.name="aismo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		System.out.println();

		Robot pepper=new Robot();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
	}
}
