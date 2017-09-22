package tomining.java.json.jackson.jsonview;

import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * @author tomining
 * created on 2017. 9. 22.
 */
@Data
@Builder
public class Album {
	private String albumId;
	private String albumName;
	private Singer representSinger;
	private List<Track> tracks;
}
