package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

        Movie first = new Movie(1, "Bloodshot", "thriller", "1.png");
        Movie second = new Movie(2, "Onward", "cartoon", "2.png");
        Movie third = new Movie(3, "HotelBelgrad", "comedy", "3.png");
        Movie fourth = new Movie(4, "Gentlemen", "thriller", "4.png");
        Movie fifth = new Movie(5, "InvisibleMan", "horror", "5.png");
        Movie sixth = new Movie(6, "Trolls", "cartoon", "6.png");
        Movie seventh = new Movie(7, "NumberOne", "comedy", "7.png");
        Movie eighth = new Movie(8, "MyLittlePony", "cartoon", "8.png");
        Movie ninth = new Movie(9, "Venom2", "thriller", "9.png");
        Movie tenth = new Movie(10, "Titan", "horror", "10.png");
        Movie eleventh = new Movie(11, "Chan-chi", "thriller", "11.png");

    Movie[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

    @Test
    public void shouldUseConstructor () {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        MovieManager[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }



}