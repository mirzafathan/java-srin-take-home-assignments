package com.mirza.crudapi.service;

import com.mirza.crudapi.entity.PhoneBook;
import com.mirza.crudapi.repository.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneBookService {
    @Autowired
    private PhoneBookRepository repository;

    // READ
    public List<PhoneBook> getProducts() {
        return repository.findAll();
    }
    public PhoneBook getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    //UPDATE
    public PhoneBook updatePhoneBook(PhoneBook phoneBook) {
        PhoneBook existing = repository.findById(phoneBook.getPhoneBookId()).orElse(null);
        existing.setFirstName(phoneBook.getFirstName());
        existing.setLastName(phoneBook.getLastName());
        existing.setPhoneNumber(phoneBook.getPhoneNumber());
        return repository.save(existing);
    }

    // DELETE
    public String deletePhoneBook(int id) {
        repository.deleteById(id);
        return "phonebook deleted for user id:" + id;
    }
}
