package com.dao;

import com.entity.XubaoqingqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XubaoqingqiuVO;
import com.entity.view.XubaoqingqiuView;


/**
 * 续保请求
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface XubaoqingqiuDao extends BaseMapper<XubaoqingqiuEntity> {
	
	List<XubaoqingqiuVO> selectListVO(@Param("ew") Wrapper<XubaoqingqiuEntity> wrapper);
	
	XubaoqingqiuVO selectVO(@Param("ew") Wrapper<XubaoqingqiuEntity> wrapper);
	
	List<XubaoqingqiuView> selectListView(@Param("ew") Wrapper<XubaoqingqiuEntity> wrapper);

	List<XubaoqingqiuView> selectListView(Pagination page,@Param("ew") Wrapper<XubaoqingqiuEntity> wrapper);
	
	XubaoqingqiuView selectView(@Param("ew") Wrapper<XubaoqingqiuEntity> wrapper);
	

}
