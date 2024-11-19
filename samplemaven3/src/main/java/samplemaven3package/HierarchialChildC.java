package samplemaven3package;

public class HierarchialChildC extends HierarchialParA {
public void display2()
{
	System.out.println("Child C");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HierarchialChildC obj=new HierarchialChildC();
obj.display();
obj.display2();
	}

}
