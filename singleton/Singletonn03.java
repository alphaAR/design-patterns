/**
*静态内部类实现方式
*/
class Singleton03{
	  private static class Singleton03Instance{
	      private static Singleton03 instance = new Singleton03();	
	  }
	  
    private Singleton03(){}
    
    public static getInstance(){
        return Singleton03Instance.instance;	
    }
}