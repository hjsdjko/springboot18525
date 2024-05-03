package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 信息档案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
@TableName("xinxidangan")
public class XinxidanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinxidanganEntity() {
		
	}
	
	public XinxidanganEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 金额
	 */
					
	private Integer jine;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否参保
	 */
					
	private String shifoucanbao;
	
	/**
	 * 参保时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date canbaoshijian;
	
	/**
	 * 保险种类
	 */
					
	private String baoxianzhonglei;
	
	/**
	 * 身份证号
	 */
					
	private String shenfenzhenghao;
	
	/**
	 * 社保卡号
	 */
					
	private String shebaokahao;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：金额
	 */
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：是否参保
	 */
	public void setShifoucanbao(String shifoucanbao) {
		this.shifoucanbao = shifoucanbao;
	}
	/**
	 * 获取：是否参保
	 */
	public String getShifoucanbao() {
		return shifoucanbao;
	}
	/**
	 * 设置：参保时间
	 */
	public void setCanbaoshijian(Date canbaoshijian) {
		this.canbaoshijian = canbaoshijian;
	}
	/**
	 * 获取：参保时间
	 */
	public Date getCanbaoshijian() {
		return canbaoshijian;
	}
	/**
	 * 设置：保险种类
	 */
	public void setBaoxianzhonglei(String baoxianzhonglei) {
		this.baoxianzhonglei = baoxianzhonglei;
	}
	/**
	 * 获取：保险种类
	 */
	public String getBaoxianzhonglei() {
		return baoxianzhonglei;
	}
	/**
	 * 设置：身份证号
	 */
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
	/**
	 * 设置：社保卡号
	 */
	public void setShebaokahao(String shebaokahao) {
		this.shebaokahao = shebaokahao;
	}
	/**
	 * 获取：社保卡号
	 */
	public String getShebaokahao() {
		return shebaokahao;
	}

}
