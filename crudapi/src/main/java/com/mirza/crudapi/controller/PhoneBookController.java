package com.mirza.crudapi.controller;

import com.mirza.crudapi.entity.PhoneBook;
import com.mirza.crudapi.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhoneBookController {
    @Autowired
    private PhoneBookService service;

    @GetMapping("/phonebook")
    public List<PhoneBook> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/phonebook/{id}")
    public PhoneBook getProduct(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PutMapping("/update")
    public PhoneBook update(@RequestBody PhoneBook phoneBook) {
        return service.updatePhoneBook(phoneBook);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePhoneBook(@PathVariable int id) {
        return service.deletePhoneBook(id);
    }
}
