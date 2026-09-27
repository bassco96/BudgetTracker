import java.util.ArrayList;

public class BudgetTracker {

    ArrayList<Expense> expenses;

    public BudgetTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense e){
        expenses.add(e);

    }

    public void viewExpenses(){
        if (expenses.isEmpty()){
            System.out.println("Budget is empty!");
            return;
        }
        for (Expense e: expenses){
            System.out.println(expenses.indexOf(e)+ 1 + ": " + e.toString());
        }

    }

    public void removeExpense(int e){
        expenses.remove(e -1);

    }

    public boolean isEmpty (){
        return expenses.isEmpty();
    }







}
