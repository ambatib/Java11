package com.examples.java9;

interface CustomInterface {
    
    public abstract void method1();
     
    public default void method2() {
        method4();  //private method inside default method
        method5();  //static method inside other non-static method
        System.out.println("default method");
    }
     
    public static void method3() {
        method5(); //static method inside other static method
        System.out.println("static method");
    }
     
    private void method4(){
        System.out.println("private method");
    } 
     
    private static void method5(){
        System.out.println("private static method");
    } 
}
public class PrivateInterfaceExample implements CustomInterface {
	@Override
    public void method1() {
        System.out.println("abstract method");
    }
	public static void main(String[] args) {
		CustomInterface instance = new PrivateInterfaceExample();
        instance.method1();
        instance.method2();
        CustomInterface.method3();

	}

}
