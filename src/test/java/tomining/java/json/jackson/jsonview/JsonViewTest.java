package tomining.java.json.jackson.jsonview;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import tomining.java.json.jackson.JacksonJsonParser;

/**
 * @author tomining
 * created on 2017. 9. 22.
 */
public class JsonViewTest {
	private static JacksonJsonParser parser;

	@BeforeClass
	public static void init() {
		parser = new JacksonJsonParser();
	}

	@Test
	public void nonJsonViewTest() throws Exception {
		Album album = Album.builder()
			.albumId("albumId")
			.albumName("albumName")
			.representSinger(
				Singer.builder()
					.name("singerName")
					.nickname("singerNickname")
					.managementCompany("managementCompany")
				.build()
			)
			.tracks(
				Arrays.asList(
					Track.builder()
						.trackId("trackId1")
						.trackNo("1")
						.trackTitle("No.1 Track")
						.genre("genre")
						.singer(
							Singer.builder()
								.name("singerName")
								.nickname("singerNickname")
								.managementCompany("managementCompany")
							.build()
						)
						.build()
				)
			)
			.build();

		parser.printPrettyJson(album, ViewModel.SummaryView.class);
	}
}
