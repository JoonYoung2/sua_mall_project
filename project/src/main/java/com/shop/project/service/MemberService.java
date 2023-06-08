package com.shop.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.project.dto.MemberDTO;
import com.shop.project.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository repo;

	public void insert(MemberDTO dto) {
		repo.insert(dto);

	}

}
