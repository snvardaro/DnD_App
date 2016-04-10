
public class Character 
{
	//Abilities
	String n; //name
	String r; //race
    String cl; //class
    double lvl; //level
    double s; //strength
    double smod; //str mod
    double co; //constitution
    double comod;
    double d; //dexterity
    double dmod;
    double in; //intelligence
    double inmod;
    double w; //wisdom
    double wmod;
    double ch; //charisma
    double chmod;
    //Encounter Info
    double ac; //armor class
    double i; //initiative
    double sp; //speed
    double thp; //total HP
    double chp; //current HP
    double dsuc; //death save successes
    double dfail; //death save fails
    //Skills
    double acr;
    double anh;
    double arc;
    double ath;
    double dec;
    double his;
    double ins;
    double intim;
    double inves;
    double med;
    double perc;
    double perf;
    double pers;
    double rel;
    double slh;
    double stl;
    double sur;
    //Item Info
    Inventory inv; //inventory (array of items)
    double cap; //carrying capacity
    
    void Character(String cname)
    {
    	n = cname;
    	lvl = 1;
    	setr();
    	setcl();
    	setabil();
    	sethp();
    	setsk();
    	setCap();
    	setinv();
    }
    
    String setr()
    {
    	
    	return this.r;
    }
    
    String setcl()
    {
    	
    	return this.cl;
    } 
    
    void setabil()
    {
    	
    }
    
    void sethp()
    {
    	//this.thp = [stuff]
    	//this.chp = this.thp;
    }
    
    void setsk()
    {
    	//Based on abilities, set the skills accordingly
    }
    
    void setinv()
    {
    	/*
    	 * for(int row=0; row < 2; row++)
    	 * {
    	 * 		for(int col=0; col < 11; col++)
    	 * 		{
    	 * 			this.inv.itm[row][col].add(AllItems[row][col]);
    	 * 			this.inv.itmct = this.inv.itm.size();
    	 * 		}
    	 * }
    	 * Array[][] = [GSheet:"AllItems"$A$0];
    	 * 
    	*/
    }
    
    double setCap()
    {
        cap = s*15;
        return cap;
    }
    
    //void dSave(dsuc, dfail)
    
}
