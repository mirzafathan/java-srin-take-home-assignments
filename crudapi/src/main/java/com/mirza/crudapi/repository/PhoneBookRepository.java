package com.mirza.crudapi.repository;

import com.mirza.crudapi.entity.PhoneBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneBookRepository extends JpaRepository<PhoneBook, Integer> {}
