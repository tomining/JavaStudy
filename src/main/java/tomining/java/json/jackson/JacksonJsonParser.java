package tomining.java.json.jackson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import tomining.java.json.jackson.jsonview.ViewModel;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

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

    public String toJson(Object obj) throws JsonProcessingException {
        return MAPPER.writeValueAsString(obj);
    }

    public void printPrettyJson(Object obj) throws JsonProcessingException {
        System.out.println(MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(obj));
    }

    public void printPrettyJson(Object obj, Class clazz) throws JsonProcessingException {
        System.out.println(MAPPER.writerWithView(clazz).withDefaultPrettyPrinter().writeValueAsString(obj));
    }
}
