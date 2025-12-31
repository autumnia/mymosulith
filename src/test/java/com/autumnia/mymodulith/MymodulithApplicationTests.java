package com.autumnia.mymodulith;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest
//@SpringBootTest
class MymodulithApplicationTests {

	@Test
	void contextLoads() {
		ApplicationModules.of(MymodulithApplication.class).verify();
	}

}
