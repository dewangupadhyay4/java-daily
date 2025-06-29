package abstraction;

public class AbstractionMain extends AbstractionDemo{
	
	
	public static void main(String[] args) {
		
		AbstractionMain abstractionMain=new AbstractionMain();
		abstractionMain.method2();
		abstractionMain.method3();
		abstractionMain.method4();
	}

	@Override
	public void method3() {
		System.out.println("this is method 3 from main class overriden method");
		
	}

}
