package q6;

public class test {

		public static void main(String[] args) {
			 
			persistance obj1 = new filepersistance();
			persistance obj2 = new databasepersistance();
			
			
			obj1.persist();
			obj2.persist();

		}

	}