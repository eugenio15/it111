public class LitersToGallonsConverter {



    public static void main(String[] args) {

        int counter = 0;

        for(double Gallon = (double)1.0F; Gallon <= (double)100.0F; Gallon += (double)4.0F) {
            double liter = Gallon * 3.79;
            ++counter;
            System.out.printf("%.2f", liter);
            if (Gallon == (double)1.0F) {
                System.out.println(" liters = " + Gallon + " Gallon");
            } else {
                System.out.println(" liters = " + Gallon + " Gallons");
            }

            if (counter == 5) {
                System.out.println();
                counter = 0;


            }
        }

        System.out.println("We are done!!!");
    }
}
