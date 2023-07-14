package com.wms.mapper;

import com.wms.entity.Patient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zrh
 * @since 2023-07-10
 */
@Mapper
public interface PatientMapper extends BaseMapper<Patient> {

}
