package taxes;

public class usnDokhodyMinusRaskhody extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit > credit ? (int) ((debit - credit) * 0.15) : 0;
    }
}
