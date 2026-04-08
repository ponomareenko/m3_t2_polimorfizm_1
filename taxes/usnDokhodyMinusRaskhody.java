package taxes;

public class usnDokhodyMinusRaskhody extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (debit - credit) * 15 / 100;
    }
}
