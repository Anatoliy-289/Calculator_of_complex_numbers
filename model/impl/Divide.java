package model.impl;

import model.util.Calculable;

private class Divide implements Calculable {
    
    private double realNumber1;
    private double imageNumber1;
    private double realNumber2;
    private double imageNumber2;

    String divide = ((realNumber1 * realNumber2 + imageNumber1 * imageNumber2) / 
                    (realNumber2 * realNumber2 + imageNumber2 * imageNumber2)) + 
                    ((imageNumber1 * realNumber2 - realNumber1 * imageNumber2) / 
                    (realNumber2 * realNumber2 + imageNumber2 * imageNumber2) * i);
}