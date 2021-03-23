package com.cos.costagram.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cos.costagram.domain.User;

public class PrincipalDetails implements UserDetails {
	private User user;
	
	public PrincipalDetails(User user) {
		this.user = user;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true ;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true ;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true ;
	}

	@Override
	public boolean isEnabled() {
		return true ;
	}
	
	//getAuthorities(): 계정이 갖고 있는 권한 목록을 리턴
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities(){//사용자가  가진 모든 롤 정보를 얻음
		Collection<GrantedAuthority> collectors= new ArrayList<>();
		collectors.add(()-> "ROLE_"+user.getRole().toString());
		return collectors;
	}

}
