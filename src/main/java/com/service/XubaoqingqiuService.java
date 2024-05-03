package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XubaoqingqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XubaoqingqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XubaoqingqiuView;


/**
 * 续保请求
 *
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface XubaoqingqiuService extends IService<XubaoqingqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XubaoqingqiuVO> selectListVO(Wrapper<XubaoqingqiuEntity> wrapper);
   	
   	XubaoqingqiuVO selectVO(@Param("ew") Wrapper<XubaoqingqiuEntity> wrapper);
   	
   	List<XubaoqingqiuView> selectListView(Wrapper<XubaoqingqiuEntity> wrapper);
   	
   	XubaoqingqiuView selectView(@Param("ew") Wrapper<XubaoqingqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XubaoqingqiuEntity> wrapper);
   	

}

