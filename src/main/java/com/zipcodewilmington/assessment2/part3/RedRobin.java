package com.zipcodewilmington.assessment2.part3;

public class RedRobin  extends Bird implements Animal{
    String migrationMonth = "";

    public String move() {

        return "fly";
    }

    public void setMigrationMonth(String expected) {
        this.migrationMonth = expected;
    }

    public String getMigrationMonth() {

        return migrationMonth;
    }

    public int getSpeed(){
        return 0;
    }
    public String color(){
        return "red";
    }
}
