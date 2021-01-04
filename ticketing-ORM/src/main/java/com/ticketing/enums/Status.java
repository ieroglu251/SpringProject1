package com.ticketing.enums;

public enum Status {

    OPEN("Open"), IN_PROGRESS("in progress"), UAT_TEST("uat Testin"), COMPLETE("Complete");

    private final String value;

    private Status(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}
