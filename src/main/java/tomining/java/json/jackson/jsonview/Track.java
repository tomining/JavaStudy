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
	@JsonView(ViewModel.DefaultView.class)
	private String trackTitle;
	@JsonView(ViewModel.DefaultView.class)
	private String trackNo;
	@JsonView(ViewModel.SummaryView.class)
	private String genre;
	@JsonView(ViewModel.DetailView.class)
	private Singer singer;
}
