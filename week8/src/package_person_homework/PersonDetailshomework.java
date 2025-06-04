package package_person_homework;

public class PersonDetailshomework {


       public static void main(String[] args) {

Person firstPerson;

Person secondPerson;

Person thirdPerson;

Person fourthPerson;

// creating an object from my Person class
firstPerson = new Person();

secondPerson = new Person();

thirdPerson = new Person();

fourthPerson = new Person();

//assigning values to our fields

firstPerson.name = "Able";
firstPerson.age = 36;
firstPerson.gender = 'M';
firstPerson.carYear = 2013;
firstPerson.car = "Mercedes";
firstPerson.violations = false;
firstPerson.creditScore = 750;


secondPerson.name = "Manuel";
secondPerson.age = 40;
secondPerson.gender = 'M';
secondPerson.carYear = 2020;
secondPerson.car = "Hyundai";
secondPerson.violations = false;
secondPerson.creditScore = 600;


thirdPerson.name= "Maria";
thirdPerson.age = 65;
thirdPerson.gender = 'F';
thirdPerson.carYear = 2010;
thirdPerson.car = "Toyota";
thirdPerson.violations = true;
thirdPerson.creditScore = 650;


fourthPerson.name= "Rita";
fourthPerson.age = 50;
fourthPerson.gender = 'F';
fourthPerson.carYear = 2025;
fourthPerson.car = "Lexus";
fourthPerson.violations = false;
fourthPerson.creditScore = 700;


double monthlyRate = 0;
double adjustedRate = 0;


firstPerson.display();
System.out.print("Preliminary Rate for " + firstPerson.name+  ": "+firstPerson.getRate(monthlyRate) + " dollars ");
System.out.println();
System.out.println("Adjustments: " + (adjustedRate) + " $");
System.out.print("Here is " +firstPerson.name+ "'s total monthly premium: $ ");
System.out.printf("%.2f", firstPerson.assumeCarYear(adjustedRate) + firstPerson.getRate(monthlyRate));
System.out.println();

System.out.println();

secondPerson.display();
System.out.print("Preliminary Rate for " + secondPerson.name+ ": "+secondPerson.getRate(monthlyRate) + " dollars ");
System.out.println();
System.out.print("Adjustments: " +(adjustedRate) + " $" );
System.out.println();
System.out.print("Here is " +secondPerson.name+ "'s total monthly premium: $ ");
System.out.printf("%.2f", secondPerson.assumeCarYear(adjustedRate) + secondPerson.getRate(monthlyRate));
System.out.println();

System.out.println();

thirdPerson.display();
System.out.print("Preliminary Rate for " + thirdPerson.name+ ": "+thirdPerson.getRate(monthlyRate) + " dollars ");
System.out.println();
System.out.print("Adjustments: " +(adjustedRate) + " $" );
System.out.println();
System.out.print("Here is " +thirdPerson.name+ "'s total monthly premium: $ ");
System.out.printf("%.2f", thirdPerson.assumeCarYear(adjustedRate) + thirdPerson.getRate(monthlyRate));
System.out.println();

System.out.println();

fourthPerson.display();
System.out.print("Preliminary Rate for " + fourthPerson.name+ ": "+fourthPerson.getRate(monthlyRate) + " dollars");
System.out.println();
System.out.print("Adjustments: " +(adjustedRate) + " $" );
System.out.println();
System.out.print("Here is " +fourthPerson.name+ "'s total monthly premium: $ ");
System.out.printf("%.2f", fourthPerson.assumeCarYear(adjustedRate) + fourthPerson.getRate(monthlyRate));


    }

}