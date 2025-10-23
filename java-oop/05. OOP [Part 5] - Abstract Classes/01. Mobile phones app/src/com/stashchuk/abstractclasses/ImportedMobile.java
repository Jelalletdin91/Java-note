package com.stashchuk.abstractclasses;

public abstract class ImportedMobile extends MobilePhone {

    private double importDuty; // in percentage (%)

    public ImportedMobile() {}

    public ImportedMobile(
        String model,
        String company,
        int ram,
        String processor,
        int storage,
        double price,
        double importDuty
    ) {
        super(model, company, ram, processor, storage, price);
        this.importDuty = importDuty;
    }

    @Override
    public double calculatePrice() {
        double importDutyPercentage =  (this.getPrice() * this.importDuty) / 100;
        return this.getPrice() + importDutyPercentage;
    }

    @Override
    public String toString() {
        return super.toString() + " {importDuty = %" + importDuty + "}";
    }

    public double getImportDuty() {
        return importDuty;
    }

    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }
}
