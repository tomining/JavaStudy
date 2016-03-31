package tomining.java.json.jackson;

import org.apache.commons.collections.CollectionUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import tomining.java.json.jackson.model.User;

import static org.junit.Assert.*;

/**
 * Created by NAVER on 2016. 3. 28..
 */
public class JacksonJsonParserTest {
    private static JacksonJsonParser parser;

    @BeforeClass
    public static void init() {
        parser = new JacksonJsonParser();
    }

    @Test
    public void Jackson_파서_테스트() throws Exception {
        String jsonStr = "{\"user_id\" : \"tomining\", \"password\" : \"tomining_password\"}";
        User user = parser.readValue(jsonStr, User.class);

        assertEquals("tomining", user.getUserId());
        assertEquals("tomining_password", user.getPassword());
    }

    @Test
    public void Jackson_파서_테스트_2epth_JSON() throws Exception {
        String jsonStr = "{" +
                "\"user_id\" : \"tomining\", " +
                "\"password\" : \"tomining_password\", " +
                "\"role_list\" : [{\"role_id\" : \"role_01\", \"role_nm\" : \"1번권한\", \"role_lvl\" : \"1\"}]" +
                "}";
        User user = parser.readValue(jsonStr, User.class);

        assertTrue(CollectionUtils.isNotEmpty(user.getRoleList()));
        assertEquals("role_01", user.getRoleList().get(0).getRoleId());
        assertEquals("1번권한", user.getRoleList().get(0).getRoleName());
        assertEquals(1, user.getRoleList().get(0).getRoleLevel());
    }
}