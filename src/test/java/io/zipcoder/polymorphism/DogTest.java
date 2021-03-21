package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class DogTest extends TestCase {

    public void testTestGetName() {
        String givenName="Milo";
        Dog dog=new Dog(givenName);

        String actual= dog.getName();

        Assert.assertEquals(givenName,actual);
    }

    public void testTestSetName() {
        String givenName="Milo";
        Dog dog=new Dog(givenName);

        String expected="Jenny";
        dog.setName("Jenny");
        String actual= dog.getName();
        System.out.println(actual);

        Assert.assertEquals(expected,actual);
    }

    public void testSpeak() {
        String givenName="Milo";
        Dog dog=new Dog(givenName);

        String expected="bark!";
        String actual=dog.speak();

        Assert.assertEquals(expected, actual);
    }

    public void testTestSpeak() {
        String givenName="Milo";
        Dog dog=new Dog(givenName);

        String expected="bark!";
        String actual=dog.speak();

        Assert.assertEquals(expected, actual);
    }
}