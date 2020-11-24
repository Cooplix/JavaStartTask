package Cabrio;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CabrioTest extends TestCase {
    private ByteArrayOutputStream output;
    private PrintStream old;

//    @Before
//    public void setUpStreams() {
//        old = System.out;
//        output = new ByteArrayOutputStream();
//        PrintStream stream = new PrintStream(output);
//        System.setOut(stream);
//    }
//
//    @After
//    public void cleanUpStreams() {
//        System.setOut(old);
//    }


    @Test
    public void testCarRunIsCarStop() {
        Cabrio cabrioTest = new Cabrio("TestName", "testBrend", false);
        output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        System.setOut(stream);

        cabrioTest.run();
        String result = output.toString();

        String template = "TestName run...\n";

        Assert.assertEquals(template, result);

        System.setOut(old);
    }

    @Test
    public void testCarRunIsCarRun() {
        Cabrio cabrioTest = new Cabrio("TestName", "testBrend", false);
        output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        System.setOut(stream);

        cabrioTest.setMove(true);
        cabrioTest.run();
        String result = output.toString();

        String template = "TestName now running\n";

        Assert.assertEquals(template, result);

        System.setOut(old);
    }


    @Test
    public void testCarStopIsCarStop() {
        Cabrio cabrioTest = new Cabrio("TestName", "testBrend", false);
        output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        System.setOut(stream);

        cabrioTest.stop();
        String result = output.toString();

        String template = "Can't stop, TestName is stopped\n";

        Assert.assertEquals(template, result);

        System.setOut(old);
    }
    @Test
    public void testCarStopIsCarRun() {
        Cabrio cabrioTest = new Cabrio("TestName", "testBrend", false);
        output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        System.setOut(stream);

        cabrioTest.setMove(true);
        cabrioTest.stop();

        String result = output.toString();

        String template = "TestName stopped\n";

        Assert.assertEquals(template, result);

        System.setOut(old);
    }

}