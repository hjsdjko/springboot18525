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
 * 保险信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
@TableName("baoxianxinxi")
public class BaoxianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaoxianxinxiEntity() {
		
	}
	
	public BaoxianxinxiEntity(T t) {
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
	 * 保险名称
	 */
					
	private String baoxianmingcheng;
	
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
	 * 设置：保险名称
	 */
	public void setBaoxianmingcheng(String baoxianmingcheng) {
		this.baoxianmingcheng = baoxianmingcheng;
	}
	/**
	 * 获取：保险名称
	 */
	public String getBaoxianmingcheng() {
		return baoxianmingcheng;
	}
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
