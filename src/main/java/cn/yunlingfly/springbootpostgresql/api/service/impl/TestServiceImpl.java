package cn.yunlingfly.springbootpostgresql.api.service.impl;

import cn.yunlingfly.springbootpostgresql.api.service.ITestService;
import cn.yunlingfly.springbootpostgresql.domain.entity.TestEntity;
import cn.yunlingfly.springbootpostgresql.infra.mapper.ITestMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<ITestMapper, TestEntity> implements ITestService {
    @Autowired
    ITestMapper testMapper;

    @Override
    public IPage<TestEntity> list(Page page) {
        return testMapper.list(page);
    }
}
