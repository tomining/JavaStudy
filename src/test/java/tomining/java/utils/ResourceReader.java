package tomining.java.utils;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

/**
 * Created by naver on 2017. 5. 4..
 * @since
 */
public class ResourceReader {
	public static String fileReader(String fileName) {
		ClassLoader classLoader = MethodHandles.lookup().lookupClass().getClassLoader();
		try {
			return IOUtils.toString(classLoader.getResourceAsStream(fileName), Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
//		String str = ResourceReader.fileReader("/data/json/jackson/JodaTimeJsonSample.json");
//		System.out.println(str);

		System.out.println(ResourceReader.class.getClassLoader().getResource("data/json").getPath());
	}
}
