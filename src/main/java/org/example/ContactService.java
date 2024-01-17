package org.example;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Transactional
    public void insertSampleContact() {
        Contact contact = new Contact("John Doe", "Agent007", "123-456-7890");
        contactRepository.save(contact);
    }
}
