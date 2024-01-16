package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final ContactService contactService;

    public UserController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/insertSampleContact")
    public String insertSampleContact() {
        try {
            contactService.insertSampleContact();
            return "Contact inserted successfully!";
        } catch (Exception e) {
            logger.error("Failed to insert contact.", e);
            return "Failed to insert contact. Check logs for details.";
        }
    }
}
