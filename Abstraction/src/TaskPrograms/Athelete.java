package TaskPrograms;

//import java.util.Date;

public abstract class Athelete {

	 String name;
    String nickName;
	 int dateOfBirth;
	 String team;
	 int numberOfMatches;

	public Athelete(String name, String nickName,int dateOfBirth,  String team, int numberOfMatches) {
//		super();
		this.name = name;
		this.nickName = nickName;
		this.dateOfBirth = dateOfBirth;
		this.team = team;
		this.numberOfMatches = numberOfMatches;
	}

	public String getName() {
		return this.name;
	}

	public String getNickName() {
		return this.nickName;
	}

	public String getTeam() {
		return team;
	}

	public void getBioData() {
		System.out.println("full name:  " + getName());
		System.out.println("Nick name:  " + getNickName());
		System.out.println("Team Name:  " + getTeam());

	}

	public void compititions() {
		System.out.println(" no of world compititions played: " + numberOfMatches);

	}

	public abstract String bodyType();

//	@Override
//	public void medicalQualification() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void physicalTest() {
//		// TODO Auto-generated method stub
//
//	}

}



