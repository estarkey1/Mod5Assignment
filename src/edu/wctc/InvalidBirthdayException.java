package edu.wctc;

class InvalidBirthdayException extends Exception {
    public InvalidBirthdayException(int year, int month, int day) {
        super("Invalid birthday: " + year + "-" + month + "-" + day);
    }
}
