package com.varxyz.wgt.user.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.varxyz.wgt.user.domain.User;

@Repository("userDao")
public class UserDao {
	private JdbcTemplate jdbcTemplate;
	private User imgName;
	
	public UserDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	// 회원가입
	public void addUser(User user, String imgName) {
		String sql = "INSERT INTO User (userId, passwd, name, ssn, phone, addr1, addr2, addr3, addr4, imgName) "
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		
		jdbcTemplate.update(sql, user.getUserId(), user.getPasswd(), user.getName(), 
								user.getSsn(), user.getPhone(), user.getAddr1(), user.getAddr2(), user.getAddr3(), user.getAddr4(), imgName);
	}
	
	// 회원 조회
	public List<User> inquiryUser(String userId) {
		String sql = "SELECT * FROM User WHERE userId = ?";
		
//		// isEmpty : 문자열의 길이가 0인 경우 (맞으면 true, 틀리면 false 반환);
//		if( jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class), userId).isEmpty() ) {
//			List<User> userList = new ArrayList<User>();
//			User user = new User();
//			user.setUserId(""); // 유저에다가 "" 빈값을 넣어줌
//			userList.add(user);	// 그리고 리스트에다가 추가
//			userList.add(imgName);
//			return userList;
//		}
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class), userId);
	}
	
	// 회원정보 수정
	public void modifyUser(User user, String imgName) {
		String sql = "UPDATE User SET passwd = ?, name = ?, ssn = ?, phone = ?, addr1 = ?, addr2 = ?, addr3 = ?, addr4 = ?, imgName = ? WHERE  userId = ?";

		jdbcTemplate.update(sql, user.getPasswd(), user.getName(), user.getSsn(), user.getPhone(), user.getAddr1(),
								user.getAddr2(), user.getAddr3(), user.getAddr4(), imgName, user.getUserId());
		
	}
	
	// 회원탈퇴
	public void delete(String userId) {
		String sql = "DELETE FROM User WHERE userId = ?";
		
		jdbcTemplate.update(sql, userId);
	}
	
}
