package _04_hospital;

public class Surgeon extends GeneralPractitioner {
	public Boolean performsSurgery() {
		return true;
	}

	public Boolean makesHouseCalls() {
		return false;
	}
}