package member.model.vo;

public class Member {
	private String userId;
	private String userPwd;
	private String userName;
	
	public Member() {};
	
	public Member(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "이름 : "
				+ this.userName + "/ 아이디 : " 
				+ this.userId + "/ 비밀번호 : " 
				+ this.userPwd;
	}
	
	
}
