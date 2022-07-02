package ru.netology.domain;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio(10);
    @Test
    void currentStation() {
        radio.setCurrentStation(6);
        int actual = radio.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void currentStation1() {
        radio.setCurrentStation(-5);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void currentStation2() {
        radio.setCurrentStation(20);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void nextStation() {
        radio.setCurrentStation(5);
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);

    }

    @Test
    void nextStation1() {
        radio.setCurrentStation(9);
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void prevStation() {
        radio.setCurrentStation(5);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    void prevStation1() {
        radio.setCurrentStation(0);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }



    @Test
    void currentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void currentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int actual = radio.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    void currentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void currentVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void plusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setPlusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void plusVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setPlusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void plusVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.setPlusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void plusVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.setPlusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void minusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setMinusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void minusVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setMinusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }


    @Test
    void minusVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.setMinusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 49;
        assertEquals(expected, actual);
    }

    @Test
    void minusVolume3() {
        radio.setCurrentVolume(500);
        radio.setMinusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

}