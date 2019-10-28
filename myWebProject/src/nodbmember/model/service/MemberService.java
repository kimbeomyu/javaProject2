package nodbmember.model.service;

import nodbmember.model.vo.Member;

public class MemberService {
	private Member [] member = new Member [20];
	private int index = 0;
	
	public MemberService() {
		member[index++] = new Member("admin", "4885", "관리자");
		member[index++] = new Member("khiei", "1111", "당산지원");
		member[index++] = new Member("hello", "2222", "자바왕");
		member[index++] = new Member("java", "3333", "재밌어요");
	}
	
	public Member selectMember(String userId, String userPwd) {
		for(int i =0; i<index; i++) {
			if(member[i].getUserId().equals(userId)&&member[i].getUserPwd().equals(userPwd)) {
				// 넘어온 아이디와 비밀번호를 비교하는 if문
				// 넘어온 아디 비밀번호가 멤버객체배열에 있으면 반환하라
				return member[i];
			}
		}
		return null;
	}
	
	public boolean updateMember(String userId, String userPwd, String userName) {
		
		System.out.println(userId + " " + userPwd + " " + userName);
		
		for(int i =0; i < index; i++) {
			if(member[i].getUserId().equals(userId)) {
				member[i].setUserId(userId);
				member[i].setUserPwd(userPwd);
				member[i].setUserName(userName);
				return true;
			}
		}
		return false;
	}
}
