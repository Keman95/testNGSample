package com.javacodegeeks.testng.maven.testngMaven;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class TestNgMavenExampleTest {
 
    @Test
    public void exampleOfTestNgMaven() {
        System.out.println("------Test 1------");
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine", str);
    }
    
}
