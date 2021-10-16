package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    MovieManager manager = new MovieManager();

    private Movie first = new Movie(1, "Bloodshot", "thriller", "1.png");
    private Movie second = new Movie(2, "Onward", "cartoon", "2.png");
    private Movie third = new Movie(3, "HotelBelgrad", "comedy", "3.png");
    private Movie fourth = new Movie(4, "Gentlemen", "thriller", "4.png");
    private Movie fifth = new Movie(5, "InvisibleMan", "horror", "5.png");
    private Movie sixth = new Movie(6, "Trolls", "cartoon", "6.png");
    private Movie seventh = new Movie(7, "NumberOne", "comedy", "7.png");
    private Movie eighth = new Movie(8, "MyLittlePony", "cartoon", "8.png");
    private Movie ninth = new Movie(9, "Venom2", "thriller", "9.png");
    private Movie tenth = new Movie(10, "Titan", "horror", "10.png");
    //private Movie eleventh = new Movie(11, "Chan-chi", "thriller", "11.png");


    Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

    @Test
    public void shouldShowMovie() {
        MovieManager manager = new MovieManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        Movie[] expected = {fifth, fourth, third, second, first};
        Movie[] actual = manager.getLastAdd();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowMovieToo() {
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
        Movie[] actual = manager.getLastAdd();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNewMovie() {
        MovieManager manager = new MovieManager(4);
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
        Movie movieToAdd = new Movie(11, "Chan-Chi", "thriller", "11.png");
        manager.add(movieToAdd);
        Movie[] actual = manager.getLastAdd();
        Movie[] expected = {new Movie(11, "Chan-Chi", "thriller", "11.png"), tenth, ninth, eighth};
        assertArrayEquals(expected, actual);
    }
}