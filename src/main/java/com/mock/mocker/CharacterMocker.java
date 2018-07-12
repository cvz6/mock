package com.mock.mocker;

import com.mock.MockConfig;
import com.mock.Mocker;
import com.mock.util.RandomUtils;

/**
 * Character对象模拟器
 */
public class CharacterMocker implements Mocker<Character> {

  @Override
  public Character mock(MockConfig mockConfig) {
    char[] charSeed = mockConfig.getCharSeed();
    return charSeed[RandomUtils.nextInt(0, charSeed.length)];
  }

}
