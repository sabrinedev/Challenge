package displayNumbersChallenge;

public class MaxNumInfMinNumException extends EmptyException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @Override
    public String getMessage() {
    	// TODO Auto-generated method stub
    	return "Le nombre min doit etre inferieur au nombre max !";
    }
}
