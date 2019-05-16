
public class CheakLoadDB {
	public static void main(String[] args) throws InstantiationException,IllegalAccessException{
		String msg="";

		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg="ロードに成功しました";
		}catch(ClassNotFoundException e){
			msg="ロードに失敗しました";
		}
		System.out.println(msg);
	}
}
