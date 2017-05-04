package tomining.java.json.jackson.jodatime;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Test;

import tomining.java.json.jackson.jodatime.model.User;
import tomining.java.utils.ResourceReader;

/**
 * Created by naver on 2017. 5. 4..
 */
public class JodaTimeJacksonParserTest {
	private JodaTimeJacksonParser parser = new JodaTimeJacksonParser();

	@Test
	public void JodaTime을_포함한_Json_파싱() {
		User user = parser.parse(ResourceReader.fileReader("data/json/jackson/JodaTimeJsonSample.json"));
		assertNotNull(user);
	}
}