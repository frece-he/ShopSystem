package web.frece.shop.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SuccessKilled {
	
	private long seckillId; 
	
	private String userId;
	
	private short statusFlg;
	
	private Date createTime;
	
	// many to one
	private Seckill seckill;

		
	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public short getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(short statusFlg) {
		this.statusFlg = statusFlg;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Seckill getSeckill() {
		return seckill;
	}

	public void setSeckill(Seckill seckill) {
		this.seckill = seckill;
	}


	@Override
	public String toString() {
		return "SuccessKilled{" + 
				" seckillId: " + seckillId +  
				",\n\t\t userId: " + userId + 
				",\n\t\t statusFlg: " + statusFlg + 
				",\n\t\t createTime: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createTime) + 
				"\n\t\t" + seckill + 
				"\n\t\t" + 
				"\n}";
	}
	
}
