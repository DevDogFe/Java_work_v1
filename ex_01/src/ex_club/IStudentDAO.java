package ex_club;

import java.util.ArrayList;

public interface IStudentDAO {

	// 학생 리스트 조회
	ArrayList<StudentDTO> showList();

	// 학생 추가
	void create(StudentDTO dto);

	// 학생 클럽 가입시키기
	void join(int studentId, int clubId);

	void join(int studentId, int clubId, String joinDate);

}
