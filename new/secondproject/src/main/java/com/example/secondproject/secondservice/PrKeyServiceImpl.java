package com.example.secondproject.secondservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.secondproject.secondcontroller.Register;
import com.example.secondproject.seconddao.PrKeyDao;

@Service
public class PrKeyServiceImpl implements PrKeyService {
	@Autowired
	PrKeyDao prKeyDao;

	@Override
	public String enterService(Register register) {
		
		return prKeyDao.enterDao(register) ;
	}

}
