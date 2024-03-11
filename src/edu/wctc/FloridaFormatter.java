package edu.wctc;

class FloridaFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String SSSS = driversLicense.getSSSS();
        int FFF = driversLicense.getFFF();
        int YY = driversLicense.getYY();
        int DDD = driversLicense.getDDD();
        int NN = driversLicense.getNN();

        return String.format("%s-%03d-%02d-%03d-%02d", SSSS, FFF, YY, DDD, NN);
    }
}