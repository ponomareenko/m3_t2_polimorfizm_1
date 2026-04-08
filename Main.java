import taxes.TaxSystem;
import taxes.usnDokhody;
import taxes.usnDokhodyMinusRaskhody;

public class Main {
    static void main(String[] args) {
        TaxSystem taxSystem1 = new usnDokhody();
        Company company1 = new Company("Danfos", taxSystem1);

        company1.setTaxSystem(new usnDokhodyMinusRaskhody());

        company1.debit = 900;
        company1.credit = 200;
        company1.amount = 100;

        company1.shiftMoney(company1.amount);

        company1.payTaxes();
    }
}
