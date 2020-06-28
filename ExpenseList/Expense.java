import java.text.DecimalFormat;
public class Expense
{
    // attributes
	private double amount;
	private String item;
	private String date;
	private static final DecimalFormat dollar = new DecimalFormat("0.00");

	// constructor
	public Expense(String date, String item, double amount)
	{
		this.date = date;
		this.item = item;
		this.amount = amount;
	}

	// toString
	public String toString()
	{
		return date + "\t" + item + "\t\t" + dollar.format(amount) + "\n";
	}

	// overridden equals method
	public boolean equals(Expense other)
	{
		return (item.equals(other.getItem())&&date.equals(other.getDate())&&amount==other.getAmount());
		
	}

	// getters
	public String getItem()
	{
		return item;
	}
	public String getDate()
	{
		return date;
	}
	public double getAmount()
	{
		return amount;
	}
	
	
}