package model;

import java.util.*;

import dao.*;

public class GetMutterListLogic {
	public List<Mutter> execute() {
		MutterDAO dao = new MutterDAO();
		List<Mutter> mutterList = dao.findAll();
		return mutterList;
	}
}
