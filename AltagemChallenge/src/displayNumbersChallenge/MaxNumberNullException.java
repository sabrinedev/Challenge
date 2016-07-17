package displayNumbersChallenge;

public class MaxNumberNullException extends EmptyException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Le nombre max doit etre different de zéro !";
	}
    
}
