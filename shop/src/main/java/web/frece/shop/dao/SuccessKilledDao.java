package web.frece.shop.dao;

import org.apache.ibatis.annotations.Param;

import web.frece.shop.entity.SuccessKilled;

public interface SuccessKilledDao {
	
	int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userId")String userId) throws Exception;
	
	SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userId")String userId) throws Exception;
}
