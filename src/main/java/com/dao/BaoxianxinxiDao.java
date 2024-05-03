package com.dao;

import com.entity.BaoxianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxianxinxiVO;
import com.entity.view.BaoxianxinxiView;


/**
 * 保险信息
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface BaoxianxinxiDao extends BaseMapper<BaoxianxinxiEntity> {
	
	List<BaoxianxinxiVO> selectListVO(@Param("ew") Wrapper<BaoxianxinxiEntity> wrapper);
	
	BaoxianxinxiVO selectVO(@Param("ew") Wrapper<BaoxianxinxiEntity> wrapper);
	
	List<BaoxianxinxiView> selectListView(@Param("ew") Wrapper<BaoxianxinxiEntity> wrapper);

	List<BaoxianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxianxinxiEntity> wrapper);
	
	BaoxianxinxiView selectView(@Param("ew") Wrapper<BaoxianxinxiEntity> wrapper);
	

}
