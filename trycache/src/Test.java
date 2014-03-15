

public class Test {

	public static void  main(String[] args){
		System.out.println(test()+"@0");
		System.out.println(test1()+"@1");
		System.out.println(test11()+"@11");
		System.out.println(test111()+"@111");
		System.out.println(test2()+"@2");
		
	}
	private static int test(){
		int i=100;
		try {
			i=i/0;
		} catch (Exception e) {
			e.printStackTrace();
			return 79;
		}finally{
			return 59;
		}
		//return i;
	}
	private static int test1(){
		int i=100;
		try {
			i=i/0;
		} catch (Exception e) {
			i=99;
			e.printStackTrace();
			return i;
		}finally{
			i=69;
			return i;
		}
		//return i;
	}
	private static int test11(){
		try {
			return 1;
		} finally{
			return 2;
		}
		//return i;
	}
	private static int test111(){
		int i=100;
		try {
			return i;
		}finally{
			i++;
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
