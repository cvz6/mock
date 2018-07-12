package com.mock.mocker;

import com.mock.MockConfig;
import com.mock.Mocker;
import com.mock.util.RandomUtils;

import java.math.BigInteger;

/**
 * BigInteger对象模拟器
 */
public class BigIntegerMocker implements Mocker<BigInteger> {

  @Override
  public BigInteger mock(MockConfig mockConfig) {
    return BigInteger.valueOf(RandomUtils.nextLong(mockConfig.getLongRange()[0], mockConfig.getLongRange()[1]));
  }

}
