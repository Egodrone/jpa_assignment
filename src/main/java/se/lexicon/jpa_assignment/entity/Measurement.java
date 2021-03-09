package se.lexicon.jpa_assignment.entity;


public enum Measurement {
    //TBSP, TSP, G, HG, KG, ML, CL, DL;
    TBSP(1), TSP(2), G(3), HG(4), KG(5),
    ML(6), CL(7), DL(8);
    //TBSP(100), TSP(100), G(100), HG(10), KG(1), ML(100), CL(100), DL(10);


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
