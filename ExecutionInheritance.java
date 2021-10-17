package week3.day1;

public class ExecutionInheritance {

	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.accelerate();
		obj.closedoor();
		obj.airbag();
		
		Bajaj obj1 = new Bajaj();				
		obj1.wheelauto();
		obj1.accelerate();
		obj1.applybrake();
	}

}
