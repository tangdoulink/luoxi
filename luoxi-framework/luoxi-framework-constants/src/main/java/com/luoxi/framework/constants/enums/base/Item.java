package com.luoxi.framework.constants.enums.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/14 17:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item implements ItemAble {

    private Object key;

    private Object value;

}
