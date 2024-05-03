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
 * 参保记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
@TableName("canbaojilu")
public class CanbaojiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CanbaojiluEntity() {
		
	}
	
	public CanbaojiluEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date canbaoriqi;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 金额
	 */
					
	private Integer jine;
	
	/**
	 * 身份证号
	 */
					
	private String shenfenzhenghao;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	public void setCanbaoriqi(Date canbaoriqi) {
		this.canbaoriqi = canbaoriqi;
	}
	/**
	 * 获取：参保日期
	 */
	public Date getCanbaoriqi() {
		return canbaoriqi;
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
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
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
