package web.frece.shop.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import web.frece.shop.entity.Seckill;

public interface SeckillDao {
	
	/**
	 * 减库存 
	 * @param seckillId
	 * @param createTime
	 * @return
	 * @throws Exception
	 */
	int reduceNumber(@Param("seckillId") long seckillId, @Param("createTime") Date createTime) throws Exception;
	/**
	 * 根据 ID 查询
	 * @param seckillId
	 * @return
	 * @throws Exception
	 */
	Seckill queryById(long seckillId) throws Exception;
	
	/**
	 * 根据偏移量查询
	 * @param offset
	 * @param limit
	 * @return
	 * @throws Exception
	 */
	List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit) throws Exception;
	
}
