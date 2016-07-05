package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.seckill.entity.Seckill;

/**
 * 秒杀商品 Dao
 * @author panchao
 */
public interface SeckillDao {

	/**
	 * 秒杀商品
	 * @param seckillId 秒杀商品id
	 * @param killTime 秒杀时间
	 * @return id
	 */
	int reduceNumber(long seckillId, Date killTime);
	
	/**
	 * 根据id 来获取秒杀商品信息
	 * @param seckillId 商品id
	 * @return 秒杀商品对象
	 */
	Seckill queryById(long seckillId);
	
	/**
	 * 获取商品
	 * @param offset 开始位置
	 * @param limit 偏移量
	 * @return 商品
	 */
	List<Seckill> queryAll(int offset, int limit);
}
