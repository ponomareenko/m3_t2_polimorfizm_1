import taxes.TaxSystem;
import taxes.usnDokhody;

public class Main {
    static void main(String[] args) {
        TaxSystem taxSystem1 = new usnDokhody();
        Company company1 = new Company("Danfos", taxSystem1);

        company1.debit = 1000;
        company1.credit = 200;
        company1.amount = 100;
        company1.shiftMoney(company1.amount);

//        System.out.println(company1.debit);
//        System.out.println(company1.credit);

        company1.payTaxes();
    }
}