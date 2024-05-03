package com.entity.view;

import com.entity.BaoxiaodaozhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报销到账
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
@TableName("baoxiaodaozhang")
public class BaoxiaodaozhangView  extends BaoxiaodaozhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoxiaodaozhangView(){
	}
 
 	public BaoxiaodaozhangView(BaoxiaodaozhangEntity baoxiaodaozhangEntity){
 	try {
			BeanUtils.copyProperties(this, baoxiaodaozhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
