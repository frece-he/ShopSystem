package test.web.frece.shop.dao;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import web.frece.shop.dao.SeckillDao;
import web.frece.shop.entity.Seckill;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml" })
public class SeckillDaoTest {
	
	@Resource
	private SeckillDao seckillDao;
	
	@Test
	public void testQueryById() {
		long id = 100000;
		Seckill seckill;
		try {
			seckill = seckillDao.queryById(id);
			System.out.println(seckill);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void testQueryAll() {
		try {
			List<Seckill> skList = seckillDao.queryAll(0, 100);
			for (Seckill seckill : skList) {
				
				System.out.println(seckill);
				System.out.println("========================");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testReduceNumber() {
		try {
			Date killTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-09-16 23:00:00");
			int res = seckillDao.reduceNumber(100000, killTime);
			System.out.println(res);
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

	

}
