package tomining.java.Stream;

import lombok.Builder;
import lombok.Data;

/**
 * @author tomining
 * created on 2017. 12. 26.
 */
@Builder
@Data
public class Category {
  private String categoryId;
  private String languageCode;
  private String categoryName;
}
