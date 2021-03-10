package se.lexicon.jpa_assignment.entity;


public enum Measurement {
    TBSP(1), TSP(2), G(3), HG(4), KG(5),
    ML(6), CL(7), DL(8);

    private int measurementCode;

    Measurement(int measurementCode) {
        this.measurementCode = measurementCode;
    }

    public int getMeasurementCode() {
        return measurementCode;
    }

    public void setMeasurementCode(int measurementCode) {
        this.measurementCode = measurementCode;
    }

}
