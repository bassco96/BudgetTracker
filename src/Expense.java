public class Expense {

    private int amount;
    private String category;
    private int date;

    public Expense (int amount, String category, int date){
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    @Override
    public String toString () {

        return "Amount: $" + amount +
                ", Category:" + category +
                ", Date:" + date;
    }



}
