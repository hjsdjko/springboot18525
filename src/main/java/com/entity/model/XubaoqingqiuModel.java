package com.entity.model;

import com.entity.XubaoqingqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 续保请求
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public class XubaoqingqiuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 保险图片
	 */
	
	private String baoxiantupian;
		
	/**
	 * 保单总额
	 */
	
	private Integer baodanzonge;
		
	/**
	 * 保单方式
	 */
	
	private String baodanfangshi;
		
	/**
	 * 缴费类型
	 */
	
	private String jiaofeileixing;
		
	/**
	 * 参保日期
	 */
	
	private String canbaoriqi;
		
	/**
	 * 续保日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xubaoriqi;
		
	/**
	 * 申请内容
	 */
	
	private String shenqingneirong;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 余额
	 */
	
	private Integer yue;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：保险图片
	 */
	 
	public void setBaoxiantupian(String baoxiantupian) {
		this.baoxiantupian = baoxiantupian;
	}
	
	/**
	 * 获取：保险图片
	 */
	public String getBaoxiantupian() {
		return baoxiantupian;
	}
				
	
	/**
	 * 设置：保单总额
	 */
	 
	public void setBaodanzonge(Integer baodanzonge) {
		this.baodanzonge = baodanzonge;
	}
	
	/**
	 * 获取：保单总额
	 */
	public Integer getBaodanzonge() {
		return baodanzonge;
	}
				
	
	/**
	 * 设置：保单方式
	 */
	 
	public void setBaodanfangshi(String baodanfangshi) {
		this.baodanfangshi = baodanfangshi;
	}
	
	/**
	 * 获取：保单方式
	 */
	public String getBaodanfangshi() {
		return baodanfangshi;
	}
				
	
	/**
	 * 设置：缴费类型
	 */
	 
	public void setJiaofeileixing(String jiaofeileixing) {
		this.jiaofeileixing = jiaofeileixing;
	}
	
	/**
	 * 获取：缴费类型
	 */
	public String getJiaofeileixing() {
		return jiaofeileixing;
	}
				
	
	/**
	 * 设置：参保日期
	 */
	 
	public void setCanbaoriqi(String canbaoriqi) {
		this.canbaoriqi = canbaoriqi;
	}
	
	/**
	 * 获取：参保日期
	 */
	public String getCanbaoriqi() {
		return canbaoriqi;
	}
				
	
	/**
	 * 设置：续保日期
	 */
	 
	public void setXubaoriqi(Date xubaoriqi) {
		this.xubaoriqi = xubaoriqi;
	}
	
	/**
	 * 获取：续保日期
	 */
	public Date getXubaoriqi() {
		return xubaoriqi;
	}
				
	
	/**
	 * 设置：申请内容
	 */
	 
	public void setShenqingneirong(String shenqingneirong) {
		this.shenqingneirong = shenqingneirong;
	}
	
	/**
	 * 获取：申请内容
	 */
	public String getShenqingneirong() {
		return shenqingneirong;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：余额
	 */
	 
	public void setYue(Integer yue) {
		this.yue = yue;
	}
	
	/**
	 * 获取：余额
	 */
	public Integer getYue() {
		return yue;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
