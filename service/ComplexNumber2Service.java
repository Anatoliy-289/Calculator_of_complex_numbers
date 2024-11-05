package service;

import model.impl.RealNumber;
import model.impl.ImageNumber;

public class ComplexNumber2Service {
    
    //метод, который отвечает за создание второго комплексного числа
    public ComplexNumber2 createComplexNumber2(double realNumber2, double imageNumber2) {
        ComplexNumber2 complexNumber2 = new ComplexNumber2(realNumber2, imageNumber2);
        return complexNumber2;
    }
}
