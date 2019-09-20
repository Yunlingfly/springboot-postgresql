package cn.yunlingfly.springbootpostgresql.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("test")
public class TestEntity {
    @TableId(type = IdType.UUID)
    private String id;
    private String name;
    private Date date;
}
