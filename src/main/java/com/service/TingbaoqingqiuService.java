package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingbaoqingqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingbaoqingqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingbaoqingqiuView;


/**
 * 停保请求
 *
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface TingbaoqingqiuService extends IService<TingbaoqingqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingbaoqingqiuVO> selectListVO(Wrapper<TingbaoqingqiuEntity> wrapper);
   	
   	TingbaoqingqiuVO selectVO(@Param("ew") Wrapper<TingbaoqingqiuEntity> wrapper);
   	
   	List<TingbaoqingqiuView> selectListView(Wrapper<TingbaoqingqiuEntity> wrapper);
   	
   	TingbaoqingqiuView selectView(@Param("ew") Wrapper<TingbaoqingqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingbaoqingqiuEntity> wrapper);
   	

}

