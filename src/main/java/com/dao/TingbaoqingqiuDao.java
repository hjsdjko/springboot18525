package com.dao;

import com.entity.TingbaoqingqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingbaoqingqiuVO;
import com.entity.view.TingbaoqingqiuView;


/**
 * 停保请求
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface TingbaoqingqiuDao extends BaseMapper<TingbaoqingqiuEntity> {
	
	List<TingbaoqingqiuVO> selectListVO(@Param("ew") Wrapper<TingbaoqingqiuEntity> wrapper);
	
	TingbaoqingqiuVO selectVO(@Param("ew") Wrapper<TingbaoqingqiuEntity> wrapper);
	
	List<TingbaoqingqiuView> selectListView(@Param("ew") Wrapper<TingbaoqingqiuEntity> wrapper);

	List<TingbaoqingqiuView> selectListView(Pagination page,@Param("ew") Wrapper<TingbaoqingqiuEntity> wrapper);
	
	TingbaoqingqiuView selectView(@Param("ew") Wrapper<TingbaoqingqiuEntity> wrapper);
	

}
