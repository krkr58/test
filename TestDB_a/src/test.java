
public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TestUserDAO dao=new TestUserDAO();
		dao.select("taro","123");
		dao.selectAll();
		dao.selectByName("taro");
		dao.select("jiro","456");
		dao.selectByName("hanako");
		dao.selectByPassword("123");
		dao.selectByPassword("789");
		dao.update("taro", "saburo");
		dao.insert(5, "ueno", "164");
		dao.insert(6, "akiba", "896");
		dao.insert(5, "jiro", "164");
		dao.delete("jiro");
	}
}
