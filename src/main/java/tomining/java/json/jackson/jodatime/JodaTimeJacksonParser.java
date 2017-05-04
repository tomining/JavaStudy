package tomining.java.json.jackson.jodatime;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import tomining.java.json.jackson.jodatime.model.User;

/**
 * Created by naver on 2017. 5. 4..
 */
public class JodaTimeJacksonParser {
	public User parse(String jsonStr) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(jsonStr, User.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
