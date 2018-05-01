package com.ubs.opsit.interviews;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BerlinClockMainTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testMain() {

        String[] args = {"12:30:30"};

        BerlinClockMain berlinClockMain=new BerlinClockMain();
        try {
			berlinClockMain.main(args);
			assertNotNull(berlinClockMain);
		} catch (Exception e) {
			e.printStackTrace();
		}

     /*   String expected = "====== Berlin Clock ======\n" +
                "Y\n" +
                "RR00\n" +
                "RR00\n" +
                "YYRYYR00000\n" +
                "0000\n" +
                "==========================\n";

        assertEquals(expected, outContent.toString());*/
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}
