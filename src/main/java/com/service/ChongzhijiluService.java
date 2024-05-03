package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongzhijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongzhijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongzhijiluView;


/**
 * 充值记录
 *
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface ChongzhijiluService extends IService<ChongzhijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongzhijiluVO> selectListVO(Wrapper<ChongzhijiluEntity> wrapper);
   	
   	ChongzhijiluVO selectVO(@Param("ew") Wrapper<ChongzhijiluEntity> wrapper);
   	
   	List<ChongzhijiluView> selectListView(Wrapper<ChongzhijiluEntity> wrapper);
   	
   	ChongzhijiluView selectView(@Param("ew") Wrapper<ChongzhijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongzhijiluEntity> wrapper);
   	

}

