package cn.yunlingfly.springbootpostgresql.infra.mapper;

import cn.yunlingfly.springbootpostgresql.domain.entity.TestEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Component;

@Component
public interface ITestMapper extends BaseMapper<TestEntity> {
    IPage<TestEntity> list(IPage page);
}
