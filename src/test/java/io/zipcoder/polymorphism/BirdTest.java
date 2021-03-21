package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class BirdTest extends TestCase {

    public void testTestGetName() {
        String givenName="Kiwi";
        Bird bird=new Bird(givenName);

        String actual= bird.getName();

        Assert.assertEquals(givenName,actual);
    }

    public void testTestSetName() {
        String givenName="Kiwi";
        Bird bird=new Bird(givenName);

        String expected="Charlie";
        bird.setName("Charlie");
        String actual= bird.getName();
        System.out.println(actual);

        Assert.assertEquals(expected,actual);
    }

    public void testSpeak() {
        String givenName="Charlie";
        Bird bird=new Bird(givenName);

        String expected="tweet!";
        String actual=bird.speak();

        Assert.assertEquals(expected, actual);
    }

    public void testTestSpeak() {
        String givenName="Charlie";
        Bird bird=new Bird(givenName);

        String expected="tweet!";
        String actual=bird.speak();

        Assert.assertEquals(expected, actual);
    }
}