package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * 秒杀商品明细Dao
 * @author panchao
 */
public interface SuccessKilledDao {
	
	/**
	 * 插入购买明细，根据用户手机和seckillId
	 * @param seckillId
	 * @param userPhone
	 * @return 插入的结果集数量
	 */
	int insertSuccessKilled(long seckillId, long userPhone);
	
	/**
	 * 根据id查询购买明细并携带秒杀对象实体
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId);
}
