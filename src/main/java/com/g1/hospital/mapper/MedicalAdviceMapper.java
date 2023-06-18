package com.g1.hospital.mapper;

import com.g1.hospital.pojo.MedicalAdvice;
import com.g1.hospital.pojo.MedicalAdviceExample;
import java.util.List;

public interface MedicalAdviceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MedicalAdvice record);

    int insertSelective(MedicalAdvice record);

    List<MedicalAdvice> selectByExample(MedicalAdviceExample example);

    MedicalAdvice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MedicalAdvice record);

    int updateByPrimaryKey(MedicalAdvice record);
}