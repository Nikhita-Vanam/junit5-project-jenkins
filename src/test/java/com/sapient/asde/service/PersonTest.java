package com.sapient.asde.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person;
    @BeforeEach
    void setUp() {
        person=new Person(123456789012L,"Nikhita", LocalDate.of(2000,12,23),"Vijayawada",9492390783L);
    }

    @AfterEach
    void tearDown() {
        person=null;
    }

    @Test
    void getAdharCardValidData() {
        //assertEquals(123456789012L,person.getAdharCard());
    }
    @Test
    void getAdharCardInvalidData() {
         //assertNotEquals(12346789012L,person.getAdharCard());
    }

    @Test
    void setAdharCard() {
    }

    @Test
    void getNameValidData() {
        //assertEquals("Nikhita",person.getName());
    }

    @Test
    void getNameInvalidData() {
        assertNotEquals("Nikhi",person.getName());
    }
    @Test
    void setName() {
    }

    @Test
    void getBirthdate() {
    }

    @Test
    void setBirthdate() {
    }

    @Test
    void getAddress() {
    }

    @Test
    void setAddress() {
    }

    @Test
    void getMobile() {
    }

    @Test
    void setMobile() {
    }

    @Test
    void testToString() {
    }
}
