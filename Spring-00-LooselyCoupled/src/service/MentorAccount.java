package service;

import implementation.Mentor;

public class MentorAccount {
    Mentor mentor;

    public MentorAccount(Mentor mentor) {

        this.mentor = mentor;
    }

    public void manageAcoount(){

        this.mentor.createAccount();
    }
}
