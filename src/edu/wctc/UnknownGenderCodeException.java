package edu.wctc;

class UnknownGenderCodeException extends Exception {
    public UnknownGenderCodeException(char genderCode) {
        super("Unknown gender code: " + genderCode);
    }
}