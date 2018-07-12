package com.mock.mocker;

import com.mock.MockConfig;
import com.mock.Mocker;
import com.mock.util.RandomUtils;

import java.util.Date;

/**
 * Date对象模拟器
 */
public class DateMocker extends AbstractDateMock implements Mocker<Date> {

  public DateMocker(String startTimePattern, String endTime) {
    super(startTimePattern, endTime);
  }

  @Override
  public Date mock(MockConfig mockConfig) {
    return new Date(RandomUtils.nextLong(startTime, endTime));
  }

}
