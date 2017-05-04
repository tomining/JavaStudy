package tomining.java.json.jackson.jodatime.model;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * Created by naver on 2017. 5. 4..
 */
@Data
@Builder
public class User {
	private String id;
	private String password;
	private DateTime registYmdt;
}
