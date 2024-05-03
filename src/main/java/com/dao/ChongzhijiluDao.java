package com.dao;

import com.entity.ChongzhijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongzhijiluVO;
import com.entity.view.ChongzhijiluView;


/**
 * 充值记录
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface ChongzhijiluDao extends BaseMapper<ChongzhijiluEntity> {
	
	List<ChongzhijiluVO> selectListVO(@Param("ew") Wrapper<ChongzhijiluEntity> wrapper);
	
	ChongzhijiluVO selectVO(@Param("ew") Wrapper<ChongzhijiluEntity> wrapper);
	
	List<ChongzhijiluView> selectListView(@Param("ew") Wrapper<ChongzhijiluEntity> wrapper);

	List<ChongzhijiluView> selectListView(Pagination page,@Param("ew") Wrapper<ChongzhijiluEntity> wrapper);
	
	ChongzhijiluView selectView(@Param("ew") Wrapper<ChongzhijiluEntity> wrapper);
	

}
