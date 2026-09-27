public class Expense {

    // Expense information is set when the object is created
    // and should not change afterward.
    private final int amount;
    private final String category;
    private final int date;

    public Expense(int amount, String category, int date) {
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    // Provides a readable representation of an expense when displayed.
    @Override
    public String toString() {
        return "Amount: $" + amount +
                ", Category: " + category +
                ", Date: " + date;
    }
}