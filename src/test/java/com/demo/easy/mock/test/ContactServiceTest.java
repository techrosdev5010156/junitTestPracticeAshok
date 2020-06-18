package com.demo.easy.mock.test;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Ignore;
import org.junit.Test;

import com.ashok.test.mock.practice.ContactServiceImpl;
import com.dao.easy.mock.practice.IContactDao;

public class ContactServiceTest {
	
	@Test
	@Ignore
	public void contactServiceDao_01() {
		IContactDao proxydao=EasyMock.createMock(IContactDao.class);
		
		EasyMock.expect(proxydao.getName(101)).andReturn( "rakshayas");
		EasyMock.replay(proxydao);
		ContactServiceImpl iContactServiceImpl=new ContactServiceImpl();
		iContactServiceImpl.setiContactDao(proxydao);
		String name=iContactServiceImpl.findNameById( 101);
		assertNotNull(name);
		
	}

}
