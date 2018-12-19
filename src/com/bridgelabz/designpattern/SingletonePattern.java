package com.bridgelabz.designpattern;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonePattern
{
	public static void main(String[] args) throws Exception 
	{		
		EagerInitialization eager = EagerInitialization.getInstance();
		LazyInitialization lazy = LazyInitialization.getInstance();
		StaticBlockSingleton staticinstance = StaticBlockSingleton.getInstance();		
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				ThreadSafeSingleton threadsafeinstance = ThreadSafeSingleton.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				ThreadSafeSingleton threadsafeinstance = ThreadSafeSingleton.getInstance();
			}
		});
		t1.start();
		t2.start();
		BillPughSingleton billpugh = BillPughSingleton.getInstance();
		
		EnumSingletone enumsingletone = EnumSingletone.INSTANCE;
		enumsingletone.i = 2;
		enumsingletone.display();
		SerializedSingleton serializable = SerializedSingleton.getInstance();
		serializable.serialVersionUID = 5;
		File file = new File("DesignPattern.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream dos = new ObjectOutputStream(fos);
		dos.writeObject(serializable);
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializedSingleton serializable2 = (SerializedSingleton) ois.readObject();
		System.out.println("Value of version ID = "+serializable2.serialVersionUID);
	}
}

class StaticBlockSingleton 
{

    private static StaticBlockSingleton staticinstance;
    
    private StaticBlockSingleton()
    {
    	System.out.println("Static block initialization::");
    }
    
    //static block initialization for exception handling
    static{
        try{
        	staticinstance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
        return staticinstance;
    }
}
class EagerInitialization
{
	static EagerInitialization eager = new EagerInitialization();
	private EagerInitialization()
	{
		System.out.println("EagerInitialization instance created : ");
	}
	public static EagerInitialization getInstance()
	{
		return eager;
	}
}
class LazyInitialization
{
	static LazyInitialization lazy;   // lazy
	private LazyInitialization()
	{
		 System.out.println("LazyInitialization Instatnce created");
	}
	public static LazyInitialization getInstance()
	{
		if(lazy == null)
		{
			lazy = new LazyInitialization();
		}
		return lazy ;
	}
}

class ThreadSafeSingleton 
{
    private static ThreadSafeSingleton threadsafeinstance;
    
    private ThreadSafeSingleton()
    {
    	System.out.println("Thread Safe instance created ");
    }
        
    public static synchronized ThreadSafeSingleton getInstance()
    {
        if(threadsafeinstance == null)
        {
        	threadsafeinstance = new ThreadSafeSingleton();
        }
        return threadsafeinstance;
    }
}

class BillPughSingleton
{

    private BillPughSingleton()
    {
    	System.out.println("Bill pugh instance");
    }
    
    private static class SingletonInner
    {
        private static final BillPughSingleton billbughinstance = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance()
    {
        return SingletonInner.billbughinstance;
    }
}
enum EnumSingletone
{
	INSTANCE;
	int i;
	public void display()
	{
		System.out.println("i = "+i);
	}
}
class SerializedSingleton implements Serializable
{

    int serialVersionUID;

    private SerializedSingleton(){}
    
    private static class SingletonHelper
    {
        private static final SerializedSingleton serializable = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance(){
        return SingletonHelper.serializable;
    }
}


