package samplemaven3package;

public class HierarchialChildB extends HierarchialParA {
public void display1()
{
	System.out.println("Child B");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HierarchialChildB obj=new HierarchialChildB();
obj.display();
obj.display1();
	}


}
