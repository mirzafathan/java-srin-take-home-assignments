package com.mirza.crudapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "phone_book")

public class PhoneBook {
    @Id
    @GeneratedValue
    private int PhoneBookId;
    private String FirstName;
    private String LastName;
    private int PhoneNumber;
}