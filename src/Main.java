public class Main {

    private static double weight = 50; // кг
    private static double height = 1.5; // м

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double total = service.calculate(weight, height);

        System.out.println(total);

    }
}
