package cn.eakay.test.repository.mybatis.dao;

import cn.eakay.test.client.dataobject.TestEakayDO;

/**
 * Created by Administrator on 2016/5/6.
 */
public interface TestEakayDAO
{

    void insertOne(TestEakayDO testEakayDO);

    TestEakayDO selectOne(TestEakayDO testEakayDO);

    void deleteOne(TestEakayDO testEakayDO);

}
