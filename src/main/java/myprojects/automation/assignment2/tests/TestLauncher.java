package myprojects.automation.assignment2.tests;

public class TestLauncher {
    public static void main(String[] args) throws Exception {
        LoginTest loginTest = new LoginTest();
        loginTest.loginCheck();
        CheckMainMenuTest check = new CheckMainMenuTest();
        check.menuClick();
    }



}
