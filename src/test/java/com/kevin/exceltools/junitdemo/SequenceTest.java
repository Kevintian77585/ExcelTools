package com.kevin.exceltools.junitdemo;

import org.junit.*;


/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/2621:44
 */
public class SequenceTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BeforeClass()");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("AfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After()");
    }

    public SequenceTest() {
        System.out.println("new SequenceTest()");
    }

    @Test
    public void testA() {
        System.out.println("testA()");
    }

    @Test
    public void testB() {
        System.out.println("testB()");
    }

    @Test
    public void testC() {
        System.out.println("testC()");
    }
}
