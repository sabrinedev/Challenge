package displayNumbersChallenge;

public class MaxEqualsMinException extends EmptyException {

	private static final long serialVersionUID = 1L;

@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return "Les deux nombres doivent etre differents !";
}
}
