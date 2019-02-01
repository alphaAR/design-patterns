/**
*单例模式  懒汉模式，懒加载，线程安全
*/
public class Singleton01{
	private static Singleton01 instance = NULL;
	
	public static getInstance(){
	    if(NULL == instance){
	        return new Singleton01();
	    }	
	}
	private Singleton01(){}
}