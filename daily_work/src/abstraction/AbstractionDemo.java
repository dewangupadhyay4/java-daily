package abstraction;

abstract class AbstractionDemo {
	
	//public void method1();  //will give error since body is required
	
	public void method2() {
		System.out.println("Hello this is method2");
	}
	
	public abstract void method3(); //will give error if we specify the body
	
	public void method4() {
		
	}

}
