package ru.netology.domain;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void currentStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(5);
        cond.setCurrentVolume(-1);
        int actual = cond.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void currentStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(-5);
        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void currentStation2() {
        Radio cond = new Radio();
        cond.setCurrentStation(20);
        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(5);
        cond.setNextStation();
        int actual = cond.getNextStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void nextStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        cond.setNextStation();
        int actual = cond.getNextStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(5);
        cond.setPrevStation();
        int actual = cond.getPrevStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void prevStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        cond.setPrevStation();
        int actual = cond.getPrevStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);
        int actual = cond.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-5);
        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(20);
        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void plusVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);
        cond.setPlusVolume();
        int actual = cond.getPlusVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void plusVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);
        cond.setPlusVolume();
        int actual = cond.getPlusVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void minusVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);
        cond.setMinusVolume();
        int actual = cond.getMinusVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void minusVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.setMinusVolume();
        int actual = cond.getMinusVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }
}
