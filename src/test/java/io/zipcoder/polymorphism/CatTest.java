package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class CatTest extends TestCase {

    public void constructorTest(){
        String givenName="Zula";
        Cat cat=new Cat(givenName);

        String actual= cat.getName();

        Assert.assertEquals(givenName,actual);

    }

    public void testTestGetName() {
        String givenName="Zula";
        Cat cat=new Cat(givenName);

        String actual= cat.getName();

        Assert.assertEquals(givenName,actual);


    }

    public void testTestSetName() {
        String givenName="Zula";
        Cat cat=new Cat(givenName);

        String expected="Karina";
        cat.setName("Karina");
        String actual= cat.getName();
        System.out.println(actual);

        Assert.assertEquals(expected,actual);
    }

    public void testSpeak() {
        String givenName="Zula";
        Cat cat=new Cat(givenName);

        String expected="meow!";
        String actual=cat.speak();

        Assert.assertEquals(expected, actual);
    }

    public void testTestSpeak() {
        String givenName="Zula";
        Cat cat=new Cat(givenName);

        String expected="meow!";
        String actual=cat.speak();

        Assert.assertEquals(expected, actual);
    }
}