package tomining.java.json.gson;

import com.google.gson.Gson;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;

/**
 * Created by NAVER on 2016. 3. 31..
 */
public class GsonJsonParser {
    public <T> T fromJson(String jsonStr, Class<T> clazz) throws IOException {
        if (StringUtils.isBlank(jsonStr)) {
            return null;
        }

        return new Gson().fromJson(jsonStr, clazz);
    }

    public <T> String toJson(T t) {
        return new Gson().toJson(t);
    }
}
