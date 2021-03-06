package org.bidtime.test;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by bidtime on 2015/11/6. Basic Test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-config.xml",
		"classpath:spring-dataSource.xml"
	})

@Ignore
public class BasicTest {

//	public Page newPage() {
//		return newPage(1, 10);
//	}
//
//	public Page newPage(Integer size) {
//		return newPage(1, size);
//	}
//
//	public Page newPage(Integer idx, Integer size) {
//		Page page = new Page();
//		page.setNo(idx);
//		page.setSize(size);
//		return page;
//	}
	
	public void print(Object dto) {
		if (dto != null) {
			System.out.println(dto);
		} else {
			System.out.println("null");
		}
	}
	
}
