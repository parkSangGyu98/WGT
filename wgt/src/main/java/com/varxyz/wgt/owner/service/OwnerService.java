package com.varxyz.wgt.owner.service;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.wgt.data.DataSourceConfig;
import com.varxyz.wgt.owner.dao.OwnerDao;
import com.varxyz.wgt.owner.doamin.Owner;

public interface OwnerService {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DataSourceConfig.class);
	
	OwnerDao ownerDao = context.getBean("ownerDao", OwnerDao.class);

	// 점주 추가
	public void addOwner(Owner owner);

	// 점주 정보 가져오기
	public List<Owner> findAllOwner(String ownerId);

	// 점주 수정
	public void modifyOwner(Owner owner);

	// 점주 삭제
	public void delete(String ownerId);
		
}
