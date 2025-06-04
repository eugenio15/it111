package package_person_homework;

public class Person {


    String name;

    String car;

    double creditScore;

    boolean violations;

    int age;

    int carYear;

    char gender;

    public void display() {

        System.out.println("Customer name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Violations: "+ violations);
        System.out.println("Credit Score: "+ creditScore);
        System.out.println("Car Year: "+ carYear);
        System.out.println("Gender" + gender);


    }

    public double getRate (double monthlyRate) {
        if(violations == true  && creditScore <= 750) {
            monthlyRate = 600;

        } else {
            monthlyRate = 120.00;

        }
        return monthlyRate;

    }

    public double assumeCarYear(double adjustedRate) {
        if(carYear <= 2023 && carYear >= 2020) {
            adjustedRate = 200;
        } else {
            adjustedRate = 0;
        }
        return  adjustedRate;
    }

}