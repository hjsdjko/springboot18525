package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiaodaozhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiaodaozhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiaodaozhangView;


/**
 * 报销到账
 *
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface BaoxiaodaozhangService extends IService<BaoxiaodaozhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiaodaozhangVO> selectListVO(Wrapper<BaoxiaodaozhangEntity> wrapper);
   	
   	BaoxiaodaozhangVO selectVO(@Param("ew") Wrapper<BaoxiaodaozhangEntity> wrapper);
   	
   	List<BaoxiaodaozhangView> selectListView(Wrapper<BaoxiaodaozhangEntity> wrapper);
   	
   	BaoxiaodaozhangView selectView(@Param("ew") Wrapper<BaoxiaodaozhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiaodaozhangEntity> wrapper);
   	

}

