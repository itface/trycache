import java.io.File;


public class Test {

	public static void  main(String[] args){
		System.out.println(test4());
		System.out.println(1);
		System.out.println(test3());
		System.out.println(4);
		
	}
	private static int test(){
		int i=100;
		try {
			i=i/0;
		} catch (Exception e) {
			i=99;
			e.printStackTrace();
			return 79;
		}finally{
			i=69;
			return 59;
		}
		//return i;
	}
	private static int test2(){
		int i=100;
		try {
			i=i/0;
		} catch (Exception e) {
			i=99;
			e.printStackTrace();
			return 79;
		}
		return i;
	}
	private static int test3(){
		int i =100/0;
		return 3;
	}
	private static int test4(){
		try {
			Class clazz = Class.forName("abc");
			int a = Integer.parseInt("a");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("***********");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("!!!!!!!!!!!!!!!");
		}
		return 1;
	}
}
