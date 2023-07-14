package com.wms.service.impl;

import com.wms.entity.Patient;
import com.wms.mapper.PatientMapper;
import com.wms.service.IPatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zrh
 * @since 2023-07-10
 */
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements IPatientService {

}
