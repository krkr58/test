
public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro = new Person();
		taro.name="taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jirou=new Person("jirou",20);

		Person sabrou=new Person("sabrou");
		sabrou.age=100;
		System.out.println(sabrou.name);
		System.out.println(sabrou.age);

		Person nana=new Person(25);
		System.out.println(nana.name);
		System.out.println(nana.age);

		Person hanako =new Person(17,"hanako");
	}
}
