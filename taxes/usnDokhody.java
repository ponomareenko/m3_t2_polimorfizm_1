package taxes;

public class usnDokhody extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return 6 / 100 * debit;
    }
}
