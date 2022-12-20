package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //contactlist
    List<Contact> list = List.of(
            new Contact(1L, "Sam@gmail.com", "Sam", 901L),
            new Contact(1L, "Tam@gmail.com", "Tam", 901L),
            new Contact(2L, "Ram@gmail.com", "Ram", 902L),
            new Contact(3L, "Jam@gmail.com", "Jam", 903L)

    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getEmpId().equals(userId)).collect(Collectors.toList());
    }
}
