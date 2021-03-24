package it.polito.tdp.corsi.model;

import java.util.List;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	
	private CorsoDAO corsoDao;
	
	public Model() {
		corsoDao = new CorsoDAO();
	}

	public List<Corso> getCorsiByPeriodo(Integer periodo) {
		return corsoDao.getCorsiByPeriodo(periodo);
	}
	
	
}
