package com.flymegoc.service.impl;

import com.flymegoc.mapper.SprPictureMapper;
import com.flymegoc.model.SprPicture;
import com.flymegoc.model.SprPictureExample;
import com.flymegoc.service.PictureService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by flymegoc on 2017/4/12.
 */
@Service
public class PictureServiceImpl implements PictureService{

    @Autowired
    private SprPictureMapper pictureMapper;

    @Override
    public long countByExample(SprPictureExample example) {
        return pictureMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SprPictureExample example) {
        return pictureMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Float sprPictureId) {
        return pictureMapper.deleteByPrimaryKey(sprPictureId);
    }

    @Override
    public int insert(SprPicture record) {
        return pictureMapper.insert(record);
    }

    @Override
    public int insertSelective(SprPicture record) {
        return pictureMapper.insertSelective(record);
    }

    @Override
    public List<SprPicture> selectByExample(SprPictureExample example) {
        return pictureMapper.selectByExample(example);
    }

    @Override
    public SprPicture selectByPrimaryKey(Float sprPictureId) {
        return pictureMapper.selectByPrimaryKey(sprPictureId);
    }

    @Override
    public int updateByExampleSelective(@Param("record") SprPicture record, @Param("example") SprPictureExample example) {
        return pictureMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(@Param("record") SprPicture record, @Param("example") SprPictureExample example) {
        return pictureMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SprPicture record) {
        return pictureMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SprPicture record) {
        return pictureMapper.updateByPrimaryKey(record);
    }
}
