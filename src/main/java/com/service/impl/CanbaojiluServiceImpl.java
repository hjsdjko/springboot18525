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


import com.dao.CanbaojiluDao;
import com.entity.CanbaojiluEntity;
import com.service.CanbaojiluService;
import com.entity.vo.CanbaojiluVO;
import com.entity.view.CanbaojiluView;

@Service("canbaojiluService")
public class CanbaojiluServiceImpl extends ServiceImpl<CanbaojiluDao, CanbaojiluEntity> implements CanbaojiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanbaojiluEntity> page = this.selectPage(
                new Query<CanbaojiluEntity>(params).getPage(),
                new EntityWrapper<CanbaojiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanbaojiluEntity> wrapper) {
		  Page<CanbaojiluView> page =new Query<CanbaojiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanbaojiluVO> selectListVO(Wrapper<CanbaojiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanbaojiluVO selectVO(Wrapper<CanbaojiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanbaojiluView> selectListView(Wrapper<CanbaojiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanbaojiluView selectView(Wrapper<CanbaojiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
