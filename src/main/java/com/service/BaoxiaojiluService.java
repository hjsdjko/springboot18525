package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiaojiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiaojiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiaojiluView;


/**
 * 报销记录
 *
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface BaoxiaojiluService extends IService<BaoxiaojiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiaojiluVO> selectListVO(Wrapper<BaoxiaojiluEntity> wrapper);
   	
   	BaoxiaojiluVO selectVO(@Param("ew") Wrapper<BaoxiaojiluEntity> wrapper);
   	
   	List<BaoxiaojiluView> selectListView(Wrapper<BaoxiaojiluEntity> wrapper);
   	
   	BaoxiaojiluView selectView(@Param("ew") Wrapper<BaoxiaojiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiaojiluEntity> wrapper);
   	

}

