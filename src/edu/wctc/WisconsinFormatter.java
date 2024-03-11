package edu.wctc;

class WisconsinFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String SSSS = driversLicense.getSSSS();
        int FFF = driversLicense.getFFF();
        int YY = driversLicense.getYY();
        int DDD = driversLicense.getDDD();
        int NN = driversLicense.getNN();

        return String.format("%s-%03dY-%03d-%02d", SSSS, FFF, DDD, NN);
    }
}
