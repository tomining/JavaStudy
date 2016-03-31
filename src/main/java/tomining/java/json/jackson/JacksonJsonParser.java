package tomining.java.json.jackson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;

/**
 * Created by tomining on 2016. 3. 28..
 */
public class JacksonJsonParser {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public <T> T readValue(String jsonStr, Class<T> clazz) throws IOException {
        if (StringUtils.isBlank(jsonStr)) {
            return null;
        }

        return MAPPER.readValue(jsonStr, clazz);
    }
}
