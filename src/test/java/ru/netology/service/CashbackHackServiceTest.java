package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldUnder1000() {
        assertEquals(service.remain(300), 700);
    }

    @Test
    public void shouldExactly1000() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldOver1000() {
        assertEquals(service.remain(2500), 500);
    }
}