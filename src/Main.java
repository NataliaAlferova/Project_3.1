public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusMiles = (int) service.calculate(10000, 20);
        System.out.println(bonusMiles);

    }
}
