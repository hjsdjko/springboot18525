package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengtixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengtixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengtixingView;


/**
 * 学生提醒
 *
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface XueshengtixingService extends IService<XueshengtixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengtixingVO> selectListVO(Wrapper<XueshengtixingEntity> wrapper);
   	
   	XueshengtixingVO selectVO(@Param("ew") Wrapper<XueshengtixingEntity> wrapper);
   	
   	List<XueshengtixingView> selectListView(Wrapper<XueshengtixingEntity> wrapper);
   	
   	XueshengtixingView selectView(@Param("ew") Wrapper<XueshengtixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengtixingEntity> wrapper);
   	

}

