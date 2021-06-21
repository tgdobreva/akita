package com.github.tgdobreva.akita.service;

import java.util.Objects;

import com.github.tgdobreva.akita.controller.LoggingController;
import com.github.tgdobreva.akita.model.dto.LoggingLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Slf4jLoggingService implements LoggingService {

	private static final Logger LOG = LoggerFactory.getLogger(LoggingController.class);

	@Override
	public void log(LoggingLevel level) {
		Objects.requireNonNull(level, "Logging level parameter must not be null");

		switch (level) {
			case TRACE -> LOG.trace("Logging message in TRACE");
			case DEBUG -> LOG.debug("Logging message in DEBUG");
			case INFO -> LOG.info("Logging message in INFO");
			case WARN -> LOG.warn("Logging message in WARN");
			case ERROR -> LOG.error("Logging message in ERROR");
		};
	}
}
