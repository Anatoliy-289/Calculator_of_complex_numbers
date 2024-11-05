package model.util;

public interface Calculable {
    
    void sum(String realNumber1, String realNumber2);
    void multiply(String realNumber1, String realNumber2);
    void divide(String realNumber1, String realNumber2);
    void subtraction(String realNumber1, String realNumber2);
    double result();
    void clear();
}
