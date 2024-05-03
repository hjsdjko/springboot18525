package com.entity.view;

import com.entity.XinxidanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 信息档案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
@TableName("xinxidangan")
public class XinxidanganView  extends XinxidanganEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinxidanganView(){
	}
 
 	public XinxidanganView(XinxidanganEntity xinxidanganEntity){
 	try {
			BeanUtils.copyProperties(this, xinxidanganEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
