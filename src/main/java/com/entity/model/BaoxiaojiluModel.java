package com.entity.model;

import com.entity.BaoxiaojiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 报销记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public class BaoxiaojiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 保险分类
	 */
	
	private String baoxianfenlei;
		
	/**
	 * 保单总额
	 */
	
	private Integer baodanzonge;
		
	/**
	 * 诊断疾病
	 */
	
	private String zhenduanjibing;
		
	/**
	 * 诊断内容
	 */
	
	private String zhenduanneirong;
		
	/**
	 * 报销金额
	 */
	
	private Integer baoxiaojine;
		
	/**
	 * 报销类型
	 */
	
	private String baoxiaoleixing;
		
	/**
	 * 报销材料
	 */
	
	private String baoxiaocailiao;
		
	/**
	 * 申请内容
	 */
	
	private String shenqingneirong;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：诊断疾病
	 */
	 
	public void setZhenduanjibing(String zhenduanjibing) {
		this.zhenduanjibing = zhenduanjibing;
	}
	
	/**
	 * 获取：诊断疾病
	 */
	public String getZhenduanjibing() {
		return zhenduanjibing;
	}
				
	
	/**
	 * 设置：诊断内容
	 */
	 
	public void setZhenduanneirong(String zhenduanneirong) {
		this.zhenduanneirong = zhenduanneirong;
	}
	
	/**
	 * 获取：诊断内容
	 */
	public String getZhenduanneirong() {
		return zhenduanneirong;
	}
				
	
	/**
	 * 设置：报销金额
	 */
	 
	public void setBaoxiaojine(Integer baoxiaojine) {
		this.baoxiaojine = baoxiaojine;
	}
	
	/**
	 * 获取：报销金额
	 */
	public Integer getBaoxiaojine() {
		return baoxiaojine;
	}
				
	
	/**
	 * 设置：报销类型
	 */
	 
	public void setBaoxiaoleixing(String baoxiaoleixing) {
		this.baoxiaoleixing = baoxiaoleixing;
	}
	
	/**
	 * 获取：报销类型
	 */
	public String getBaoxiaoleixing() {
		return baoxiaoleixing;
	}
				
	
	/**
	 * 设置：报销材料
	 */
	 
	public void setBaoxiaocailiao(String baoxiaocailiao) {
		this.baoxiaocailiao = baoxiaocailiao;
	}
	
	/**
	 * 获取：报销材料
	 */
	public String getBaoxiaocailiao() {
		return baoxiaocailiao;
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
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
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
