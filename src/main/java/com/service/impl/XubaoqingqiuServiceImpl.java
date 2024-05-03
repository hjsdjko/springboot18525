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


import com.dao.XubaoqingqiuDao;
import com.entity.XubaoqingqiuEntity;
import com.service.XubaoqingqiuService;
import com.entity.vo.XubaoqingqiuVO;
import com.entity.view.XubaoqingqiuView;

@Service("xubaoqingqiuService")
public class XubaoqingqiuServiceImpl extends ServiceImpl<XubaoqingqiuDao, XubaoqingqiuEntity> implements XubaoqingqiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XubaoqingqiuEntity> page = this.selectPage(
                new Query<XubaoqingqiuEntity>(params).getPage(),
                new EntityWrapper<XubaoqingqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XubaoqingqiuEntity> wrapper) {
		  Page<XubaoqingqiuView> page =new Query<XubaoqingqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XubaoqingqiuVO> selectListVO(Wrapper<XubaoqingqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XubaoqingqiuVO selectVO(Wrapper<XubaoqingqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XubaoqingqiuView> selectListView(Wrapper<XubaoqingqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XubaoqingqiuView selectView(Wrapper<XubaoqingqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
