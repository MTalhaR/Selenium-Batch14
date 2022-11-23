package com.Syntax.HRMTest;

import com.Syntax.HRM.Login;
import com.Syntax.utils.CommonMethods;

public class loginPageTest {
    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        Login login =new Login();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();


    }

}
