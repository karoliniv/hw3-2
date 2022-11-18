public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(61.1, 1.78);
        System.out.printf("ИМТ = %.2f", index);
    }
}
