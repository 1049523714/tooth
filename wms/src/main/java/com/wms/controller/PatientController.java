package com.wms.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.common.QueryPageParam;
import com.wms.entity.Patient;
import com.wms.entity.User;
import com.wms.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.LambdaMetafactory;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zrh
 * @since 2023-07-10
 */
@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private IPatientService iPatientService;
    @GetMapping("/list")
    public List<Patient> list(){
        return iPatientService.list();
    }
    //新增
    @PostMapping("/save")
    public boolean save(@RequestBody Patient patient){
        //return userService.list();
        return iPatientService.save(patient);
    }
    //修改
    @PostMapping("/mod")
    public boolean mod(@RequestBody Patient patient){
        //return userService.list();
        return iPatientService.updateById(patient);
    }
    //新增或修改
    @PostMapping("/saveOrMod")
    public boolean saveOrMod(@RequestBody Patient patient){
        //return userService.list();
        return iPatientService.saveOrUpdate(patient);
    }
    //删除
    @GetMapping("/delete")
    public boolean delete(int id){
        //return userService.list();
        return iPatientService.removeById(id);
    }
    //查询（模糊、匹配）
    @PostMapping("/listP")
    public List<Patient> listP(@RequestBody Patient patient){
        //return userService.list();
        LambdaQueryWrapper<Patient> lambdaQueryWrapper=new LambdaQueryWrapper();
        lambdaQueryWrapper.like(Patient::getName,patient.getName());
        return iPatientService.list(lambdaQueryWrapper);
    }
    //分页
    @PostMapping("/listPage")
    public List<Patient> listPage(@RequestBody QueryPageParam param){
        //return userService.list();
        /*
        LambdaQueryWrapper<Patient> lambdaQueryWrapper=new LambdaQueryWrapper();
        lambdaQueryWrapper.like(Patient::getName,patient.getName());
        return iPatientService.list(lambdaQueryWrapper);
        */
        Page<Patient> page=new Page();
        page.setPages(param.getPageNum());
        page.setSize(param.getPageSize());
        System.out.println(param.getPageNum());
        System.out.println(param.getPageSize());

        LambdaQueryWrapper<Patient> lambdaQueryWrapper=new LambdaQueryWrapper();
        lambdaQueryWrapper.like(Patient::getName,param.getParam().get("name"));
        IPage<Patient> res=iPatientService.page(page,lambdaQueryWrapper);
        System.out.println(res.getTotal());
        return res.getRecords();
    }

}
