import java.util.Scanner;

public class Item 
{
	String n;
	int c;
	double wt;
	double twt;
	double smod;
	double comod;
	double dmod;
	double inmod;
	double wmod;
	double chmod;
	public enum t={Weapon, Consumable, Re-usable, Quest};
	String desc;
	
	public Item(String n, int c, double wt, double smod, double comod, double dmod, double inmod, double wmod, double chmod, enum t, String desc)
	{
		this.n = n;
		this.c = c;
		this.wt = wt;
		this.twt = c*wt;
		this.smod = smod;
		this.comod = comod;
		this.dmod = dmod;
		this.inmod = inmod;
		this.wmod = wmod;
		this.chmod = chmod;
		this.t = t;
		this.desc = desc;
	}
	
	public String setDesc()
	{
		Scanner Desc = new Scanner(System.in);
		desc = Desc.nextLine();
		Desc.close();
		return desc;
	}
	
	public void ItemLog()
	{
		// Sets GSheet"ItemLog" to AllItems[][]
	}
	
	public void add(int count)
	{
		this.c = count;
		this.twt = this.wt * this.c;
	}
	
}
