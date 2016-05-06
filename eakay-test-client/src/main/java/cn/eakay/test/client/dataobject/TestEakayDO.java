package cn.eakay.test.client.dataobject;

import cn.eakay.test.client.common.BaseDO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2016/5/5.
 */

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true, value = {"createTime", "updateTime"})
public class TestEakayDO extends BaseDO
{
    private static final long serialVersionUID = 1133104153176137008L;
    private Long tid;
    private String name;
    private String title;
}
