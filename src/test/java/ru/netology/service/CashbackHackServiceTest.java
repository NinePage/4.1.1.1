package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldUnder1000() {
        assertEquals(700, service.remain(300));
    }

    @Test
    public void shouldExactly1000() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldOver1000() {
        assertEquals(500, service.remain(2500));
    }
}