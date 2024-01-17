package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {


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
            // Use the existing method in ContactService
            contactService.insertSampleContact();

            return "Contact inserted successfully!";
        } catch (Exception e) {

            return "Failed to insert contact. Error: " + e.getMessage();
        }
    }
}
