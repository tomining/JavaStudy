package tomining.java.json.gson;

import org.apache.commons.collections.CollectionUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import tomining.java.json.gson.model.Role;
import tomining.java.json.gson.model.User;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by NAVER on 2016. 3. 31..
 */
public class GsonJsonParserTest {
    private static GsonJsonParser parser;

    @BeforeClass
    public static void init() {
        parser = new GsonJsonParser();
    }

    @Test
    public void gson_파서_테스트() throws Exception {
        String jsonStr = "{\"user_id\" : \"tomining\", \"password\" : \"tomining_password\"}";
        User user = parser.fromJson(jsonStr, User.class);

        assertEquals("tomining", user.getUserId());
        assertEquals("tomining_password", user.getPassword());
    }

    @Test
    public void gson_파서_테스트_2depth_JSON() throws Exception {
        String jsonStr = "{" +
                "\"user_id\" : \"tomining\", " +
                "\"password\" : \"tomining_password\", " +
                "\"role_list\" : [{\"role_id\" : \"role_01\", \"role_nm\" : \"1번권한\", \"role_lvl\" : \"1\"}]" +
                "}";
        User user = parser.fromJson(jsonStr, User.class);

        assertTrue(CollectionUtils.isNotEmpty(user.getRoleList()));
        assertEquals("role_01", user.getRoleList().get(0).getRoleId());
        assertEquals("1번권한", user.getRoleList().get(0).getRoleName());
        assertEquals(1, user.getRoleList().get(0).getRoleLevel());
    }

    @Test
    public void gson_to_json_파서_테스트() throws Exception {
        String expectedUserJsonStr = "{\"user_id\":\"tomining\",\"password\":\"tomining_password\",\"role_list\":[]}";

        User user = createUser("tomining", "tomining_password");

        String userJsonStr = parser.toJson(user);
        assertEquals(expectedUserJsonStr, userJsonStr);
    }

    @Test
    public void gson_to_json_파서_테스트_2depth_JSON() throws Exception {
        String expectedUserJsonStr = "{" +
                "\"user_id\":\"tomining\"," +
                "\"password\":\"tomining_password\"," +
                "\"role_list\":[{\"role_id\":\"role_01\",\"role_nm\":\"1번권한\",\"role_lvl\":1}]" +
                "}";

        User user = createUser("tomining", "tomining_password", createRole("role_01", "1번권한", 1));

        String userJsonStr = parser.toJson(user);
        assertEquals(expectedUserJsonStr, userJsonStr);
    }

    private User createUser(String userId, String password, Role... roles) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setRoleList(Arrays.asList(roles));

        return user;
    }

    private Role createRole(String roleId, String roleName, int roleLevel) {
        Role role = new Role();
        role.setRoleId(roleId);
        role.setRoleName(roleName);
        role.setRoleLevel(roleLevel);

        return role;
    }
}