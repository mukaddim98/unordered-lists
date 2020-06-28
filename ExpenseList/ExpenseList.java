public class ExpenseList
{
	// attributes
	private List<Expense> expenses;
	
	// constructor
	public ExpenseList()
	{
		expenses = new List<Expense>();
	}

	// add item to list
	public void add(Expense exp)
	{
		expenses.add(exp);
	}
	// check if list is empty
	public boolean isEmpty()
	{
		return expenses.isEmpty();
	}
	// check if list contains an item
	public boolean contains(Expense exp)
	{
		return expenses.contains(exp);
	}
	// get the first item in the list
	public Expense first()
	{
		return expenses.first();
	}
	// get the next item in the list
	public Expense next()
	{
		return expenses.next();
	}
	// enumerate the list
	public void enumerate()
	{
		expenses.enumerate();
	}

	// find the maximum expense from list
	public double maxExpense()
	{
		double max =0.0, amt;
		Expense exp = expenses.first();
		while (exp!=null)
		{
			amt = exp.getAmount();
			if (amt>max)
				max = amt;
			exp = expenses.next();
		}
		return max;
	}

	// find the minimum expense from the list
	public double minExpense()
	{
		double min =Double.MAX_VALUE, amt;
		Expense exp = expenses.first();
		if (exp==null) return 0.0;
		else
		{
		
			while (exp!=null)
			{
				amt = exp.getAmount();
				if (amt<min)
					min = amt;
				exp = expenses.next();
			}
		}
		return min;
	}

	// find the average expense from the list
	public double avgExpense()
	{
        double avg = this.totalExpense()/expenses.size();
		return avg;
	}

	// find the total expense from the list
	public double totalExpense()
	{
		double total = 0.0, amt;
		Expense exp = expenses.first();
		if (exp==null) return 0.0;
		else
		{

			while (exp!=null)
			{
				amt = exp.getAmount();
				total += amt;
				exp = expenses.next();
			}
		}
		return total;
	}

	// find the total spent on a specific item
	public double amountSpentOn(String expItem)
	{

		double total = 0.0, amt;
		String item;
		Expense exp = expenses.first();
		if (exp==null) return 0.0;
		else
		{

			while (exp!=null)
			{
				item = exp.getItem();
				if(item.equals(expItem)){
					total += exp.getAmount();
				}
				exp = expenses.next();
			}
		}
		return total;
	}
	
	
}
