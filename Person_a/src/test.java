
public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro= new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phone="080-1111-2222";
		taro.address="aaa@yahoo.jp";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phone);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person jirou=new Person();
		jirou.name="木村次郎";
		jirou.age=18;
		jirou.phone="080-3333-4444";
		jirou.address="bbb@yahoo.jp";
		System.out.println(jirou.name);
		System.out.println(jirou.age);
		System.out.println(jirou.phone);
		System.out.println(jirou.address);
		jirou.talk();
		jirou.walk();
		jirou.run();

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phone="080-5555-6666";
		hanako.address="ccc@yahoo.jp";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phone);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Person kakui=new Person();
		kakui.name="角井一紀";
		kakui.age=26;
		kakui.phone="080-7777-8888";
		kakui.address="ddd@yahoo.jp";
		System.out.println(kakui.name);
		System.out.println(kakui.age);
		System.out.println(kakui.phone);
		System.out.println(kakui.address);
		kakui.talk();
		kakui.walk();
		kakui.run();

		Robot aibo=new Robot();
		aibo.name="aibo";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="asimo";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot();
		pepper.name="pepper";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
	}

}
