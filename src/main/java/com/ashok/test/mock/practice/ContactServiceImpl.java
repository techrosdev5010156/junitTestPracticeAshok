package com.ashok.test.mock.practice;

import com.dao.easy.mock.practice.IContactDao;

public class ContactServiceImpl implements IContactService {

	
private 	IContactDao iContactDao;

	public void setiContactDao(IContactDao iContactDao) {
	this.iContactDao = iContactDao;
}

	public String findNameById(int id) {
		// TODO Auto-generated method stub
		String name1=iContactDao.getName( 101);
		if(name1 != null){
			return name1;
		}
		return null;
	}

}
