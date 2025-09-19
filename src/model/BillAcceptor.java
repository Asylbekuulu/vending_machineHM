package model;

public class BillAcceptor implements MoneyAcceptor {
    private int amountOfBill;

    public BillAcceptor(int amount) {
        this.amountOfBill = amount;
    }

    public int getAmount() {
        return amountOfBill;
    }

    public void setAmount(int amount) {
        this.amountOfBill = amount;
    }

    @Override
    public void paymentMethod() {

    }
}
