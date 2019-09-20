package cn.yunlingfly.springbootpostgresql.api.controller;

import cn.yunlingfly.springbootpostgresql.api.dto.ResultDTO;
import cn.yunlingfly.springbootpostgresql.api.service.ITestService;
import cn.yunlingfly.springbootpostgresql.domain.entity.TestEntity;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    ITestService testService;

    @RequestMapping(value = "/list/{pageNum}", method = RequestMethod.GET)
    public ResultDTO<IPage<TestEntity>> list(@PathVariable Integer pageNum) {
        ResultDTO<IPage<TestEntity>> result = new ResultDTO<>();

        IPage<TestEntity> pageList = testService.list(new Page(pageNum, 5));

        result.setSuccess(true);
        result.setResult(pageList);
        return result;
    }
}
