package Lesson_10;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExamples {
    @Parameters({"messaging", "numbers"})
 //   @Test
 //   public void method(String browser, String baseURL){
 //       System.out.println(browser);
 //       System.out.println(baseURL);



    public void messagingMethod(String messaging, String numbers){
        System.out.println(messaging);
        System.out.println(numbers);
    }
}
