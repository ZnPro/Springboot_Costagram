package com.cos.costagram.domain.user;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
//모델 만들기
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 30, unique = true)
	private String username;
	//json파싱 불가 설정
	@JsonIgnore
	private String password;
	
	private String name;
	private String website;//자기 홈페이지
	private String bio;//자기소개
	private String email;
	private String phone;
	private String gender;
	
	private String profileImageUrl;
	private String provider;//제공자 구글,페북,네이버
	
	private String role; //USER, ADMIN
	
	@CreationTimestamp
	private Timestamp createDate;

}
