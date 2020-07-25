package org.techhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.dto.Register;
import org.techhub.repository.RegisterRepository;

@Service("registerService")
public class RegisterService {

	@Autowired
     RegisterRepository registerRepository;
	
	public boolean isRegister(Register register)
	{
		Register r=registerRepository.save(register);
		if(r!=null)
		{
			return true;
		}
		else
		{
		   return false;
		}
	}
}
