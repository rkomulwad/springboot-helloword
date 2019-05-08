package com.sb.sample.sbhelloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * This component runs a health check if the "--health-check" option was passed into the command line, and terminates
 * with the appropriate exit code.
 */
@Component
public class CliHealthCheck implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(CliHealthCheck.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		if(args.containsOption("health-check")) {
			if(args.containsOption("unhealthy")) {
				logger.warn("********************");
				logger.warn("Application is DOWN.");
				logger.warn("********************");

				System.exit(1);
			} else {
				logger.warn("******************");
				logger.warn("Application is UP.");
				logger.warn("******************");

				System.exit(0);
			}
		}
	}

}
