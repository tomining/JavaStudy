package tomining.java.json.jackson.jsonview;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Builder;
import lombok.Data;

/**
 * @author tomining
 * created on 2017. 9. 22.
 */
@Data
@Builder
public class Track {
	private String trackId;
	private String trackTitle;
	private String trackNo;
	private String genre;
	@JsonView({ViewModel.DetailV3View.class, ViewModel.DetailV2View.class})
	private Singer singer;
}
