package TaskPrograms;

public class Football extends Athelete {

	 private static final String Completionyards = null;
	int playerYards;
     int completionyards;
	 

	public Football(String name, String nickName, int dateOfBirth, String team, int numberOfMatches,
			int playerYards, int completionyards ) {
		super(name, nickName, dateOfBirth, team, numberOfMatches);
		this.completionyards = completionyards;
		this.playerYards = playerYards;
		
	}

	@Override
	public void getBioData() {
		super.getBioData();
		System.out.println(" current team Completionyards " + Completionyards);

	}

	@Override
	public void compititions() {
		super.compititions();
		System.out.println(" plyer running yards:  " + playerYards);
	}

	@Override
	public String bodyType() {
		return " musculer strength , atheletic and sprinter ";
	}

	@Override
	public String toString() {
		return "FootBallPlayer [playerYards=" + playerYards + ", completionyards=" + completionyards +  "," 
				+   "\n";
	}
}
