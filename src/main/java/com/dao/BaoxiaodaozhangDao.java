package com.dao;

import com.entity.BaoxiaodaozhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiaodaozhangVO;
import com.entity.view.BaoxiaodaozhangView;


/**
 * 报销到账
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:57:03
 */
public interface BaoxiaodaozhangDao extends BaseMapper<BaoxiaodaozhangEntity> {
	
	List<BaoxiaodaozhangVO> selectListVO(@Param("ew") Wrapper<BaoxiaodaozhangEntity> wrapper);
	
	BaoxiaodaozhangVO selectVO(@Param("ew") Wrapper<BaoxiaodaozhangEntity> wrapper);
	
	List<BaoxiaodaozhangView> selectListView(@Param("ew") Wrapper<BaoxiaodaozhangEntity> wrapper);

	List<BaoxiaodaozhangView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiaodaozhangEntity> wrapper);
	
	BaoxiaodaozhangView selectView(@Param("ew") Wrapper<BaoxiaodaozhangEntity> wrapper);
	

}
