package core;

import org.testng.annotations.*;

public class AppTest {



      @Test(enabled=true, description = "Test A" , groups = "g1")
      public void aTest() {System.out.println("" + Thread.currentThread().getId());}
      
      @Test(enabled=true, description = "Test B" , groups = "g2")
      public void bTest() {System.out.println("" + Thread.currentThread().getId());}
      
      @Test(enabled=true, description = "Test C" , groups = "g3")
      public void cTest() {System.out.println("" + Thread.currentThread().getId());}
}