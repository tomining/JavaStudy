package tomining.java.json.jackson.jsonview;

import java.io.Serializable;

/**
 * @author tomining
 * created on 2017. 9. 22.
 */
public abstract class ViewModel implements Serializable {
	public interface DefaultView {}
	public interface SummaryView extends DefaultView {}
	public interface DetailView extends SummaryView {}
	public interface DetailV2View extends SummaryView {}
	public interface DetailV3View extends SummaryView {}
}
