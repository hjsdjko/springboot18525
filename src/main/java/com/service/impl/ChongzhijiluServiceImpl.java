package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChongzhijiluDao;
import com.entity.ChongzhijiluEntity;
import com.service.ChongzhijiluService;
import com.entity.vo.ChongzhijiluVO;
import com.entity.view.ChongzhijiluView;

@Service("chongzhijiluService")
public class ChongzhijiluServiceImpl extends ServiceImpl<ChongzhijiluDao, ChongzhijiluEntity> implements ChongzhijiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongzhijiluEntity> page = this.selectPage(
                new Query<ChongzhijiluEntity>(params).getPage(),
                new EntityWrapper<ChongzhijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongzhijiluEntity> wrapper) {
		  Page<ChongzhijiluView> page =new Query<ChongzhijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongzhijiluVO> selectListVO(Wrapper<ChongzhijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongzhijiluVO selectVO(Wrapper<ChongzhijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongzhijiluView> selectListView(Wrapper<ChongzhijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongzhijiluView selectView(Wrapper<ChongzhijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
