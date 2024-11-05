package controller;

import service.ComplexNumber1Service;

public class ComplexNumberController {
    
    private ComplexNumber1Service service = new ComplexNumber1Service();
    
    public ComplexNumber1 createComplexNumber(double realNumber, double imageNumber) {
        return service.createComplexNumber(realNumber, imageNumber);
    }
}
