package com.shop.project.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.project.dto.MemberDTO;

@Mapper
public interface MemberRepository {
	public void insert(MemberDTO dto);
}
