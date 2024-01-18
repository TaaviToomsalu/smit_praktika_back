package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public interface ContactRepository extends JpaRepository<Contact, Long>{
    List<Contact> findAllByOrderByFullNameAsc();
    List<Contact> findByFullNameContainingIgnoreCase(String name);
}