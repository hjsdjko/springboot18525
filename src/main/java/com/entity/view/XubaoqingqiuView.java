package com.entity.view;

import com.entity.XubaoqingqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 续保请求
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
@TableName("xubaoqingqiu")
public class XubaoqingqiuView  extends XubaoqingqiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XubaoqingqiuView(){
	}
 
 	public XubaoqingqiuView(XubaoqingqiuEntity xubaoqingqiuEntity){
 	try {
			BeanUtils.copyProperties(this, xubaoqingqiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
