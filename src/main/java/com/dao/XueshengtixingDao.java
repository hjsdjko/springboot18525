package com.dao;

import com.entity.XueshengtixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengtixingVO;
import com.entity.view.XueshengtixingView;


/**
 * 学生提醒
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface XueshengtixingDao extends BaseMapper<XueshengtixingEntity> {
	
	List<XueshengtixingVO> selectListVO(@Param("ew") Wrapper<XueshengtixingEntity> wrapper);
	
	XueshengtixingVO selectVO(@Param("ew") Wrapper<XueshengtixingEntity> wrapper);
	
	List<XueshengtixingView> selectListView(@Param("ew") Wrapper<XueshengtixingEntity> wrapper);

	List<XueshengtixingView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengtixingEntity> wrapper);
	
	XueshengtixingView selectView(@Param("ew") Wrapper<XueshengtixingEntity> wrapper);
	

}
