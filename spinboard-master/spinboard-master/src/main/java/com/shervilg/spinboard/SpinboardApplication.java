package com.shervilg.spinboard;

import org.springframework.boot.SpringApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCaching
@EnableScheduling
@SpringBootApplication
public class SpinboardApplication {

	public static void main(String[] args) {
		System.setProperty("com.amazon.ask.servlet.disableRequestSignatureCheck", "true");
		SpringApplication.run(SpinboardApplication.class, args);
	}
}
