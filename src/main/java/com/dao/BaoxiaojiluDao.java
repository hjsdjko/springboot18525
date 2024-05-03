package com.dao;

import com.entity.BaoxiaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiaojiluVO;
import com.entity.view.BaoxiaojiluView;


/**
 * 报销记录
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface BaoxiaojiluDao extends BaseMapper<BaoxiaojiluEntity> {
	
	List<BaoxiaojiluVO> selectListVO(@Param("ew") Wrapper<BaoxiaojiluEntity> wrapper);
	
	BaoxiaojiluVO selectVO(@Param("ew") Wrapper<BaoxiaojiluEntity> wrapper);
	
	List<BaoxiaojiluView> selectListView(@Param("ew") Wrapper<BaoxiaojiluEntity> wrapper);

	List<BaoxiaojiluView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiaojiluEntity> wrapper);
	
	BaoxiaojiluView selectView(@Param("ew") Wrapper<BaoxiaojiluEntity> wrapper);
	

}
