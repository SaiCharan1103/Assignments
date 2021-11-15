package q4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class all {
	
	@BeforeEach
	void init() {
		System.out.println("string is intialized");	
	}
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up");
	}

}
