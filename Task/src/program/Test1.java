package program;

public class Test1 {
	public static void main(String[] args) {
		Cal c= new Cal();
		int add =c.add();
		System.out.println("Addition:"+add);
		int sub =c.sub();
		System.out.println("Subtraction:"+sub);
		int mul =c.mul();
		System.out.println("Multiplication:"+mul);
		float div =c.div();
		System.out.println("Division:"+div);
	}

}
