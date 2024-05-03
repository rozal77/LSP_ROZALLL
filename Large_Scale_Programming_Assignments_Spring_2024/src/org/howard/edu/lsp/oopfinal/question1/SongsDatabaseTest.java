package org.howard.edu.lsp.oopfinal.question1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SongsDatabaseTest {

    @Test
    public void testAddSong() {
        SongsDatabase database = new SongsDatabase();
        database.addSong("Jazz", "Take Five");
        assertTrue(database.getSongs("Jazz").contains("Take Five"));
    }

    @Test
    public void testGetGenreOfSong() {
        SongsDatabase database = new SongsDatabase();
        database.addSong("Pop", "Shape of You");
        database.addSong("Rock", "Stairway to Heaven");
        assertEquals("Pop", database.getGenreOfSong("Shape of You"));
        assertEquals("Rock", database.getGenreOfSong("Stairway to Heaven"));
        assertNull(database.getGenreOfSong("Bohemian Rhapsody"));
    }

    @Test
    public void testGetSongs() {
        SongsDatabase database = new SongsDatabase();
        database.addSong("Rap", "Lose Yourself");
        database.addSong("Rap", "Stan");
        database.addSong("Rap", "Mockingbird");
        assertEquals(3, database.getSongs("Rap").size());
        assertTrue(database.getSongs("Rap").contains("Lose Yourself"));
        assertTrue(database.getSongs("Rap").contains("Stan"));
        assertTrue(database.getSongs("Rap").contains("Mockingbird"));
    }

    @Test
    public void testEmptyDatabase() {
        SongsDatabase database = new SongsDatabase();
        assertTrue(database.getSongs("Pop").isEmpty());
        assertNull(database.getGenreOfSong("Bohemian Rhapsody"));
    }
}
