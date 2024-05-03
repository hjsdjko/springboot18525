package com.dao;

import com.entity.XinxidanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinxidanganVO;
import com.entity.view.XinxidanganView;


/**
 * 信息档案
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface XinxidanganDao extends BaseMapper<XinxidanganEntity> {
	
	List<XinxidanganVO> selectListVO(@Param("ew") Wrapper<XinxidanganEntity> wrapper);
	
	XinxidanganVO selectVO(@Param("ew") Wrapper<XinxidanganEntity> wrapper);
	
	List<XinxidanganView> selectListView(@Param("ew") Wrapper<XinxidanganEntity> wrapper);

	List<XinxidanganView> selectListView(Pagination page,@Param("ew") Wrapper<XinxidanganEntity> wrapper);
	
	XinxidanganView selectView(@Param("ew") Wrapper<XinxidanganEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XinxidanganEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XinxidanganEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XinxidanganEntity> wrapper);
}
