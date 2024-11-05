package view;

import controller.ComplexNumberController;

public class ComplexNumberView {
    private ComplexNumberController controller = new ComplexNumberController();

    public void start() {
        Scanner scanner = new Scanner(System.in);
           
        while (true) {
            System.out.println("1 - Выполнить арифметические операции с комплексными числами"); 
            System.out.println("2 - Выход");

            switch (scanner.nextInt()) {
                case 1 -> createComplexNumber();
                case 2 -> System.exit(0);
            
                default -> System.out.println("Операция не поддерживается.");
            }
        }
    }
    
    private ComplexNumber1 createComplexNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вещественное число a (realNumber1) первого комплексного числа: ");
        Double realNumber = scanner.nextLine();
        System.out.println("Введите мнимое число b (imageNumber1) первого комплексного числа: ");
        Double imageNumber = scanner.nextLine();
        System.out.println("Введите вещественное число c (realNumber2) второго комплексного числа: ");
        Double realNumber = scanner.nextLine();
        System.out.println("Введите мнимое число d (imageNumber2) второго комплексного числа: ");
        Double imageNumber = scanner.nextLine();  
        return controller.createComplexNumber(realNumber, imageNumber);
    }
}