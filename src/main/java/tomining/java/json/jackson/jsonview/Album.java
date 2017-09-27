package tomining.java.json.jackson.jsonview;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;
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
	@JsonView(ViewModel.DefaultView.class)
	private String albumName;
	@JsonView(ViewModel.SummaryView.class)
	private Singer representSinger;
	@JsonView(ViewModel.SummaryView.class)
	private List<Track> tracks;
}
