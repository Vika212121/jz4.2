public class Main {

    public static void main(String[] args) {
        BmiService IMT = new BmiService();

        double weight = 89;
        double height = 150;

        System.out.println("ИМТ равен: " + weight / (height * height));


    }
}
