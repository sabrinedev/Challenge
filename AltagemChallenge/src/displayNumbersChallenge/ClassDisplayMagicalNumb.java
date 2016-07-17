package displayNumbersChallenge;


public class ClassDisplayMagicalNumb {

	
	public boolean IsMultipleOf(int pImul,int pInum)
	{
		if((pInum % pImul)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
    }
	
	public boolean DisplayMagicalNumber(int pImin,int pImax) throws  EmptyException 
	{  
		
		if(pImax==0)throw (new MaxNumberNullException() );
		else if(pImax<pImin) throw (new MaxNumInfMinNumException ());
		else if (pImax==pImin) throw (new MaxEqualsMinException());
		else{
			
			for(int tIcount=pImin+1 ; tIcount<pImax ;tIcount++)
			{
				
				if(IsMultipleOf(3,tIcount)){System.out.println("H");}
				else if(IsMultipleOf(5,tIcount)){System.out.println("S");}
				else {System.out.println(tIcount);}
			}
			return true;
		}
		
	}
	
	
}
