package model;

public class ComplexNumber2 {
    
    protected double realNumber2;
    protected double imageNumber2;
    
    public ComplexNumber2(double realNumber2, double imageNumber2) {
        this.realNumber2 = realNumber2;
        this.imageNumber2 = imageNumber2;
    }

    @Override
    public String toString() {
        return String.format("ComplexNumber2 = {realNumber2: %s " + " imageNumber2: %s " * " i}", 
        complexNumber.getRealNumber(), complexNumber.getImageNumber());
    }
}
