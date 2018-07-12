package com.mock;

import com.mock.bean.BasicBean;
import com.mock.bean.ErrorBean;
import com.mock.bean.GenericData;
import com.mock.bean.SelfRefData;
import com.mock.bean.circular.AXB;
import com.mock.bean.enums.DayEnum;
import com.mock.bean.enums.ErrorEnum;
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
        int intNum = Mock.mock(int.class);
        assertNotNull(intNum);
        int[] intArray = Mock.mock(int[].class);
        assertNotNull(intArray);
        Integer integer = Mock.mock(Integer.class);
        assertNotNull(integer);
        Integer[] integerArray = Mock.mock(Integer[].class);
        assertNotNull(integerArray);
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

        try {
            Mock.mock(ErrorEnum.class);
            fail();
        } catch (Exception e) {
        }
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
                .floatRange(0.0f, Float.MAX_EXPONENT)
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
