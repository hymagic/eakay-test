package cn.eakay.test.client.result;

import cn.eakay.test.client.common.ResultDO;
import cn.eakay.test.client.dataobject.TestEakayDO;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2016/5/5.
 */

@Setter
@Getter
public class TestEakayResultDO extends ResultDO
{

    private static final long serialVersionUID = 3802544547108359048L;

    private TestEakayDO testEakayDO;


}
