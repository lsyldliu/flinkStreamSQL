/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 

package com.dtstack.flink.sql.side.hbase;

import com.dtstack.flink.sql.side.hbase.enums.EReplaceOpType;

import java.util.Map;

/**
 * Reason:
 * Date: 2018/8/23
 * Company: www.dtstack.com
 * @author xuchao
 */

public abstract class ReplaceOperator {

    private EReplaceOpType opType;

    public ReplaceOperator(EReplaceOpType opType){
        this.opType = opType;
    }

    public String doOperator(Map<String, Object> refData){
        String replaceStr = replaceStr(refData);
        return doFunc(replaceStr);
    }

    public String replaceStr(Map<String, Object> refData){
        return "";
    }

    /**
     * 根据函数提供自定义的处理
     * @param replaceStr
     * @return
     */
    abstract String doFunc(String replaceStr);
}
