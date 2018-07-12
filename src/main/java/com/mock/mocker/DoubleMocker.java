package com.mock.mocker;

import com.mock.MockConfig;
import com.mock.Mocker;
import com.mock.util.RandomUtils;

/**
 * Double对象模拟器
 */
public class DoubleMocker implements Mocker<Double> {

  @Override
  public Double mock(MockConfig mockConfig) {
    return RandomUtils.nextDouble(mockConfig.getDoubleRange()[0], mockConfig.getDoubleRange()[1]);
  }

}
