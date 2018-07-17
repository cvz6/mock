package com.mock;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 类型工具  抽象类包装 泛型类
 *
 * 用以获取泛型的类型
 * @param <T> 泛型
 */
public abstract class TypeKit<T> {

  private final Type type;

  public TypeKit() {
    Type superClass = getClass().getGenericSuperclass();
    if (superClass instanceof Class) {
      throw new MockException("不支持的类型或者检查参数是否已经添加{},eg: Mock.mock(new TypeKit<Integer>(){})");
    }
    type = ((ParameterizedType) superClass).getActualTypeArguments()[0];
  }

  public Type getType() {
    return type;
  }

}
