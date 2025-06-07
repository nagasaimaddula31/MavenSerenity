package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.javafaker.Faker;

public class nameUtil {

	private static final Faker faker = new Faker();

	public static String getName() {
		return faker.name().firstName().replaceAll("[^A-Za-z]", "");

        
		//dcdvdhvj stashing chnages

		
		
		//user1 chnages updated 

    }
}
