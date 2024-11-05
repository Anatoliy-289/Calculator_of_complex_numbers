package service;

import model.impl.RealNumber;
import model.impl.ImageNumber;

public class ComplexNumber1Service {
    
    //метод, который отвечает за создание первого комплексного числа
    public ComplexNumber1 createComplexNumber1(double realNumber1, double imageNumber1) {
        ComplexNumber1 complexNumber1 = new ComplexNumber1(realNumber1, imageNumber1);
        return complexNumber1;
    }
}