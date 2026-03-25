package com.jfs.learn.exercism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnnalynsInfiltrationTest {

    @Test
    void canFastAttackTest() {
        assertFalse(AnnalynsInfiltration.canFastAttack(true));
    }

    @Test
    void cannotFastAttackTest() {
        assertTrue(AnnalynsInfiltration.canFastAttack(false));
    }

    @Test
    void canSpyTest() {
        assertTrue(AnnalynsInfiltration.canSpy(true, false, false));
        assertTrue(AnnalynsInfiltration.canSpy(false, true, false));
        assertTrue(AnnalynsInfiltration.canSpy(false, false, true));
        assertFalse(AnnalynsInfiltration.canSpy(false, false, false));
    }

    @Test
    void canSignalPrisonerTest() {
        assertTrue(AnnalynsInfiltration.canSignalPrisoner(false, true));
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(false, false));
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(true, false));
    }

}
