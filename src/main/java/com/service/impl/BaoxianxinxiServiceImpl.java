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


import com.dao.BaoxianxinxiDao;
import com.entity.BaoxianxinxiEntity;
import com.service.BaoxianxinxiService;
import com.entity.vo.BaoxianxinxiVO;
import com.entity.view.BaoxianxinxiView;

@Service("baoxianxinxiService")
public class BaoxianxinxiServiceImpl extends ServiceImpl<BaoxianxinxiDao, BaoxianxinxiEntity> implements BaoxianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxianxinxiEntity> page = this.selectPage(
                new Query<BaoxianxinxiEntity>(params).getPage(),
                new EntityWrapper<BaoxianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxianxinxiEntity> wrapper) {
		  Page<BaoxianxinxiView> page =new Query<BaoxianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxianxinxiVO> selectListVO(Wrapper<BaoxianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxianxinxiVO selectVO(Wrapper<BaoxianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxianxinxiView> selectListView(Wrapper<BaoxianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxianxinxiView selectView(Wrapper<BaoxianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
