package com.example.secondproject.seconddao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.secondproject.secondcontroller.Register;

@Repository
public class PrKeyDaoImpl implements PrKeyDao {
    
	@Autowired
	NamedParameterJdbcTemplate namedParameter;

	@Override
	public String enterDao(Register register) {

		KeyHolder holder = new GeneratedKeyHolder();
		
		

		String enterDept = "insert into department(branch_name,hod,branch_phno) values (:bname,:hod,:bphno)";

		MapSqlParameterSource parameters = new MapSqlParameterSource().addValue("bname", register.getBranch())
				.addValue("hod", register.getHod()).addValue("bphno", register.getBranchPh());

		namedParameter.update(enterDept, parameters, holder, new String[] {"branch_code"} );
		
		register.setBcode(holder.getKey().intValue());
		
	    String enterColl="insert into college(student_name,mobile_no,email,branch_code) values (:sname,:mobile,:email,:bcode)"; 
          	    		
	    parameters = new MapSqlParameterSource().addValue("sname", register.getSname())
				.addValue("mobile", register.getMobile()).addValue("email", register.getEmail()).addValue("bcode", register.getBcode());
	    
	    namedParameter.update(enterColl, parameters, holder);
	    return "success";
	}

}
