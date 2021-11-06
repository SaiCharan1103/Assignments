package q3;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int Sequence();
}
class myq3{
	@Execute(Sequence=2)
	public void method1() {
		System.out.println("this is seq 2");
		
	}
	@Execute(Sequence=1)
	public void method2() {
		System.out.println("this is seq 1");
		
	}
	@Execute(Sequence=3)
	public void method3() {
		System.out.println("this is seq 3");	
	}
}
public class seq {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		myq3 mc = new myq3();	
			Method obj = mc.getClass().getMethod("method1");
		Annotation ann = obj.getAnnotation(Execute.class);
		Execute ts = (Execute)ann;
		System.out.println( ts.Sequence());
		System.out.println("this is seq 2");
	}

}