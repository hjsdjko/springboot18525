package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxianxinxiView;


/**
 * 保险信息
 *
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface BaoxianxinxiService extends IService<BaoxianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxianxinxiVO> selectListVO(Wrapper<BaoxianxinxiEntity> wrapper);
   	
   	BaoxianxinxiVO selectVO(@Param("ew") Wrapper<BaoxianxinxiEntity> wrapper);
   	
   	List<BaoxianxinxiView> selectListView(Wrapper<BaoxianxinxiEntity> wrapper);
   	
   	BaoxianxinxiView selectView(@Param("ew") Wrapper<BaoxianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxianxinxiEntity> wrapper);
   	

}

