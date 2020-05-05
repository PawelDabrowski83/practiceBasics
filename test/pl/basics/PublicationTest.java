package pl.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PublicationTest {

    @Test
    public void shouldPublicationMethodsWork() {

        // when
        Publication p = new Publication("The new era");

        // then
        assertEquals("The new era", p.getDetails());
        assertEquals("Publication: The new era", p.getInfo());
    }

    @Test
    public void shouldNewspaperWork() {

        // when
        Newspaper newspaper = new Newspaper("Football results", "Sport news");

        // then
        assertEquals("Football results", newspaper.getDetails());
        assertEquals("Newspaper (source - Sport news): Football results", newspaper.getInfo());
    }

    @Test
    public void shouldArticleWork() {

        // when
        Article article = new Article("Why the Sun is hot", "Dr James Smith");

        // then
        assertEquals("Why the Sun is hot", article.getDetails());
        assertEquals("Article (author - Dr James Smith): Why the Sun is hot", article.getInfo());
    }

    @Test
    public void shouldAnnouncementWork() {

        // when
        Publication announcement = new Announcement("Will sell a house", 30);

        // then
        assertEquals("Will sell a house", announcement.getDetails());
        assertEquals("Announcement (days to expire - 30): Will sell a house", announcement.getInfo());
    }
}
