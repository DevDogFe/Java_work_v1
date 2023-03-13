package ex_club;

import java.util.ArrayList;

public interface IClubDAO {

	// 클럽 추가
	void create(ClubDTO dto);

	// 클럽 회원수 조회
	int countMember(int clubId);

	int countMember(String clubName);

	// 클럽 멤버 명단 조회
	ArrayList<StudentDTO> showMemberList(int clubId);

	ArrayList<StudentDTO> showMemberList(String clubName);

}
