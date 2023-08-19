package com.luoxi.framework.constants.enums.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/14 17:48
 */

public class EnumHelper {

    /**
     * 根据键获取枚举类型
     * @param enumType 类的对象
     * @param key 键
     * @param <E> 枚举
     * @return 枚举
     */
    public static <E extends EnumItemAble> E getEnum(Class<E> enumType, Object key) {
        for (E e : enumType.getEnumConstants()) {
            if (e.getKey().equals(key)) {
                return e;
            }
        }
        return null;
    }

    /**
     * 根据 key 获取 value
     * @param enumType 类的对象
     * @param key 键
     * @param <E> 枚举
     * @return 值
     */
    public static <E extends EnumItemAble> String getValue(Class<E> enumType, Object key) {
        for (E e : enumType.getEnumConstants()) {
            if (e.getKey().equals(key)) {
                return e.getValue().toString();
            }
        }
        return null;
    }

    /**
     * 根据 value 获取 key
     * @param enumType 枚举
     * @param value 值
     * @param <E> 泛型
     * @return key
     */
    public static <E extends EnumItemAble> String getKey(Class<E> enumType, Object value) {
        for (E e : enumType.getEnumConstants()) {
            if (e.getValue().equals(value)) {
                return String.valueOf(e.getKey());
            }
        }
        return null;
    }

    /**
     * 返回枚举列表
     * @param enumType 枚举
     * @param <E> 泛型
     * @return 返回枚举所有的属性
     */
    public static <E extends EnumItemAble> List<Item> getEnumList(Class<E> enumType) {
        List<Item> list = new ArrayList<>();
        for (E e : enumType.getEnumConstants()) {
            list.add(new Item(e.getKey(), e.getValue()));
        }
        return list;
    }

}
