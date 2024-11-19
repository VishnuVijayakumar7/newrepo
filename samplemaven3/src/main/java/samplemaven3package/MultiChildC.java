package samplemaven3package;

public class MultiChildC extends MultiParentB{
public void display2()
{
	System.out.println("Child A");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiChildC obj=new MultiChildC();
obj.display();
obj.display1();
obj.display2();
	}

}
