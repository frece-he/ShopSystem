package test.web.frece.shop.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import web.frece.shop.dao.SuccessKilledDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml" })
public class SuccessKilledDaoTest {
	
	@Resource
	private SuccessKilledDao successKilledDao;
	
	@Test
	public void testInsertSuccessKilled()throws Exception {
		int res = successKilledDao.insertSuccessKilled(100000, "frece");
		System.out.println(res);
	}

	@Test
	public void testQueryByIdWithSeckill()throws Exception {
		System.out.println(successKilledDao.queryByIdWithSeckill(100000, "frece") );
	}

}
