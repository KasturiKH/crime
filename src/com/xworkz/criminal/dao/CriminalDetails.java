package com.xworkz.criminal.dao;

import com.xworkz.criminal.dto.CriminalDTO;

public class CriminalDetails {
	
	private CriminalDAO dao;

	public CriminalDetails(CriminalDAO dao) {
		super();
		this.dao = dao;
	}
		
		public void validateAndSave(CriminalDTO dto) {
			
			if (dto!=null)
			{
				
			
			if(dto.getId()>0 && dto.getName().length()>3 && dto.getName().length()<50 && dto.getImprisonment()>0 && dto.getJailName().length()>12 && dto.getJailName().length()<30)
			{
				boolean de=dao.save(dto);
				System.out.println("criminal " +dto);
				System.out.println(de);
			}
		}
		}
}
	



