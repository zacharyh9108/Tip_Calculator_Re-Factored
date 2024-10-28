public class TipCalculator {
    private final double bill;
    private final double tip;
    private final int ppl;

    public TipCalculator(double bill, double tip, int ppl) {
        this.bill = bill;
        this.tip = tip;
        this.ppl = ppl;
    }

    public double amountOfTip() {
        return Math.round((bill * tip / 100) * 100.00) / 100.00;
    }

    public double tipPerPpl() {
        return Math.round((amountOfTip() / ppl) * 100.00) / 100.00;
    }

    public double totalBill() {
        return Math.round((bill + amountOfTip()) * 100.00) / 100.00;
    }

    public double totalPerPpl() {
        return Math.round((totalBill() / ppl) * 100.00) / 100.00;
    }
}
