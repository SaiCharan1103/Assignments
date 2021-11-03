package q1;

public class singletone {
		private static singletone single_instance = null;
		public String s;
		private singletone()
		{
			s = "Hello I am a string part of Singleton class";
		}
		public static singletone getInstance()
		{
			if (single_instance == null)
				single_instance = new singletone();

			return single_instance;
		}
	}
	class GFG {
		public static void main(String args[])
		{
			singletone x = singletone.getInstance();

			singletone y = singletone.getInstance();

			singletone z = singletone.getInstance();
			System.out.println("Hashcode of x is "
							+ x.hashCode());
			System.out.println("Hashcode of y is "
							+ y.hashCode());
			System.out.println("Hashcode of z is "
							+ z.hashCode());

			if (x == y && y == z) {

				System.out.println(
					"Three objects point to the same memory location on the heap i.e, to the same object");
			}

			else {
				System.out.println(
					"Three objects DO NOT point to the same memory location on the heap");
			}
		}
	}