package web.frece.shop.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Seckill {
	
	private long  seckillId;
	
	private String proName;
	
	private int stockNum;
	
	private Date startTime;
	
	private Date endTime;
	
	private Date createTime;
	
	public long getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getStockNum() {
		return stockNum;
	}
	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return "Seckill{" + 
						" seckillId: " + seckillId +  
						",\n\t\t proName: " + proName + 
						",\n\t\t stockNum: " + stockNum + 
						",\n\t\t startTime: " + sdf.format(startTime)  +
						",\n\t\t endTime: " + sdf.format(endTime) + 
						",\n\t\t createTime: " + sdf.format(createTime) + 
						"\n\t\t}";
	}
	
}
