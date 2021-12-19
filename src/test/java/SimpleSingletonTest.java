import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "/my-config.xml")
class SimpleSingletonTest {

	@Autowired
	private SimpleSingleton simpleSingleton;

	@Test
	void test() {
		Assertions.assertNotNull(simpleSingleton);
		System.out.println(simpleSingleton);
	}
}
