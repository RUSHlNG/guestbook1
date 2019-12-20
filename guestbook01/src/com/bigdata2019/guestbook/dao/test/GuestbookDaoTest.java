package com.bigdata2019.guestbook.dao.test;

import java.util.List;

import com.bigdata2019.guestbook.dao.GuestbookDoa;
import com.bigdata2019.guestbook.vo.GuestbookVo;
public class GuestbookDaoTest {
	public static void main(String[] args) {
		testFindAll();
		testInsert();
	}

	private static void testFindAll() {
		List<GuestbookVo> list = new GuestbookDoa().findAll();
		for(GuestbookVo vo : list ) {
			System.out.println(vo);
		}
		
	}
	
	private static void testDelete() {
		new GuestbookDoa().delete(3L, "123456");
	}
	public static void testInsert() {
		GuestbookVo vo = new GuestbookVo();
		vo.setName("rlr");
		vo.setPassword("123456");
		vo.setContents("asdkdlf");
	}
	
	
}
