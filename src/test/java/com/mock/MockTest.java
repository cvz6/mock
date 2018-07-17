package com.mock;

import com.mock.bean.*;
import com.mock.bean.circular.AXB;
import com.mock.bean.enums.DayEnum;
import com.mock.util.JsonUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

import static org.junit.Assert.*;

public class MockTest {

    /**
     * java基本类型模拟测试
     */
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

        //常用类型模拟
        //字符串
        String string = Mock.mock(String.class);
        System.err.println(string);
        //大精度
        BigDecimal bigDecimal = Mock.mock(BigDecimal.class);
        System.err.println(bigDecimal);
        //大整形
        BigInteger bigInteger = Mock.mock(BigInteger.class);
        System.out.println(bigInteger);
        //日期
        Date date = Mock.mock(Date.class);
        System.out.println(date);
        //枚举
        DayEnum dayEnum = Mock.mock(DayEnum.class);
        System.out.println(dayEnum);
    }

    /**
     * 基本类型的数组类型模拟测试
     */
    @Test
    public void testArray() {

       //基本类型 数组 模拟
        byte[] byte1 = Mock.mock(byte[].class);
        System.err.println(JsonUtil.toStr(byte1));//byte转json 这里做了new string 打印是string
        //循环打印出来
        for (byte b:byte1){
            System.out.println(b);
        }

        short[] short1 = Mock.mock(short[].class);
        System.err.println(JsonUtil.toStr(short1));

        int[] int1 = Mock.mock(int[].class);
        System.err.println(JsonUtil.toStr(int1));

        long[] long1 = Mock.mock(long[].class);
        System.err.println(JsonUtil.toStr(long1));

        double[] double1 = Mock.mock(double[].class);
        System.err.println(JsonUtil.toStr(double1));

        float[] float1 = Mock.mock(float[].class);
        System.err.println(JsonUtil.toStr(float1));

        char[] char1 = Mock.mock(char[].class);
        System.err.println(JsonUtil.toStr(char1));

        boolean[] boolean1 = Mock.mock(boolean[].class);
        System.err.println(JsonUtil.toStr(boolean1));

        //基本类型封装类模拟
        Byte[] byte2 = Mock.mock(Byte[].class);
        System.err.println(JsonUtil.toStr(byte2));

        Short[] short2 = Mock.mock(Short[].class);
        System.err.println(JsonUtil.toStr(short2));

        Integer[] int2 = Mock.mock(Integer[].class);
        System.err.println(JsonUtil.toStr(int2));

        Long[] long2 = Mock.mock(Long[].class);
        System.err.println(JsonUtil.toStr(long2));

        Double[] double2 = Mock.mock(Double[].class);
        System.err.println(JsonUtil.toStr(double2));

        Float[] float2 = Mock.mock(Float[].class);
        System.err.println(JsonUtil.toStr(float2));

        Character[] char2 = Mock.mock(Character[].class);
        System.err.println(JsonUtil.toStr(char2));

        Boolean[] boolean2 = Mock.mock(Boolean[].class);
        System.err.println(JsonUtil.toStr(boolean2));

        //常用类型 数组 模拟
        //字符串
        String[] string = Mock.mock(String[].class);
        System.err.println(JsonUtil.toStr(string));
        //大精度
        BigDecimal[] bigDecimal = Mock.mock(BigDecimal[].class);
        System.err.println(JsonUtil.toStr(bigDecimal));
        //大整形
        BigInteger[] bigInteger = Mock.mock(BigInteger[].class);
        System.out.println(JsonUtil.toStr(bigInteger));
        //日期
        Date[] date = Mock.mock(Date[].class);
        System.out.println(JsonUtil.toStr(date));
        //枚举
        DayEnum[] dayEnum = Mock.mock(DayEnum[].class);
        System.out.println(JsonUtil.toStr(dayEnum));
    }


    /**
     * 基本类型的二维数组模拟测试
     */
    @Test
    public void testArray2() {

        //基本类型 二维数组 模拟
        byte[][] byte1 = Mock.mock(byte[][].class);
        System.err.println(JsonUtil.toStr(byte1));//byte转json 这里做了new string 打印是string

        short[][] short1 = Mock.mock(short[][].class);
        System.err.println(JsonUtil.toStr(short1));

        int[][] int1 = Mock.mock(int[][].class);
        System.err.println(JsonUtil.toStr(int1));

        long[][] long1 = Mock.mock(long[][].class);
        System.err.println(JsonUtil.toStr(long1));

        double[][] double1 = Mock.mock(double[][].class);
        System.err.println(JsonUtil.toStr(double1));

        float[][] float1 = Mock.mock(float[][].class);
        System.err.println(JsonUtil.toStr(float1));

        char[][] char1 = Mock.mock(char[][].class);
        System.err.println(JsonUtil.toStr(char1));

        boolean[][] boolean1 = Mock.mock(boolean[][].class);
        System.err.println(JsonUtil.toStr(boolean1));

        //基本类型封装类模拟
        Byte[][] byte2 = Mock.mock(Byte[][].class);
        System.err.println(JsonUtil.toStr(byte2));

        Short[][] short2 = Mock.mock(Short[][].class);
        System.err.println(JsonUtil.toStr(short2));

        Integer[][] int2 = Mock.mock(Integer[][].class);
        System.err.println(JsonUtil.toStr(int2));

        Long[][] long2 = Mock.mock(Long[][].class);
        System.err.println(JsonUtil.toStr(long2));

        Double[][] double2 = Mock.mock(Double[][].class);
        System.err.println(JsonUtil.toStr(double2));

        Float[][] float2 = Mock.mock(Float[][].class);
        System.err.println(JsonUtil.toStr(float2));

        Character[][] char2 = Mock.mock(Character[][].class);
        System.err.println(JsonUtil.toStr(char2));

        Boolean[][] boolean2 = Mock.mock(Boolean[][].class);
        System.err.println(JsonUtil.toStr(boolean2));

        //常用类型 数组 模拟
        //字符串
        String[][] string = Mock.mock(String[][].class);
        System.err.println(JsonUtil.toStr(string));
        //大精度
        BigDecimal[][] bigDecimal = Mock.mock(BigDecimal[][].class);
        System.err.println(JsonUtil.toStr(bigDecimal));
        //大整形
        BigInteger[][] bigInteger = Mock.mock(BigInteger[][].class);
        System.out.println(JsonUtil.toStr(bigInteger));
        //日期
        Date[][] date = Mock.mock(Date[][].class);
        System.out.println(JsonUtil.toStr(date));
        //枚举
        DayEnum[][] dayEnum = Mock.mock(DayEnum[][].class);
        System.out.println(JsonUtil.toStr(dayEnum));
    }

    /**
     * 基本类型的多维数组测试
     */
    @Test
    public void testArray3() {
        //基本类型 二维数组 模拟
        byte[][][] byte1 = Mock.mock(byte[][][].class);
        System.err.println(JsonUtil.toStr(byte1));//byte转json 这里做了new string 打印是string

        short[][][] short1 = Mock.mock(short[][][].class);
        System.err.println(JsonUtil.toStr(short1));

        int[][][] int1 = Mock.mock(int[][][].class);
        System.err.println(JsonUtil.toStr(int1));

        long[][][] long1 = Mock.mock(long[][][].class);
        System.err.println(JsonUtil.toStr(long1));

        double[][][] double1 = Mock.mock(double[][][].class);
        System.err.println(JsonUtil.toStr(double1));

        float[][][] float1 = Mock.mock(float[][][].class);
        System.err.println(JsonUtil.toStr(float1));

        char[][][] char1 = Mock.mock(char[][][].class);
        System.err.println(JsonUtil.toStr(char1));

        boolean[][][] boolean1 = Mock.mock(boolean[][][].class);
        System.err.println(JsonUtil.toStr(boolean1));

        //基本类型封装类模拟
        Byte[][][] byte2 = Mock.mock(Byte[][][].class);
        System.err.println(JsonUtil.toStr(byte2));

        Short[][][] short2 = Mock.mock(Short[][][].class);
        System.err.println(JsonUtil.toStr(short2));

        Integer[][][] int2 = Mock.mock(Integer[][][].class);
        System.err.println(JsonUtil.toStr(int2));

        Long[][][] long2 = Mock.mock(Long[][][].class);
        System.err.println(JsonUtil.toStr(long2));

        Double[][][] double2 = Mock.mock(Double[][][].class);
        System.err.println(JsonUtil.toStr(double2));

        Float[][][] float2 = Mock.mock(Float[][][].class);
        System.err.println(JsonUtil.toStr(float2));

        Character[][][] char2 = Mock.mock(Character[][][].class);
        System.err.println(JsonUtil.toStr(char2));

        Boolean[][][] boolean2 = Mock.mock(Boolean[][][].class);
        System.err.println(JsonUtil.toStr(boolean2));

        //常用类型 数组 模拟
        //字符串
        String[][][] string = Mock.mock(String[][][].class);
        System.err.println(JsonUtil.toStr(string));
        //大精度
        BigDecimal[][][] bigDecimal = Mock.mock(BigDecimal[][][].class);
        System.err.println(JsonUtil.toStr(bigDecimal));
        //大整形
        BigInteger[][][] bigInteger = Mock.mock(BigInteger[][][].class);
        System.out.println(JsonUtil.toStr(bigInteger));
        //日期
        Date[][][] date = Mock.mock(Date[][][].class);
        System.out.println(JsonUtil.toStr(date));
        //枚举
        DayEnum[][][] dayEnum = Mock.mock(DayEnum[][][].class);
        System.out.println(JsonUtil.toStr(dayEnum));
    }

    /**
     * 任意类型
     * 注意TypeReference要加{}才能模拟
     */
    @Test
    public void testTypeRefrence() {
        //模拟基础类型，不建议使用这种方式，参考基础类型章节直接模拟。
        Integer integerNum = Mock.mock(new TypeKit<Integer>() {
        });
        System.err.println(JsonUtil.toStr(integerNum));
        Integer[] integerArray = Mock.mock(new TypeKit<Integer[]>() {
        });
        System.err.println(JsonUtil.toStr(integerArray));
        //模拟集合
        List<Integer> integerList = Mock.mock(new TypeKit<List<Integer>>() {
        });
        System.err.println(JsonUtil.toStr(integerList));
        //模拟数组集合
        List<Integer[]> integerArrayList = Mock.mock(new TypeKit<List<Integer[]>>() {
        });
        System.err.println(JsonUtil.toStr(integerArrayList));
        //模拟集合数组
        List<Integer>[] integerListArray = Mock.mock(new TypeKit<List<Integer>[]>() {
        });
        System.err.println(JsonUtil.toStr(integerListArray));
        //模拟集合实体
        List<BasicBean> basicBeanList = Mock.mock(new TypeKit<List<BasicBean>>() {
        });
        System.err.println(JsonUtil.toStr(basicBeanList));
        //各种组合忽略。。。。map同理。下面模拟一个不知道什么类型的map
        Map<List<Map<Integer, String[][]>>, Map<Set<String>, Double[]>> some = Mock
                .mock(new TypeKit<Map<List<Map<Integer, String[][]>>, Map<Set<String>, Double[]>>>() {
                });
        System.err.println(JsonUtil.toStr(some));
    }

    @Test
    public void testGenericData() {
        GenericData<Integer, String, BasicBean> genericData = Mock.mock(new TypeKit<GenericData<Integer, String, BasicBean>>() {
        });
        System.err.println(JsonUtil.toStr(genericData));
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


    @Test
    public void testBasicData() {
        BasicBean basicBean = Mock.mock(BasicBean.class);
        System.out.println(JsonUtil.toStr(basicBean));;
    }

    /**
     * 测试忽略属性
     */
    @Test
    public void testIgnore() {
        IgnoreBean a = Mock.mock(IgnoreBean.class);
        System.err.println(JsonUtil.toStr(a));;
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

    /**
     * 测试返回汉语句子
     */
    @Test
    public void testChineseString() {
        String mock = Mock.mock(String.class);
        System.out.println(mock);
    }


    /**
     * 测试返回汉语句子
     */
    @Test
    public void testChineseStringBean() {
        StringBean mock = Mock.mock(StringBean.class);
        System.out.println(JsonUtil.toStr(mock));
    }

}
