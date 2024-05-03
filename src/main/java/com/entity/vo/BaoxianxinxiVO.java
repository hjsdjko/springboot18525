package com.entity.vo;

import com.entity.BaoxianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 保险信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public class BaoxianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 保险分类
	 */
	
	private String baoxianfenlei;
		
	/**
	 * 保险图片
	 */
	
	private String baoxiantupian;
		
	/**
	 * 保险内容
	 */
	
	private String baoxianneirong;
		
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
	 * 险种介绍
	 */
	
	private String xianzhongjieshao;
				
	
	/**
	 * 设置：保险分类
	 */
	 
	public void setBaoxianfenlei(String baoxianfenlei) {
		this.baoxianfenlei = baoxianfenlei;
	}
	
	/**
	 * 获取：保险分类
	 */
	public String getBaoxianfenlei() {
		return baoxianfenlei;
	}
				
	
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
	 * 设置：保险内容
	 */
	 
	public void setBaoxianneirong(String baoxianneirong) {
		this.baoxianneirong = baoxianneirong;
	}
	
	/**
	 * 获取：保险内容
	 */
	public String getBaoxianneirong() {
		return baoxianneirong;
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
	 * 设置：险种介绍
	 */
	 
	public void setXianzhongjieshao(String xianzhongjieshao) {
		this.xianzhongjieshao = xianzhongjieshao;
	}
	
	/**
	 * 获取：险种介绍
	 */
	public String getXianzhongjieshao() {
		return xianzhongjieshao;
	}
			
}
