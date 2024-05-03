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


import com.dao.XueshengtixingDao;
import com.entity.XueshengtixingEntity;
import com.service.XueshengtixingService;
import com.entity.vo.XueshengtixingVO;
import com.entity.view.XueshengtixingView;

@Service("xueshengtixingService")
public class XueshengtixingServiceImpl extends ServiceImpl<XueshengtixingDao, XueshengtixingEntity> implements XueshengtixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengtixingEntity> page = this.selectPage(
                new Query<XueshengtixingEntity>(params).getPage(),
                new EntityWrapper<XueshengtixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengtixingEntity> wrapper) {
		  Page<XueshengtixingView> page =new Query<XueshengtixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengtixingVO> selectListVO(Wrapper<XueshengtixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengtixingVO selectVO(Wrapper<XueshengtixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengtixingView> selectListView(Wrapper<XueshengtixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengtixingView selectView(Wrapper<XueshengtixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
