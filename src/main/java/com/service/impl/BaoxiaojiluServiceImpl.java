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


import com.dao.BaoxiaojiluDao;
import com.entity.BaoxiaojiluEntity;
import com.service.BaoxiaojiluService;
import com.entity.vo.BaoxiaojiluVO;
import com.entity.view.BaoxiaojiluView;

@Service("baoxiaojiluService")
public class BaoxiaojiluServiceImpl extends ServiceImpl<BaoxiaojiluDao, BaoxiaojiluEntity> implements BaoxiaojiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiaojiluEntity> page = this.selectPage(
                new Query<BaoxiaojiluEntity>(params).getPage(),
                new EntityWrapper<BaoxiaojiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiaojiluEntity> wrapper) {
		  Page<BaoxiaojiluView> page =new Query<BaoxiaojiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiaojiluVO> selectListVO(Wrapper<BaoxiaojiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiaojiluVO selectVO(Wrapper<BaoxiaojiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiaojiluView> selectListView(Wrapper<BaoxiaojiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiaojiluView selectView(Wrapper<BaoxiaojiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
