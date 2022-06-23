public class BmiService {

    public double calculate(double weight, double height) {

        double IMT = weight / (height * height);
        if (IMT < 16.5) {
            System.out.println("Крайний недостаток веса");
        } else if (IMT <= 16.5 && IMT < 18.4) {
            System.out.println("Недостаток в весе");
        } else if (IMT <= 18.5 && IMT < 24.9) {
            System.out.println("Нормальный вес тела");
        } else if (IMT <= 25 && IMT < 30) {
            System.out.println("Избыточная масса тела");
        } else if (IMT <= 30.1 && IMT < 34.9) {
            System.out.println("Ожирение");
        } else if (IMT <= 35 && IMT < 40) {
            System.out.println("Тяжелое ожирение)");
        } else if (IMT > 40) {
            System.out.println("Крайне тяжелое ожирение");
        }
            return IMT;
    }
}
