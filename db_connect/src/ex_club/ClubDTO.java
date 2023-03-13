package ex_club;

public class ClubDTO {
	private int clubId;
	private String clubName;
	private String clubType;
	private String clubRoom;

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getClubType() {
		return clubType;
	}

	public void setClubType(String clubType) {
		this.clubType = clubType;
	}

	public String getClubRoom() {
		return clubRoom;
	}

	public void setClubRoom(String clubRoom) {
		this.clubRoom = clubRoom;
	}

	public ClubDTO(int clubId, String clubName, String clubType, String clubRoom) {
		super();
		this.clubId = clubId;
		this.clubName = clubName;
		this.clubType = clubType;
		this.clubRoom = clubRoom;
	}

	@Override
	public String toString() {
		return "ClubDTO [clubId=" + clubId + ", clubName=" + clubName + ", clubType=" + clubType + ", clubRoom="
				+ clubRoom + "]";
	}

}
