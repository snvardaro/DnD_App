
public class Inventory 
{
	Item[] itm;
	int itmct;
	double smod=0;
	double comod=0;
	double dmod=0;
	double inmod=0;
	double wmod=0;
	double chmod=0;
	
	void getMods(Character Char)
	{
		Char.smod += this.smod;
		Char.comod += this.comod;
		Char.dmod += this.dmod;
		Char.inmod += this.inmod;
		Char.wmod += this.wmod;
		Char.chmod += this.chmod;
	}
	
	void addItem(Character Char, String iname)
	{
	    	Boolean indx;
	    	int search;
	    	int irow, icol;
	    	
	    	indx = 2DbinarySearch(AllItems[][], 0, AllItems.length(), iname);
	    	
	    	if(indx > -1)
	    	{	
			search = binarySearch(this.itm[].n, this.itmct, iname);
			if(search > -1)
			{
				++this.itm[search].c;
			}
			else 
		    	{
		    		// sets this.itm[inserted row in order] = Allitems[indx][all columns]	
		    	}
	    	}
	    	else
	    	{
	    		indx = 2DbinarySearch(AllItems[][], 0, AllItems.length(), iname);
	    	}
	    	
	    	Char.inv.itmct = this.itm.length;
	}
	
}
