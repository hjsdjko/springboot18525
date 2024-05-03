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


import com.dao.BaoxiaodaozhangDao;
import com.entity.BaoxiaodaozhangEntity;
import com.service.BaoxiaodaozhangService;
import com.entity.vo.BaoxiaodaozhangVO;
import com.entity.view.BaoxiaodaozhangView;

@Service("baoxiaodaozhangService")
public class BaoxiaodaozhangServiceImpl extends ServiceImpl<BaoxiaodaozhangDao, BaoxiaodaozhangEntity> implements BaoxiaodaozhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiaodaozhangEntity> page = this.selectPage(
                new Query<BaoxiaodaozhangEntity>(params).getPage(),
                new EntityWrapper<BaoxiaodaozhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiaodaozhangEntity> wrapper) {
		  Page<BaoxiaodaozhangView> page =new Query<BaoxiaodaozhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiaodaozhangVO> selectListVO(Wrapper<BaoxiaodaozhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiaodaozhangVO selectVO(Wrapper<BaoxiaodaozhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiaodaozhangView> selectListView(Wrapper<BaoxiaodaozhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiaodaozhangView selectView(Wrapper<BaoxiaodaozhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
