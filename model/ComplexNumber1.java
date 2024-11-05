package model;

public class ComplexNumber1 {
        
    protected double realNumber1;
    protected double imageNumber1;
    
    public ComplexNumber1(double realNumber1, double imageNumber1) {
        this.realNumber1 = realNumber1;
        this.imageNumber1 = imageNumber1;
    }

    @Override
    public String toString() {
        return String.format("ComplexNumber1 = {realNumber1: %s " + " imageNumber1: %s " * " i}", 
        complexNumber.getRealNumber(), complexNumber.getImageNumber());
    }
}
