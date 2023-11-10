package com.kh.demo.mapper;

import com.kh.demo.domain.dto.FileDTO;
import com.kh.demo.domain.dto.ProfileDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProfileMapper {
	int insertFile(ProfileDTO profile);
	
	List<ProfileDTO> getProFiles(String trainerId);


	List<ProfileDTO> getFiles(String trainerId);


	
	int deleteBySystemname(String sysName);
	
	int deleteByBoardnum(Long boardNum);
}
