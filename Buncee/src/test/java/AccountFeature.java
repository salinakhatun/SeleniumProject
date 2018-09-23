import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class AccountFeature extends SubBase {

    public AccountFeature() throws IOException { }

    @Test
    public void login() throws Exception {

     loginToAccount();
     takeTheScreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
    }

//    @Test
//    public void logout() throws Exception {
//        loginToAccount();
//
//      //  logoutFromAccount();
//    }



//    @Test
//    public void addAddress() throws InterruptedException {
//
//        loginToAccount();
//
//
//
//
//    }



//
//    @Test
//    public void changeName() throws InterruptedException {
//
//
//    }






}
