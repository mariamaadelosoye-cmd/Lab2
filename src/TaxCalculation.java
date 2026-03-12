import java.math.BigDecimal;


public class TaxCalculation {
    public void main(){

        double VAT= 1.23;
        double netPrice = 9.99;
        double grossPrice= netPrice*VAT;
        double grossPriceOfTenThousand= grossPrice*10000;
        double exVAT = grossPriceOfTenThousand/1.23;


        BigDecimal netPriceBD= new BigDecimal("9.99");
        BigDecimal  vat = new BigDecimal("1.23");
        BigDecimal grossPriceBD= netPriceBD.multiply(vat);
        BigDecimal grossPrice10k= grossPriceBD.multiply(new BigDecimal("10000"));
        BigDecimal exVATBD= grossPrice10k.divide(vat);


        System.out.println("Using Double: "+exVAT);
        System.out.println("Using Big Decimal: " + exVATBD);

        /* Conclusion: Big Decimal provides the precision required for currency,
         while with Double it has a rounding error */

    }
}
