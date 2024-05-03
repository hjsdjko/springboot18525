package com.dao;

import com.entity.CanbaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanbaojiluVO;
import com.entity.view.CanbaojiluView;


/**
 * 参保记录
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface CanbaojiluDao extends BaseMapper<CanbaojiluEntity> {
	
	List<CanbaojiluVO> selectListVO(@Param("ew") Wrapper<CanbaojiluEntity> wrapper);
	
	CanbaojiluVO selectVO(@Param("ew") Wrapper<CanbaojiluEntity> wrapper);
	
	List<CanbaojiluView> selectListView(@Param("ew") Wrapper<CanbaojiluEntity> wrapper);

	List<CanbaojiluView> selectListView(Pagination page,@Param("ew") Wrapper<CanbaojiluEntity> wrapper);
	
	CanbaojiluView selectView(@Param("ew") Wrapper<CanbaojiluEntity> wrapper);
	

}
