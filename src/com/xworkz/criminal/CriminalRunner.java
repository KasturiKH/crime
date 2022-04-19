package com.xworkz.criminal;

import com.xworkz.criminal.dao.CriminalDAO;
import com.xworkz.criminal.dao.CriminalDetails;
import com.xworkz.criminal.dto.CriminalDTO;

public class CriminalRunner {

	public static void main(String[] args) {
		CriminalDAO dao=new Criminal();
		CriminalDetails details=new CriminalDetails(dao);
		CriminalDTO dto=new CriminalDTO();
		dto.setId(234);
		dto.setName("Pradeep");
		dto.setOffense("murderer");
		dto.setImprisonment(4);
		dto.setJailName("bangalore");
		
		details.validateAndSave(dto);
		
		
		
		
		
		

	}

}
