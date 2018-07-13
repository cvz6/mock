package com.mock;

import com.mock.bean.BasicBean;
import com.mock.bean.ErrorBean;
import com.mock.bean.GenericData;
import com.mock.bean.SelfRefData;
import com.mock.bean.circular.AXB;
import com.mock.bean.enums.DayEnum;
import com.mock.util.JsonUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MockTest {

    @Test
    public void testBasic() {
        //基本类型模拟
        byte byte1 = Mock.mock(byte.class);
        System.err.println(byte1);

        short short1 = Mock.mock(short.class);
        System.err.println(short1);

        int int1 = Mock.mock(int.class);
        System.err.println(int1);

        long long1 = Mock.mock(long.class);
        System.err.println(long1);

        double double1 = Mock.mock(double.class);
        System.err.println(double1);

        float float1 = Mock.mock(float.class);
        System.err.println(float1);

        char char1 = Mock.mock(char.class);
        System.err.println(char1);

        boolean boolean1 = Mock.mock(boolean.class);
        System.err.println(boolean1);

        //基本类型封装类模拟
        Byte byte2 = Mock.mock(Byte.class);
        System.err.println(byte2);

        Short short2 = Mock.mock(Short.class);
        System.err.println(short2);

        Integer int2 = Mock.mock(Integer.class);
        System.err.println(int2);

        Long long2 = Mock.mock(Long.class);
        System.err.println(long2);

        Double double2 = Mock.mock(Double.class);
        System.err.println(double2);

        Float float2 = Mock.mock(Float.class);
        System.err.println(float2);

        Character char2 = Mock.mock(Character.class);
        System.err.println(char2);

        Boolean boolean2 = Mock.mock(Boolean.class);
        System.err.println(boolean2);
    }

    @Test
    public void testArray() {

        int[] intArray = Mock.mock(int[].class);
        System.err.println(JsonUtil.toStr(intArray));


        Integer[] integerArray = Mock.mock(Integer[].class);
        System.err.println(JsonUtil.toStr(integerArray));

        //常用类型模拟
        BigDecimal bigDecimal = Mock.mock(BigDecimal.class);
        assertNotNull(bigDecimal);
        BigInteger bigInteger = Mock.mock(BigInteger.class);
        assertNotNull(bigInteger);
        Date date = Mock.mock(Date.class);
        assertNotNull(date);
        String str = Mock.mock(String.class);
        assertNotNull(str);
        DayEnum dayEnum = Mock.mock(DayEnum.class);
        assertNotNull(dayEnum);
    }

    @Test
    public void testBasicData() {
        BasicBean basicBean = Mock.mock(BasicBean.class);
        assertNotNull(basicBean);

        try {
            Mock.mock(ErrorBean.class);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testCircular() {
        MockConfig mockConfig = new MockConfig().setEnabledCircle(true);
        AXB axb = Mock.mock(AXB.class, mockConfig);
        AXB circularAxb = axb.getBXA().getAXB();
        assertSame(axb, circularAxb);
    }

    @Test
    public void testSelf() {
        MockConfig mockConfig = new MockConfig().setEnabledCircle(true);
        SelfRefData selfRefData = Mock.mock(SelfRefData.class, mockConfig);
        assertSame(selfRefData.getParent(), selfRefData);
    }

    @Test
    //******注意TypeReference要加{}才能模拟******
    public void testTypeRefrence() {
        //模拟基础类型，不建议使用这种方式，参考基础类型章节直接模拟。
        Integer integerNum = Mock.mock(new TypeReference<Integer>() {
        });
        assertNotNull(integerNum);
        Integer[] integerArray = Mock.mock(new TypeReference<Integer[]>() {
        });
        assertNotNull(integerArray);
        //模拟集合
        List<Integer> integerList = Mock.mock(new TypeReference<List<Integer>>() {
        });
        assertNotNull(integerList);
        //模拟数组集合
        List<Integer[]> integerArrayList = Mock.mock(new TypeReference<List<Integer[]>>() {
        });
        assertNotNull(integerArrayList);
        //模拟集合数组
        List<Integer>[] integerListArray = Mock.mock(new TypeReference<List<Integer>[]>() {
        });
        assertNotNull(integerListArray);
        //模拟集合实体
        List<BasicBean> basicBeanList = Mock.mock(new TypeReference<List<BasicBean>>() {
        });
        assertNotNull(basicBeanList);
        //各种组合忽略。。。。map同理。下面模拟一个不知道什么类型的map
        Map<List<Map<Integer, String[][]>>, Map<Set<String>, Double[]>> some = Mock
                .mock(new TypeReference<Map<List<Map<Integer, String[][]>>, Map<Set<String>, Double[]>>>() {
                });
        assertNotNull(some);
    }

    @Test
    public void testGenericData() {
        GenericData<Integer, String, BasicBean> genericData = Mock.mock(new TypeReference<GenericData<Integer, String, BasicBean>>() {
        });
        assertNotNull(genericData);
    }

    @Test
    public void testMockConfig() {
        MockConfig mockConfig = new MockConfig()
                .byteRange((byte) 0, Byte.MAX_VALUE)
                .shortRange((short) 0, Short.MAX_VALUE)
                .intRange(0, Integer.MAX_VALUE)
                .floatRange(0.0f, Float.MAX_VALUE)
                .doubleRange(0.0, Double.MAX_VALUE)
                .longRange(0, Long.MAX_VALUE)
                .dateRange("2010-01-01", "2020-12-30")
                .sizeRange(5, 10)
                .stringSeed("a", "b", "c")
                .charSeed((char) 97, (char) 98);
        BasicBean basicBean = Mock.mock(BasicBean.class, mockConfig);
        assertNotNull(basicBean);

        try {
            Mock.mock(BasicBean.class, new MockConfig().dateRange("20100101", "20301230"));
            fail();
        } catch (Exception e) {
        }
    }

}
