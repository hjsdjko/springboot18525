package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinxidanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinxidanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinxidanganView;


/**
 * 信息档案
 *
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface XinxidanganService extends IService<XinxidanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinxidanganVO> selectListVO(Wrapper<XinxidanganEntity> wrapper);
   	
   	XinxidanganVO selectVO(@Param("ew") Wrapper<XinxidanganEntity> wrapper);
   	
   	List<XinxidanganView> selectListView(Wrapper<XinxidanganEntity> wrapper);
   	
   	XinxidanganView selectView(@Param("ew") Wrapper<XinxidanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinxidanganEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XinxidanganEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XinxidanganEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XinxidanganEntity> wrapper);
}

