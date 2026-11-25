package com.zsy.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult {
    private Integer code;//2000
    private String msg;//成功
    private Object data;
}
