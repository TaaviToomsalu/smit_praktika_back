package org.example;

import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void insertSampleContact() {
        Contact contact = new Contact("John Doe", "Agent007", "123-456-7890");
        contactRepository.save(contact);
    }
}
