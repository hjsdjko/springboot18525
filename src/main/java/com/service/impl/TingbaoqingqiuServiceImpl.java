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


import com.dao.TingbaoqingqiuDao;
import com.entity.TingbaoqingqiuEntity;
import com.service.TingbaoqingqiuService;
import com.entity.vo.TingbaoqingqiuVO;
import com.entity.view.TingbaoqingqiuView;

@Service("tingbaoqingqiuService")
public class TingbaoqingqiuServiceImpl extends ServiceImpl<TingbaoqingqiuDao, TingbaoqingqiuEntity> implements TingbaoqingqiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingbaoqingqiuEntity> page = this.selectPage(
                new Query<TingbaoqingqiuEntity>(params).getPage(),
                new EntityWrapper<TingbaoqingqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingbaoqingqiuEntity> wrapper) {
		  Page<TingbaoqingqiuView> page =new Query<TingbaoqingqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingbaoqingqiuVO> selectListVO(Wrapper<TingbaoqingqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingbaoqingqiuVO selectVO(Wrapper<TingbaoqingqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingbaoqingqiuView> selectListView(Wrapper<TingbaoqingqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingbaoqingqiuView selectView(Wrapper<TingbaoqingqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
