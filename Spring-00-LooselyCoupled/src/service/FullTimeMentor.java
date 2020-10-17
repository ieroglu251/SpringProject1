package service;

import implementation.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println( "full time mentor account created");
    }
}
