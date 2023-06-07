package in.ineuron.assessment;

public class ConstructorQ2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child=new Child();
		Parent p=new Child();
	}

}


class Parent{
	Parent(){
		System.out.println("Parent class constructor is invoked");
	}
}

class Child extends Parent{
	
	Child(){
		
	}
}
