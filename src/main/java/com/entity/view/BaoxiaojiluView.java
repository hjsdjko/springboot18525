package com.entity.view;

import com.entity.BaoxiaojiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报销记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
@TableName("baoxiaojilu")
public class BaoxiaojiluView  extends BaoxiaojiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoxiaojiluView(){
	}
 
 	public BaoxiaojiluView(BaoxiaojiluEntity baoxiaojiluEntity){
 	try {
			BeanUtils.copyProperties(this, baoxiaojiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
