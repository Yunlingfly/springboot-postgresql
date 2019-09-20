package cn.yunlingfly.springbootpostgresql.api.service;

import cn.yunlingfly.springbootpostgresql.domain.entity.TestEntity;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface ITestService extends IService<TestEntity> {
    IPage<TestEntity> list(Page page);
}
