package tomining.java.stream;

import static java.util.stream.Collectors.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import org.junit.Test;

import com.google.common.collect.Lists;
import tomining.java.Stream.Category;

/**
 * @author tomining
 * created on 2017. 12. 26.
 */
public class ToMapExample {
  @Test
  public void duplicateKeyError() {
    List<Category> categories = Lists.newArrayList(
      Category.builder().categoryId("KO_01").languageCode("ko").build(),
      Category.builder().categoryId("KO_02").languageCode("ko").build()
    );

    Map<String, Category> categoryMap = categories.stream().collect(toMap(Category::getLanguageCode, Function.identity()));

    assertThat(categoryMap.size(), is(1));
  }

  @Test
  public void mergeFunctionExample() {
    List<Category> categories = Lists.newArrayList(
      Category.builder().categoryId("KO_01").languageCode("ko").build(),
      Category.builder().categoryId("KO_02").languageCode("ko").build()
    );

    Map<String, Category> categoryMap = categories.stream().collect(toMap(Category::getLanguageCode, Function.identity(), firstPriority()));

    assertThat(categoryMap.size(), is(1));
  }

  private <T> BinaryOperator<T> firstPriority() {
    return (u,v) -> { return u; };
  }

  @Test
  public void groupingByExample() {
    List<Category> categories = Lists.newArrayList(
      Category.builder().categoryId("KO_01").languageCode("ko").build(),
      Category.builder().categoryId("KO_02").languageCode("ko").build()
    );

    Map<String, List<Category>> categoryMap = categories.stream().collect(groupingBy(Category::getLanguageCode, toList()));

    assertThat(categoryMap.size(), is(1));
  }
}
