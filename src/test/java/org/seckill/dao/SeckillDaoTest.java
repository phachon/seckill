package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.plugin2.main.server.ServerPrintHelper;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * SeckillDao Test
 * Created by panchao on 2016/6/24.
 * 配置Spring 和 junit 的整合，Junit 在启动时加载Spring容器
 * Spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit Spring 的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

	//注入dao实现类
	@Resource
	private SeckillDao seckillDao;

	@Test
	public void testQueryById() throws Exception {
		long id = 1000;
		Seckill seckill = this.seckillDao.queryById(id);
		System.out.print(seckill.getName());
		System.out.print(seckill);
	}

	@Test
	public void testQueryAll() throws Exception {

	}

	@Test
	public void testReduceNumber() throws Exception {

	}

}