package com.bsamuel.exercise.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCharacterTest {

    @Test
    void removeCharacter() {
        String result = RemoveCharacter.removeCharacter("Hellow World", 'o');

        assertEquals("Hellw Wrld", result);
    }
}