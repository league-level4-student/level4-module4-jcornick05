package _04_hospital;

public class Patient {
	private boolean feelsCaredFor = false;

	public Object feelsCaredFor() {
		return feelsCaredFor;
	}

	public void checkPulse() {
		feelsCaredFor = true;
	}

}