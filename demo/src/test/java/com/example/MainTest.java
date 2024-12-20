package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
public class MainTest {
    @Test
    public void povtor1() {
        String s = "s";
        String i = "5";
        String expected = "sssss";
        String actual = Main.pop(s, i);
        assertEquals(expected, actual);
    }
    @Test
    public void povtor11ExceptionEmpty() {
        String s = "s ";
        String s2 = "-1";
        assertThrows(IllegalArgumentException.class, () -> {
            Main.pop(s, s2);
        });
    }
    @Test
    public void povtor1ExceptionLetter() {
        String s = "s ";
        String s2 = "n";
        assertThrows(IllegalArgumentException.class, () -> {
            Main.pop(s, s2);
        });
    }

    @Test
    public void vhod2() {
        String s1 = "Привет друг ";
        String s2 = "друг";
        int expected = 1;
        int actual = Main.vhod(s1, s2);
        assertEquals(expected, actual);
    }
    @Test
    public void vhod2ExceptionEmpty() {
        String s1 = "Привет друг ";
        String s2 = "";
        assertThrows(IllegalArgumentException.class, () -> {
            Main.vhod(s1, s2);
        });
    }
    @Test
    public void vhod2null() {
        String s1 = "Привет друг ";
        String s2 = "Hello";
        int expected = 0;
        int actual = Main.vhod(s1, s2);
        assertEquals(expected, actual);
    }
    @Test
    public void vhod2two() {
        String s1 = "привет привет друг ";
        String s2 = "привет";
        int expected = 2;
        int actual = Main.vhod(s1, s2);
        assertEquals(expected, actual);
    }
    @Test
    public void vhod2Letter() {
        String s1 = "привет привет друг ";
        String s2 = "пр";
        int expected = 2;
        int actual = Main.vhod(s1, s2);
        assertEquals(expected, actual);
    }
    @Test
    public void onetwo3() {
        String s = "12345 ";
        String expected = " один два три 45 ";
        String actual = Main.onetwo (s);
        assertEquals(expected, actual);
    }
    @Test
    public void one() {
        String s = "145 ";
        String expected = " один 45 ";
        String actual = Main.onetwo (s);
        assertEquals(expected, actual);
    }
    @Test
    public void two3() {
        String s = "245 ";
        String expected = "два 45 ";
        String actual = Main.onetwo (s);
        assertEquals(expected, actual);
    }
    @Test
    public void one3() {
        String s = "1345 ";
        String expected = " один три 45 ";
        String actual = Main.onetwo (s);
        assertEquals(expected, actual);
    }
    @Test
    public void onetwono() {
        String s = "45 ";
        String expected = "45 ";
        String actual = Main.onetwo (s);
        assertEquals(expected, actual);
    }

    @Test
    public void oneTwoException() {
        String s = "";
        assertThrows(IllegalArgumentException.class, () -> {
            Main.onetwo(s);
        });
    }

    @Test
    public void delete4() {
        String s = "12345 ";
        String expected = "135";
        String delete = Main.delete(s);
        String actual = delete;
        assertEquals(expected, actual);
    }
    @Test
    public void deleteException() {
        String s = "";
        assertThrows(IllegalArgumentException.class, () -> {
            Main.delete(s);
        });
    }
}