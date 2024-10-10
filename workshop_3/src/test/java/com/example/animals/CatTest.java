package com.example.animals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CatTest {

    @Test
    void testGetName() {
        Cat cat = new Cat("Whiskers", 2);
        assertEquals("Whiskers", cat.getName());
    }

    @Test
    void testGetAge() {
        Cat cat = new Cat("Whiskers", 2);
        assertEquals(2, cat.getAge());
    }

    @Test
    void testIsAdult() {
        Cat youngCat = new Cat("Kitty", 1);
        Cat adultCat = new Cat("Whiskers", 2);
        assertFalse(youngCat.isAdult());
        assertTrue(adultCat.isAdult());
    }
}
