package com.github.tgdobreva.akita.controller;

import com.github.tgdobreva.akita.model.dto.LoggingLevel;
import com.github.tgdobreva.akita.service.LoggingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logging")
public class LoggingController {

	private final LoggingService loggingService;

	public LoggingController(LoggingService loggingService) {
		this.loggingService = loggingService;
	}

	@GetMapping("/log")
	public void log(@RequestParam(required = true) LoggingLevel level) {
		loggingService.log(level);
	}
}
