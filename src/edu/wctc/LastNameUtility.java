package edu.wctc;

class LastNameUtility {

    public String encodeLastName(String lastName) throws MissingNameException {
        if (lastName.isBlank()) {
            throw new MissingNameException("last name");
        }

        lastName = lastName.replaceAll("\\s", "").toUpperCase();

        return (lastName.length() >= 4) ? lastName.substring(0, 4) : lastName + "XXX";
    }
}