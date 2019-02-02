/**
*饿汉式，线程同步
*/
class Singleton02{
    private static Singleton02 instance = new Singleton02();
    private Singleton02(){}
    
    public synchronized static getInstance(){
        return instance;	
    }
}