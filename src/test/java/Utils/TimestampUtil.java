package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.javafaker.Faker;

public class TimestampUtil {

	private static final Faker faker = new Faker();

	public static String getCurrentTimestamp() {
		String name = faker.name().firstName().replaceAll("[^A-Za-z]", "");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        return sdf.format(new Date())+name;
    }
}
