package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanbaojiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanbaojiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanbaojiluView;


/**
 * 参保记录
 *
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface CanbaojiluService extends IService<CanbaojiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanbaojiluVO> selectListVO(Wrapper<CanbaojiluEntity> wrapper);
   	
   	CanbaojiluVO selectVO(@Param("ew") Wrapper<CanbaojiluEntity> wrapper);
   	
   	List<CanbaojiluView> selectListView(Wrapper<CanbaojiluEntity> wrapper);
   	
   	CanbaojiluView selectView(@Param("ew") Wrapper<CanbaojiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanbaojiluEntity> wrapper);
   	

}

