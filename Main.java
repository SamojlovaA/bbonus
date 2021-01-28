public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        long miles = (long) service.calculate(20_000);
        System.out.println(miles);
    }
}