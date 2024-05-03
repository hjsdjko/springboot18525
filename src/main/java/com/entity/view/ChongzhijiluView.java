package com.entity.view;

import com.entity.ChongzhijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 充值记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
@TableName("chongzhijilu")
public class ChongzhijiluView  extends ChongzhijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongzhijiluView(){
	}
 
 	public ChongzhijiluView(ChongzhijiluEntity chongzhijiluEntity){
 	try {
			BeanUtils.copyProperties(this, chongzhijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
