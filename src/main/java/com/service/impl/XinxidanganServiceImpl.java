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


import com.dao.XinxidanganDao;
import com.entity.XinxidanganEntity;
import com.service.XinxidanganService;
import com.entity.vo.XinxidanganVO;
import com.entity.view.XinxidanganView;

@Service("xinxidanganService")
public class XinxidanganServiceImpl extends ServiceImpl<XinxidanganDao, XinxidanganEntity> implements XinxidanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinxidanganEntity> page = this.selectPage(
                new Query<XinxidanganEntity>(params).getPage(),
                new EntityWrapper<XinxidanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinxidanganEntity> wrapper) {
		  Page<XinxidanganView> page =new Query<XinxidanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinxidanganVO> selectListVO(Wrapper<XinxidanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinxidanganVO selectVO(Wrapper<XinxidanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinxidanganView> selectListView(Wrapper<XinxidanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinxidanganView selectView(Wrapper<XinxidanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XinxidanganEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XinxidanganEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XinxidanganEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
