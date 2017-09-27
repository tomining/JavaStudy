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
public class Singer {
	@JsonView(ViewModel.DetailView.class)
	private String name;
	@JsonView(ViewModel.SummaryView.class)
	private String nickname;
	@JsonView(ViewModel.DetailView.class)
	private String managementCompany;
}
