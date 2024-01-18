package org.example;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Transactional(readOnly = true)
    public Iterable<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public List<Contact> getContactsByName(String name) {
        return contactRepository.findByFullNameContainingIgnoreCase(name);
    }

    @Transactional(readOnly = true)
    public List<Contact> getSortedContacts() {
        return contactRepository.findAllByOrderByFullNameAsc();
    }

    @Transactional(readOnly = true)
    public Contact getContactById(Long id) {
        return contactRepository.findById(id).orElse(null);
    }

    @Transactional
    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Transactional
    public Contact updateContact(Long id, Contact updatedContact) {
        if (contactRepository.existsById(id)) {
            updatedContact.setId(id);
            return contactRepository.save(updatedContact);
        }
        return null; // You might want to handle this case differently, e.g., throw an exception
    }

    @Transactional
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
