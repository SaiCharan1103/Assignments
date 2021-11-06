package q1;

@interface test
{	
}
class a
{
	public void show() {
		System.out.println("this is a method a");
	}
}
@test
class b extends a{
	public void show() {
		System.out.println("this is a method b");	
}
}
public class custom {
	public static void main(String[] args) {
		b obj =new b();
		obj.show();		
	}	
}