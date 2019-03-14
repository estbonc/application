package com.estbon.application.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Author: liushuaishuai
 * Email: liushuaishuai@91zdan.com
 * Date: 2017-10-28 14:50
 * Description:
 * History:
 */

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
