public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(70, 182);
        System.out.printf("%.1f", bmi);

    }
}
