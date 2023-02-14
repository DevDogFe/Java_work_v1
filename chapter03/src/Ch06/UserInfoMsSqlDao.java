package Ch06;

public class UserInfoMsSqlDao implements IUserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL: 저장 기능 호출");
		System.out.println("이름: " + userInfo.getUserName());
		System.out.println("PW: " + userInfo.getPw());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL: 수정 기능 호출");
		System.out.println("이름: " + userInfo.getUserName());
		System.out.println("PW: " + userInfo.getPw());
	}

	@Override
	public void deleteUserInfo(String userName) {
		System.out.println("MSSQL: 삭제 기능 호출");
		System.out.println("사용자 이름으로 삭제기능 호출: " + userName);		
	}

	@Override
	public void selectUserInfo(String userName) {
		System.out.println("MSSQL: 조회 기능 호출");
		System.out.println("사용자 이름으로 조회기능 호출: " + userName);		
	}

}
