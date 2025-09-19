package model;

public class CoinAcceptor implements MoneyAcceptor {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void paymentMethod() {
        setAmount(getAmount() + 10);
        System.out.println(("Вы пополнили баланс на 10 монет"));
    }

    @Override
    public String getMessage() {
        return "Монет на сумму: ";
    }
}
