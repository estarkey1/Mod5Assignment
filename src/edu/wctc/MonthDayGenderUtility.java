package edu.wctc;

class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day, char genderCode)
            throws UnknownGenderCodeException, InvalidBirthdayException {
        if (genderCode != CODE_MALE && genderCode != CODE_FEMALE) {
            throw new UnknownGenderCodeException(genderCode);
        }

        if (month < 1 || month > 12 || day < 1 || day > 31) {
            throw new InvalidBirthdayException(year, month, day);
        }

        int genderModConstant = (genderCode == CODE_MALE) ? MOD_MALE : MOD_FEMALE;
        return (month - 1) * 40 + day + genderModConstant;
    }
}
