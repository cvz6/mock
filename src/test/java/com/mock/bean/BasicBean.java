package com.mock.bean;

import com.mock.bean.enums.DayEnum;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BasicBean {

    //基本类型
    private byte byteNum;
    private boolean booleanNum;
    private char charNum;
    private short shortNum;
    private int integerNum;
    private long longNum;
    private float floatNum;
    private double doubleNum;

    //基本包装类型
    private Byte byteBoxing;
    private Boolean booleanBoxing;
    private Character charBoxing;
    private Short shortBoxing;
    private Integer integerBoxing;
    private Long longBoxing;
    private Float floatBoxing;
    private Double doubleBoxing;

    //基本类型数组
    private byte[] byteNumArray;
    private boolean[] booleanNumArray;
    private char[] charNumArray;
    private short[] shortNumArray;
    private int[] integerNumArray;
    private long[] longNumArray;
    private float[] floatNumArray;
    private double[] doubleNumArray;

    //基本类型二维数组
    private byte[][] byteNumDoubleArray;
    private boolean[][] booleanNumDoubleArray;
    private char[][] charNumDoubleArray;
    private short[][] shortNumDoubleArray;
    private int[][] integerNumDoubleArray;
    private long[][] longNumDoubleArray;
    private float[][] floatNumDoubleArray;
    private double[][] doubleNumDoubleArray;

    //基本包装类型数组
    private Byte[] byteBoxingArray;
    private Boolean[] booleanBoxingArray;
    private Character[] charBoxingArray;
    private Short[] shortBoxingArray;
    private Integer[] integerBoxingArray;
    private Long[] longBoxingArray;
    private Float[] floatBoxingArray;
    private Double[] doubleBoxingArray;

    //基本包装类型二维数组
    private Byte[][] byteBoxingDoubleArray;
    private Boolean[][] booleanBoxingDoubleArray;
    private Character[][] charBoxingDoubleArray;
    private Short[][] shortBoxingDoubleArray;
    private Integer[][] integerBoxingDoubleArray;
    private Long[][] longBoxingDoubleArray;
    private Float[][] floatBoxingDoubleArray;
    private Double[][] doubleBoxingDoubleArray;

    //其他常用类型
    private BigDecimal bigDecimal;
    private BigInteger bigInteger;
    private Date date;
    private String string;
    private DayEnum dayEnum;
    private TimeUnit timeUnit;

    //其他常用类型数组
    private BigDecimal[] bigDecimalArray;
    private BigInteger[] bigIntegerArray;
    private Date[] dateArray;
    private String[] stringArray;
    private DayEnum[] dayEnumArray;

    //其他常用类型二维数组
    private BigDecimal[][] bigDecimalDoubleArray;
    private BigInteger[][] bigIntegerDoubleArray;
    private Date[][] dateDoubleArray;
    private String[][] stringDoubleArray;
    private DayEnum[][] dayEnumDoubleArray;

    //集合、MAP数组
    private List<Integer>[] listArray;
    private Set<Integer>[] setArray;
    private Map<Integer, String>[] mapArray;

    //集合、MAP二维数组
    private List<Integer>[][] listDoubleArray;
    private Set<Integer>[][] setDoubleArray;
    private Map<Integer, String>[][] mapDoubleArray;

    //集合、MAP二维数组(内部数组)
    private List<Integer[]>[][] listInnerArrayDoubleArray;
    private Set<Integer[]>[][] setInnerArrayDoubleArray;
    private Map<Integer[], String[]>[][] mapInnerArrayDoubleArray;

    //集合、MAP二维数组(内部二维数组)
    private List<Integer[][]>[][] listInnerDoubleArrayDoubleArray;
    private Set<Integer[][]>[][] setInnerDoubleArrayDoubleArray;
    private Map<Integer[][], String[][]>[][] mapInnerDoubleArrayDoubleArray;

    //LIST
    private List<Byte> byteBoxingList;
    private List<Boolean> booleanBoxingList;
    private List<Character> charBoxingList;
    private List<Short> shortBoxingList;
    private List<Integer> integerBoxingList;
    private List<Long> longBoxingList;
    private List<Float> floatBoxingList;
    private List<Double> doubleBoxingList;
    private List<BigDecimal> bigDecimalList;
    private List<BigInteger> bigIntegerList;
    private List<Date> dateList;
    private List<String> stringList;
    private List<List<String>> stringListList;
    private List<Set<String>> stringSetList;
    private List<Map<Integer, String>> mapList;

    //数组LIST
    private List<Byte[]> byteBoxingArrayList;
    private List<Boolean[]> booleanBoxingArrayList;
    private List<Character[]> charBoxingArrayList;
    private List<Short[]> shortBoxingArrayList;
    private List<Integer[]> integerBoxingArrayList;
    private List<Long[]> longBoxingArrayList;
    private List<Float[]> floatBoxingArrayList;
    private List<Double[]> doubleBoxingArrayList;
    private List<BigDecimal[]> bigDecimalArrayList;
    private List<BigInteger[]> bigIntegerArrayList;
    private List<Date[]> dateArrayList;
    private List<String[]> stringArrayList;

    //二维数组LIST
    private List<Byte[][]> byteBoxingDoubleArrayList;
    private List<Boolean[][]> booleanBoxingDoubleArrayList;
    private List<Character[][]> charBoxingDoubleArrayList;
    private List<Short[][]> shortBoxingDoubleArrayList;
    private List<Integer[][]> integerBoxingDoubleArrayList;
    private List<Long[][]> longBoxingDoubleArrayList;
    private List<Float[][]> floatBoxingDoubleArrayList;
    private List<Double[][]> doubleBoxingDoubleArrayList;
    private List<BigDecimal[][]> bigDecimalDoubleArrayList;
    private List<BigInteger[][]> bigIntegerDoubleArrayList;
    private List<Date[][]> dateDoubleArrayList;
    private List<String[][]> stringDoubleArrayList;

    //SET
    private Set<Byte> byteBoxingSet;
    private Set<Boolean> booleanBoxingSet;
    private Set<Character> charBoxingSet;
    private Set<Short> shortBoxingSet;
    private Set<Integer> integerBoxingSet;
    private Set<Long> longBoxingSet;
    private Set<Float> floatBoxingSet;
    private Set<Double> doubleBoxingSet;
    private Set<BigDecimal> bigDecimalSet;
    private Set<BigInteger> bigIntegerSet;
    private Set<Date> dateSet;
    private Set<String> stringSet;
    private Set<List<String>> stringListSet;
    private Set<Set<String>> stringSetSet;
    private Set<Map<Integer, String>> mapSet;

    //数组SET
    private Set<Byte[]> byteBoxingArraySet;
    private Set<Boolean[]> booleanBoxingArraySet;
    private Set<Character[]> charBoxingArraySet;
    private Set<Short[]> shortBoxingArraySet;
    private Set<Integer[]> integerBoxingArraySet;
    private Set<Long[]> longBoxingArraySet;
    private Set<Float[]> floatBoxingArraySet;
    private Set<Double[]> doubleBoxingArraySet;
    private Set<BigDecimal[]> bigDecimalArraySet;
    private Set<BigInteger[]> bigIntegerArraySet;
    private Set<Date[]> dateArraySet;
    private Set<String[]> stringArraySet;

    //二维数组SET
    private Set<Byte[][]> byteBoxingDoubleArraySet;
    private Set<Boolean[][]> booleanBoxingDoubleArraySet;
    private Set<Character[][]> charBoxingDoubleArraySet;
    private Set<Short[][]> shortBoxingDoubleArraySet;
    private Set<Integer[][]> integerBoxingDoubleArraySet;
    private Set<Long[][]> longBoxingDoubleArraySet;
    private Set<Float[][]> floatBoxingDoubleArraySet;
    private Set<Double[][]> doubleBoxingDoubleArraySet;
    private Set<BigDecimal[][]> bigDecimalDoubleArraySet;
    private Set<BigInteger[][]> bigIntegerDoubleArraySet;
    private Set<Date[][]> dateDoubleArraySet;
    private Set<String[][]> stringDoubleArraySet;

    //Map
    private Map<String, Integer> basicMap;
    private Map<String[], Integer> keyArrayMap;
    private Map<String, Integer[]> valueArrayMap;
    private Map<String[], Integer[]> keyValueArrayMap;
    private Map<String[][], Integer[][]> keyValueDoubleArrayMap;
    private Map<List<String>, Map<String, Integer>> keyListValueMapMap;
    private Map<List<String>[], Map<String, Integer>[]> keyArrayListValueArrayMapMap;

    public byte getByteNum() {
        return byteNum;
    }

    public void setByteNum(byte byteNum) {
        this.byteNum = byteNum;
    }

    public boolean isBooleanNum() {
        return booleanNum;
    }

    public void setBooleanNum(boolean booleanNum) {
        this.booleanNum = booleanNum;
    }

    public char getCharNum() {
        return charNum;
    }

    public void setCharNum(char charNum) {
        this.charNum = charNum;
    }

    public short getShortNum() {
        return shortNum;
    }

    public void setShortNum(short shortNum) {
        this.shortNum = shortNum;
    }

    public int getIntegerNum() {
        return integerNum;
    }

    public void setIntegerNum(int integerNum) {
        this.integerNum = integerNum;
    }

    public long getLongNum() {
        return longNum;
    }

    public void setLongNum(long longNum) {
        this.longNum = longNum;
    }

    public float getFloatNum() {
        return floatNum;
    }

    public void setFloatNum(float floatNum) {
        this.floatNum = floatNum;
    }

    public double getDoubleNum() {
        return doubleNum;
    }

    public void setDoubleNum(double doubleNum) {
        this.doubleNum = doubleNum;
    }

    public Byte getByteBoxing() {
        return byteBoxing;
    }

    public void setByteBoxing(Byte byteBoxing) {
        this.byteBoxing = byteBoxing;
    }

    public Boolean getBooleanBoxing() {
        return booleanBoxing;
    }

    public void setBooleanBoxing(Boolean booleanBoxing) {
        this.booleanBoxing = booleanBoxing;
    }

    public Character getCharBoxing() {
        return charBoxing;
    }

    public void setCharBoxing(Character charBoxing) {
        this.charBoxing = charBoxing;
    }

    public Short getShortBoxing() {
        return shortBoxing;
    }

    public void setShortBoxing(Short shortBoxing) {
        this.shortBoxing = shortBoxing;
    }

    public Integer getIntegerBoxing() {
        return integerBoxing;
    }

    public void setIntegerBoxing(Integer integerBoxing) {
        this.integerBoxing = integerBoxing;
    }

    public Long getLongBoxing() {
        return longBoxing;
    }

    public void setLongBoxing(Long longBoxing) {
        this.longBoxing = longBoxing;
    }

    public Float getFloatBoxing() {
        return floatBoxing;
    }

    public void setFloatBoxing(Float floatBoxing) {
        this.floatBoxing = floatBoxing;
    }

    public Double getDoubleBoxing() {
        return doubleBoxing;
    }

    public void setDoubleBoxing(Double doubleBoxing) {
        this.doubleBoxing = doubleBoxing;
    }

    public byte[] getByteNumArray() {
        return byteNumArray;
    }

    public void setByteNumArray(byte[] byteNumArray) {
        this.byteNumArray = byteNumArray;
    }

    public boolean[] getBooleanNumArray() {
        return booleanNumArray;
    }

    public void setBooleanNumArray(boolean[] booleanNumArray) {
        this.booleanNumArray = booleanNumArray;
    }

    public char[] getCharNumArray() {
        return charNumArray;
    }

    public void setCharNumArray(char[] charNumArray) {
        this.charNumArray = charNumArray;
    }

    public short[] getShortNumArray() {
        return shortNumArray;
    }

    public void setShortNumArray(short[] shortNumArray) {
        this.shortNumArray = shortNumArray;
    }

    public int[] getIntegerNumArray() {
        return integerNumArray;
    }

    public void setIntegerNumArray(int[] integerNumArray) {
        this.integerNumArray = integerNumArray;
    }

    public long[] getLongNumArray() {
        return longNumArray;
    }

    public void setLongNumArray(long[] longNumArray) {
        this.longNumArray = longNumArray;
    }

    public float[] getFloatNumArray() {
        return floatNumArray;
    }

    public void setFloatNumArray(float[] floatNumArray) {
        this.floatNumArray = floatNumArray;
    }

    public double[] getDoubleNumArray() {
        return doubleNumArray;
    }

    public void setDoubleNumArray(double[] doubleNumArray) {
        this.doubleNumArray = doubleNumArray;
    }

    public byte[][] getByteNumDoubleArray() {
        return byteNumDoubleArray;
    }

    public void setByteNumDoubleArray(byte[][] byteNumDoubleArray) {
        this.byteNumDoubleArray = byteNumDoubleArray;
    }

    public boolean[][] getBooleanNumDoubleArray() {
        return booleanNumDoubleArray;
    }

    public void setBooleanNumDoubleArray(boolean[][] booleanNumDoubleArray) {
        this.booleanNumDoubleArray = booleanNumDoubleArray;
    }

    public char[][] getCharNumDoubleArray() {
        return charNumDoubleArray;
    }

    public void setCharNumDoubleArray(char[][] charNumDoubleArray) {
        this.charNumDoubleArray = charNumDoubleArray;
    }

    public short[][] getShortNumDoubleArray() {
        return shortNumDoubleArray;
    }

    public void setShortNumDoubleArray(short[][] shortNumDoubleArray) {
        this.shortNumDoubleArray = shortNumDoubleArray;
    }

    public int[][] getIntegerNumDoubleArray() {
        return integerNumDoubleArray;
    }

    public void setIntegerNumDoubleArray(int[][] integerNumDoubleArray) {
        this.integerNumDoubleArray = integerNumDoubleArray;
    }

    public long[][] getLongNumDoubleArray() {
        return longNumDoubleArray;
    }

    public void setLongNumDoubleArray(long[][] longNumDoubleArray) {
        this.longNumDoubleArray = longNumDoubleArray;
    }

    public float[][] getFloatNumDoubleArray() {
        return floatNumDoubleArray;
    }

    public void setFloatNumDoubleArray(float[][] floatNumDoubleArray) {
        this.floatNumDoubleArray = floatNumDoubleArray;
    }

    public double[][] getDoubleNumDoubleArray() {
        return doubleNumDoubleArray;
    }

    public void setDoubleNumDoubleArray(double[][] doubleNumDoubleArray) {
        this.doubleNumDoubleArray = doubleNumDoubleArray;
    }

    public Byte[] getByteBoxingArray() {
        return byteBoxingArray;
    }

    public void setByteBoxingArray(Byte[] byteBoxingArray) {
        this.byteBoxingArray = byteBoxingArray;
    }

    public Boolean[] getBooleanBoxingArray() {
        return booleanBoxingArray;
    }

    public void setBooleanBoxingArray(Boolean[] booleanBoxingArray) {
        this.booleanBoxingArray = booleanBoxingArray;
    }

    public Character[] getCharBoxingArray() {
        return charBoxingArray;
    }

    public void setCharBoxingArray(Character[] charBoxingArray) {
        this.charBoxingArray = charBoxingArray;
    }

    public Short[] getShortBoxingArray() {
        return shortBoxingArray;
    }

    public void setShortBoxingArray(Short[] shortBoxingArray) {
        this.shortBoxingArray = shortBoxingArray;
    }

    public Integer[] getIntegerBoxingArray() {
        return integerBoxingArray;
    }

    public void setIntegerBoxingArray(Integer[] integerBoxingArray) {
        this.integerBoxingArray = integerBoxingArray;
    }

    public Long[] getLongBoxingArray() {
        return longBoxingArray;
    }

    public void setLongBoxingArray(Long[] longBoxingArray) {
        this.longBoxingArray = longBoxingArray;
    }

    public Float[] getFloatBoxingArray() {
        return floatBoxingArray;
    }

    public void setFloatBoxingArray(Float[] floatBoxingArray) {
        this.floatBoxingArray = floatBoxingArray;
    }

    public Double[] getDoubleBoxingArray() {
        return doubleBoxingArray;
    }

    public void setDoubleBoxingArray(Double[] doubleBoxingArray) {
        this.doubleBoxingArray = doubleBoxingArray;
    }

    public Byte[][] getByteBoxingDoubleArray() {
        return byteBoxingDoubleArray;
    }

    public void setByteBoxingDoubleArray(Byte[][] byteBoxingDoubleArray) {
        this.byteBoxingDoubleArray = byteBoxingDoubleArray;
    }

    public Boolean[][] getBooleanBoxingDoubleArray() {
        return booleanBoxingDoubleArray;
    }

    public void setBooleanBoxingDoubleArray(Boolean[][] booleanBoxingDoubleArray) {
        this.booleanBoxingDoubleArray = booleanBoxingDoubleArray;
    }

    public Character[][] getCharBoxingDoubleArray() {
        return charBoxingDoubleArray;
    }

    public void setCharBoxingDoubleArray(Character[][] charBoxingDoubleArray) {
        this.charBoxingDoubleArray = charBoxingDoubleArray;
    }

    public Short[][] getShortBoxingDoubleArray() {
        return shortBoxingDoubleArray;
    }

    public void setShortBoxingDoubleArray(Short[][] shortBoxingDoubleArray) {
        this.shortBoxingDoubleArray = shortBoxingDoubleArray;
    }

    public Integer[][] getIntegerBoxingDoubleArray() {
        return integerBoxingDoubleArray;
    }

    public void setIntegerBoxingDoubleArray(Integer[][] integerBoxingDoubleArray) {
        this.integerBoxingDoubleArray = integerBoxingDoubleArray;
    }

    public Long[][] getLongBoxingDoubleArray() {
        return longBoxingDoubleArray;
    }

    public void setLongBoxingDoubleArray(Long[][] longBoxingDoubleArray) {
        this.longBoxingDoubleArray = longBoxingDoubleArray;
    }

    public Float[][] getFloatBoxingDoubleArray() {
        return floatBoxingDoubleArray;
    }

    public void setFloatBoxingDoubleArray(Float[][] floatBoxingDoubleArray) {
        this.floatBoxingDoubleArray = floatBoxingDoubleArray;
    }

    public Double[][] getDoubleBoxingDoubleArray() {
        return doubleBoxingDoubleArray;
    }

    public void setDoubleBoxingDoubleArray(Double[][] doubleBoxingDoubleArray) {
        this.doubleBoxingDoubleArray = doubleBoxingDoubleArray;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public BigInteger getBigInteger() {
        return bigInteger;
    }

    public void setBigInteger(BigInteger bigInteger) {
        this.bigInteger = bigInteger;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public DayEnum getDayEnum() {
        return dayEnum;
    }

    public void setDayEnum(DayEnum dayEnum) {
        this.dayEnum = dayEnum;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public BigDecimal[] getBigDecimalArray() {
        return bigDecimalArray;
    }

    public void setBigDecimalArray(BigDecimal[] bigDecimalArray) {
        this.bigDecimalArray = bigDecimalArray;
    }

    public BigInteger[] getBigIntegerArray() {
        return bigIntegerArray;
    }

    public void setBigIntegerArray(BigInteger[] bigIntegerArray) {
        this.bigIntegerArray = bigIntegerArray;
    }

    public Date[] getDateArray() {
        return dateArray;
    }

    public void setDateArray(Date[] dateArray) {
        this.dateArray = dateArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public DayEnum[] getDayEnumArray() {
        return dayEnumArray;
    }

    public void setDayEnumArray(DayEnum[] dayEnumArray) {
        this.dayEnumArray = dayEnumArray;
    }

    public BigDecimal[][] getBigDecimalDoubleArray() {
        return bigDecimalDoubleArray;
    }

    public void setBigDecimalDoubleArray(BigDecimal[][] bigDecimalDoubleArray) {
        this.bigDecimalDoubleArray = bigDecimalDoubleArray;
    }

    public BigInteger[][] getBigIntegerDoubleArray() {
        return bigIntegerDoubleArray;
    }

    public void setBigIntegerDoubleArray(BigInteger[][] bigIntegerDoubleArray) {
        this.bigIntegerDoubleArray = bigIntegerDoubleArray;
    }

    public Date[][] getDateDoubleArray() {
        return dateDoubleArray;
    }

    public void setDateDoubleArray(Date[][] dateDoubleArray) {
        this.dateDoubleArray = dateDoubleArray;
    }

    public String[][] getStringDoubleArray() {
        return stringDoubleArray;
    }

    public void setStringDoubleArray(String[][] stringDoubleArray) {
        this.stringDoubleArray = stringDoubleArray;
    }

    public DayEnum[][] getDayEnumDoubleArray() {
        return dayEnumDoubleArray;
    }

    public void setDayEnumDoubleArray(DayEnum[][] dayEnumDoubleArray) {
        this.dayEnumDoubleArray = dayEnumDoubleArray;
    }

    public List<Integer>[] getListArray() {
        return listArray;
    }

    public void setListArray(List<Integer>[] listArray) {
        this.listArray = listArray;
    }

    public Set<Integer>[] getSetArray() {
        return setArray;
    }

    public void setSetArray(Set<Integer>[] setArray) {
        this.setArray = setArray;
    }

    public Map<Integer, String>[] getMapArray() {
        return mapArray;
    }

    public void setMapArray(Map<Integer, String>[] mapArray) {
        this.mapArray = mapArray;
    }

    public List<Integer>[][] getListDoubleArray() {
        return listDoubleArray;
    }

    public void setListDoubleArray(List<Integer>[][] listDoubleArray) {
        this.listDoubleArray = listDoubleArray;
    }

    public Set<Integer>[][] getSetDoubleArray() {
        return setDoubleArray;
    }

    public void setSetDoubleArray(Set<Integer>[][] setDoubleArray) {
        this.setDoubleArray = setDoubleArray;
    }

    public Map<Integer, String>[][] getMapDoubleArray() {
        return mapDoubleArray;
    }

    public void setMapDoubleArray(Map<Integer, String>[][] mapDoubleArray) {
        this.mapDoubleArray = mapDoubleArray;
    }

    public List<Integer[]>[][] getListInnerArrayDoubleArray() {
        return listInnerArrayDoubleArray;
    }

    public void setListInnerArrayDoubleArray(List<Integer[]>[][] listInnerArrayDoubleArray) {
        this.listInnerArrayDoubleArray = listInnerArrayDoubleArray;
    }

    public Set<Integer[]>[][] getSetInnerArrayDoubleArray() {
        return setInnerArrayDoubleArray;
    }

    public void setSetInnerArrayDoubleArray(Set<Integer[]>[][] setInnerArrayDoubleArray) {
        this.setInnerArrayDoubleArray = setInnerArrayDoubleArray;
    }

    public Map<Integer[], String[]>[][] getMapInnerArrayDoubleArray() {
        return mapInnerArrayDoubleArray;
    }

    public void setMapInnerArrayDoubleArray(Map<Integer[], String[]>[][] mapInnerArrayDoubleArray) {
        this.mapInnerArrayDoubleArray = mapInnerArrayDoubleArray;
    }

    public List<Integer[][]>[][] getListInnerDoubleArrayDoubleArray() {
        return listInnerDoubleArrayDoubleArray;
    }

    public void setListInnerDoubleArrayDoubleArray(List<Integer[][]>[][] listInnerDoubleArrayDoubleArray) {
        this.listInnerDoubleArrayDoubleArray = listInnerDoubleArrayDoubleArray;
    }

    public Set<Integer[][]>[][] getSetInnerDoubleArrayDoubleArray() {
        return setInnerDoubleArrayDoubleArray;
    }

    public void setSetInnerDoubleArrayDoubleArray(Set<Integer[][]>[][] setInnerDoubleArrayDoubleArray) {
        this.setInnerDoubleArrayDoubleArray = setInnerDoubleArrayDoubleArray;
    }

    public Map<Integer[][], String[][]>[][] getMapInnerDoubleArrayDoubleArray() {
        return mapInnerDoubleArrayDoubleArray;
    }

    public void setMapInnerDoubleArrayDoubleArray(Map<Integer[][], String[][]>[][] mapInnerDoubleArrayDoubleArray) {
        this.mapInnerDoubleArrayDoubleArray = mapInnerDoubleArrayDoubleArray;
    }

    public List<Byte> getByteBoxingList() {
        return byteBoxingList;
    }

    public void setByteBoxingList(List<Byte> byteBoxingList) {
        this.byteBoxingList = byteBoxingList;
    }

    public List<Boolean> getBooleanBoxingList() {
        return booleanBoxingList;
    }

    public void setBooleanBoxingList(List<Boolean> booleanBoxingList) {
        this.booleanBoxingList = booleanBoxingList;
    }

    public List<Character> getCharBoxingList() {
        return charBoxingList;
    }

    public void setCharBoxingList(List<Character> charBoxingList) {
        this.charBoxingList = charBoxingList;
    }

    public List<Short> getShortBoxingList() {
        return shortBoxingList;
    }

    public void setShortBoxingList(List<Short> shortBoxingList) {
        this.shortBoxingList = shortBoxingList;
    }

    public List<Integer> getIntegerBoxingList() {
        return integerBoxingList;
    }

    public void setIntegerBoxingList(List<Integer> integerBoxingList) {
        this.integerBoxingList = integerBoxingList;
    }

    public List<Long> getLongBoxingList() {
        return longBoxingList;
    }

    public void setLongBoxingList(List<Long> longBoxingList) {
        this.longBoxingList = longBoxingList;
    }

    public List<Float> getFloatBoxingList() {
        return floatBoxingList;
    }

    public void setFloatBoxingList(List<Float> floatBoxingList) {
        this.floatBoxingList = floatBoxingList;
    }

    public List<Double> getDoubleBoxingList() {
        return doubleBoxingList;
    }

    public void setDoubleBoxingList(List<Double> doubleBoxingList) {
        this.doubleBoxingList = doubleBoxingList;
    }

    public List<BigDecimal> getBigDecimalList() {
        return bigDecimalList;
    }

    public void setBigDecimalList(List<BigDecimal> bigDecimalList) {
        this.bigDecimalList = bigDecimalList;
    }

    public List<BigInteger> getBigIntegerList() {
        return bigIntegerList;
    }

    public void setBigIntegerList(List<BigInteger> bigIntegerList) {
        this.bigIntegerList = bigIntegerList;
    }

    public List<Date> getDateList() {
        return dateList;
    }

    public void setDateList(List<Date> dateList) {
        this.dateList = dateList;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<List<String>> getStringListList() {
        return stringListList;
    }

    public void setStringListList(List<List<String>> stringListList) {
        this.stringListList = stringListList;
    }

    public List<Set<String>> getStringSetList() {
        return stringSetList;
    }

    public void setStringSetList(List<Set<String>> stringSetList) {
        this.stringSetList = stringSetList;
    }

    public List<Map<Integer, String>> getMapList() {
        return mapList;
    }

    public void setMapList(List<Map<Integer, String>> mapList) {
        this.mapList = mapList;
    }

    public List<Byte[]> getByteBoxingArrayList() {
        return byteBoxingArrayList;
    }

    public void setByteBoxingArrayList(List<Byte[]> byteBoxingArrayList) {
        this.byteBoxingArrayList = byteBoxingArrayList;
    }

    public List<Boolean[]> getBooleanBoxingArrayList() {
        return booleanBoxingArrayList;
    }

    public void setBooleanBoxingArrayList(List<Boolean[]> booleanBoxingArrayList) {
        this.booleanBoxingArrayList = booleanBoxingArrayList;
    }

    public List<Character[]> getCharBoxingArrayList() {
        return charBoxingArrayList;
    }

    public void setCharBoxingArrayList(List<Character[]> charBoxingArrayList) {
        this.charBoxingArrayList = charBoxingArrayList;
    }

    public List<Short[]> getShortBoxingArrayList() {
        return shortBoxingArrayList;
    }

    public void setShortBoxingArrayList(List<Short[]> shortBoxingArrayList) {
        this.shortBoxingArrayList = shortBoxingArrayList;
    }

    public List<Integer[]> getIntegerBoxingArrayList() {
        return integerBoxingArrayList;
    }

    public void setIntegerBoxingArrayList(List<Integer[]> integerBoxingArrayList) {
        this.integerBoxingArrayList = integerBoxingArrayList;
    }

    public List<Long[]> getLongBoxingArrayList() {
        return longBoxingArrayList;
    }

    public void setLongBoxingArrayList(List<Long[]> longBoxingArrayList) {
        this.longBoxingArrayList = longBoxingArrayList;
    }

    public List<Float[]> getFloatBoxingArrayList() {
        return floatBoxingArrayList;
    }

    public void setFloatBoxingArrayList(List<Float[]> floatBoxingArrayList) {
        this.floatBoxingArrayList = floatBoxingArrayList;
    }

    public List<Double[]> getDoubleBoxingArrayList() {
        return doubleBoxingArrayList;
    }

    public void setDoubleBoxingArrayList(List<Double[]> doubleBoxingArrayList) {
        this.doubleBoxingArrayList = doubleBoxingArrayList;
    }

    public List<BigDecimal[]> getBigDecimalArrayList() {
        return bigDecimalArrayList;
    }

    public void setBigDecimalArrayList(List<BigDecimal[]> bigDecimalArrayList) {
        this.bigDecimalArrayList = bigDecimalArrayList;
    }

    public List<BigInteger[]> getBigIntegerArrayList() {
        return bigIntegerArrayList;
    }

    public void setBigIntegerArrayList(List<BigInteger[]> bigIntegerArrayList) {
        this.bigIntegerArrayList = bigIntegerArrayList;
    }

    public List<Date[]> getDateArrayList() {
        return dateArrayList;
    }

    public void setDateArrayList(List<Date[]> dateArrayList) {
        this.dateArrayList = dateArrayList;
    }

    public List<String[]> getStringArrayList() {
        return stringArrayList;
    }

    public void setStringArrayList(List<String[]> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    public List<Byte[][]> getByteBoxingDoubleArrayList() {
        return byteBoxingDoubleArrayList;
    }

    public void setByteBoxingDoubleArrayList(List<Byte[][]> byteBoxingDoubleArrayList) {
        this.byteBoxingDoubleArrayList = byteBoxingDoubleArrayList;
    }

    public List<Boolean[][]> getBooleanBoxingDoubleArrayList() {
        return booleanBoxingDoubleArrayList;
    }

    public void setBooleanBoxingDoubleArrayList(List<Boolean[][]> booleanBoxingDoubleArrayList) {
        this.booleanBoxingDoubleArrayList = booleanBoxingDoubleArrayList;
    }

    public List<Character[][]> getCharBoxingDoubleArrayList() {
        return charBoxingDoubleArrayList;
    }

    public void setCharBoxingDoubleArrayList(List<Character[][]> charBoxingDoubleArrayList) {
        this.charBoxingDoubleArrayList = charBoxingDoubleArrayList;
    }

    public List<Short[][]> getShortBoxingDoubleArrayList() {
        return shortBoxingDoubleArrayList;
    }

    public void setShortBoxingDoubleArrayList(List<Short[][]> shortBoxingDoubleArrayList) {
        this.shortBoxingDoubleArrayList = shortBoxingDoubleArrayList;
    }

    public List<Integer[][]> getIntegerBoxingDoubleArrayList() {
        return integerBoxingDoubleArrayList;
    }

    public void setIntegerBoxingDoubleArrayList(List<Integer[][]> integerBoxingDoubleArrayList) {
        this.integerBoxingDoubleArrayList = integerBoxingDoubleArrayList;
    }

    public List<Long[][]> getLongBoxingDoubleArrayList() {
        return longBoxingDoubleArrayList;
    }

    public void setLongBoxingDoubleArrayList(List<Long[][]> longBoxingDoubleArrayList) {
        this.longBoxingDoubleArrayList = longBoxingDoubleArrayList;
    }

    public List<Float[][]> getFloatBoxingDoubleArrayList() {
        return floatBoxingDoubleArrayList;
    }

    public void setFloatBoxingDoubleArrayList(List<Float[][]> floatBoxingDoubleArrayList) {
        this.floatBoxingDoubleArrayList = floatBoxingDoubleArrayList;
    }

    public List<Double[][]> getDoubleBoxingDoubleArrayList() {
        return doubleBoxingDoubleArrayList;
    }

    public void setDoubleBoxingDoubleArrayList(List<Double[][]> doubleBoxingDoubleArrayList) {
        this.doubleBoxingDoubleArrayList = doubleBoxingDoubleArrayList;
    }

    public List<BigDecimal[][]> getBigDecimalDoubleArrayList() {
        return bigDecimalDoubleArrayList;
    }

    public void setBigDecimalDoubleArrayList(List<BigDecimal[][]> bigDecimalDoubleArrayList) {
        this.bigDecimalDoubleArrayList = bigDecimalDoubleArrayList;
    }

    public List<BigInteger[][]> getBigIntegerDoubleArrayList() {
        return bigIntegerDoubleArrayList;
    }

    public void setBigIntegerDoubleArrayList(List<BigInteger[][]> bigIntegerDoubleArrayList) {
        this.bigIntegerDoubleArrayList = bigIntegerDoubleArrayList;
    }

    public List<Date[][]> getDateDoubleArrayList() {
        return dateDoubleArrayList;
    }

    public void setDateDoubleArrayList(List<Date[][]> dateDoubleArrayList) {
        this.dateDoubleArrayList = dateDoubleArrayList;
    }

    public List<String[][]> getStringDoubleArrayList() {
        return stringDoubleArrayList;
    }

    public void setStringDoubleArrayList(List<String[][]> stringDoubleArrayList) {
        this.stringDoubleArrayList = stringDoubleArrayList;
    }

    public Set<Byte> getByteBoxingSet() {
        return byteBoxingSet;
    }

    public void setByteBoxingSet(Set<Byte> byteBoxingSet) {
        this.byteBoxingSet = byteBoxingSet;
    }

    public Set<Boolean> getBooleanBoxingSet() {
        return booleanBoxingSet;
    }

    public void setBooleanBoxingSet(Set<Boolean> booleanBoxingSet) {
        this.booleanBoxingSet = booleanBoxingSet;
    }

    public Set<Character> getCharBoxingSet() {
        return charBoxingSet;
    }

    public void setCharBoxingSet(Set<Character> charBoxingSet) {
        this.charBoxingSet = charBoxingSet;
    }

    public Set<Short> getShortBoxingSet() {
        return shortBoxingSet;
    }

    public void setShortBoxingSet(Set<Short> shortBoxingSet) {
        this.shortBoxingSet = shortBoxingSet;
    }

    public Set<Integer> getIntegerBoxingSet() {
        return integerBoxingSet;
    }

    public void setIntegerBoxingSet(Set<Integer> integerBoxingSet) {
        this.integerBoxingSet = integerBoxingSet;
    }

    public Set<Long> getLongBoxingSet() {
        return longBoxingSet;
    }

    public void setLongBoxingSet(Set<Long> longBoxingSet) {
        this.longBoxingSet = longBoxingSet;
    }

    public Set<Float> getFloatBoxingSet() {
        return floatBoxingSet;
    }

    public void setFloatBoxingSet(Set<Float> floatBoxingSet) {
        this.floatBoxingSet = floatBoxingSet;
    }

    public Set<Double> getDoubleBoxingSet() {
        return doubleBoxingSet;
    }

    public void setDoubleBoxingSet(Set<Double> doubleBoxingSet) {
        this.doubleBoxingSet = doubleBoxingSet;
    }

    public Set<BigDecimal> getBigDecimalSet() {
        return bigDecimalSet;
    }

    public void setBigDecimalSet(Set<BigDecimal> bigDecimalSet) {
        this.bigDecimalSet = bigDecimalSet;
    }

    public Set<BigInteger> getBigIntegerSet() {
        return bigIntegerSet;
    }

    public void setBigIntegerSet(Set<BigInteger> bigIntegerSet) {
        this.bigIntegerSet = bigIntegerSet;
    }

    public Set<Date> getDateSet() {
        return dateSet;
    }

    public void setDateSet(Set<Date> dateSet) {
        this.dateSet = dateSet;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Set<List<String>> getStringListSet() {
        return stringListSet;
    }

    public void setStringListSet(Set<List<String>> stringListSet) {
        this.stringListSet = stringListSet;
    }

    public Set<Set<String>> getStringSetSet() {
        return stringSetSet;
    }

    public void setStringSetSet(Set<Set<String>> stringSetSet) {
        this.stringSetSet = stringSetSet;
    }

    public Set<Map<Integer, String>> getMapSet() {
        return mapSet;
    }

    public void setMapSet(Set<Map<Integer, String>> mapSet) {
        this.mapSet = mapSet;
    }

    public Set<Byte[]> getByteBoxingArraySet() {
        return byteBoxingArraySet;
    }

    public void setByteBoxingArraySet(Set<Byte[]> byteBoxingArraySet) {
        this.byteBoxingArraySet = byteBoxingArraySet;
    }

    public Set<Boolean[]> getBooleanBoxingArraySet() {
        return booleanBoxingArraySet;
    }

    public void setBooleanBoxingArraySet(Set<Boolean[]> booleanBoxingArraySet) {
        this.booleanBoxingArraySet = booleanBoxingArraySet;
    }

    public Set<Character[]> getCharBoxingArraySet() {
        return charBoxingArraySet;
    }

    public void setCharBoxingArraySet(Set<Character[]> charBoxingArraySet) {
        this.charBoxingArraySet = charBoxingArraySet;
    }

    public Set<Short[]> getShortBoxingArraySet() {
        return shortBoxingArraySet;
    }

    public void setShortBoxingArraySet(Set<Short[]> shortBoxingArraySet) {
        this.shortBoxingArraySet = shortBoxingArraySet;
    }

    public Set<Integer[]> getIntegerBoxingArraySet() {
        return integerBoxingArraySet;
    }

    public void setIntegerBoxingArraySet(Set<Integer[]> integerBoxingArraySet) {
        this.integerBoxingArraySet = integerBoxingArraySet;
    }

    public Set<Long[]> getLongBoxingArraySet() {
        return longBoxingArraySet;
    }

    public void setLongBoxingArraySet(Set<Long[]> longBoxingArraySet) {
        this.longBoxingArraySet = longBoxingArraySet;
    }

    public Set<Float[]> getFloatBoxingArraySet() {
        return floatBoxingArraySet;
    }

    public void setFloatBoxingArraySet(Set<Float[]> floatBoxingArraySet) {
        this.floatBoxingArraySet = floatBoxingArraySet;
    }

    public Set<Double[]> getDoubleBoxingArraySet() {
        return doubleBoxingArraySet;
    }

    public void setDoubleBoxingArraySet(Set<Double[]> doubleBoxingArraySet) {
        this.doubleBoxingArraySet = doubleBoxingArraySet;
    }

    public Set<BigDecimal[]> getBigDecimalArraySet() {
        return bigDecimalArraySet;
    }

    public void setBigDecimalArraySet(Set<BigDecimal[]> bigDecimalArraySet) {
        this.bigDecimalArraySet = bigDecimalArraySet;
    }

    public Set<BigInteger[]> getBigIntegerArraySet() {
        return bigIntegerArraySet;
    }

    public void setBigIntegerArraySet(Set<BigInteger[]> bigIntegerArraySet) {
        this.bigIntegerArraySet = bigIntegerArraySet;
    }

    public Set<Date[]> getDateArraySet() {
        return dateArraySet;
    }

    public void setDateArraySet(Set<Date[]> dateArraySet) {
        this.dateArraySet = dateArraySet;
    }

    public Set<String[]> getStringArraySet() {
        return stringArraySet;
    }

    public void setStringArraySet(Set<String[]> stringArraySet) {
        this.stringArraySet = stringArraySet;
    }

    public Set<Byte[][]> getByteBoxingDoubleArraySet() {
        return byteBoxingDoubleArraySet;
    }

    public void setByteBoxingDoubleArraySet(Set<Byte[][]> byteBoxingDoubleArraySet) {
        this.byteBoxingDoubleArraySet = byteBoxingDoubleArraySet;
    }

    public Set<Boolean[][]> getBooleanBoxingDoubleArraySet() {
        return booleanBoxingDoubleArraySet;
    }

    public void setBooleanBoxingDoubleArraySet(Set<Boolean[][]> booleanBoxingDoubleArraySet) {
        this.booleanBoxingDoubleArraySet = booleanBoxingDoubleArraySet;
    }

    public Set<Character[][]> getCharBoxingDoubleArraySet() {
        return charBoxingDoubleArraySet;
    }

    public void setCharBoxingDoubleArraySet(Set<Character[][]> charBoxingDoubleArraySet) {
        this.charBoxingDoubleArraySet = charBoxingDoubleArraySet;
    }

    public Set<Short[][]> getShortBoxingDoubleArraySet() {
        return shortBoxingDoubleArraySet;
    }

    public void setShortBoxingDoubleArraySet(Set<Short[][]> shortBoxingDoubleArraySet) {
        this.shortBoxingDoubleArraySet = shortBoxingDoubleArraySet;
    }

    public Set<Integer[][]> getIntegerBoxingDoubleArraySet() {
        return integerBoxingDoubleArraySet;
    }

    public void setIntegerBoxingDoubleArraySet(Set<Integer[][]> integerBoxingDoubleArraySet) {
        this.integerBoxingDoubleArraySet = integerBoxingDoubleArraySet;
    }

    public Set<Long[][]> getLongBoxingDoubleArraySet() {
        return longBoxingDoubleArraySet;
    }

    public void setLongBoxingDoubleArraySet(Set<Long[][]> longBoxingDoubleArraySet) {
        this.longBoxingDoubleArraySet = longBoxingDoubleArraySet;
    }

    public Set<Float[][]> getFloatBoxingDoubleArraySet() {
        return floatBoxingDoubleArraySet;
    }

    public void setFloatBoxingDoubleArraySet(Set<Float[][]> floatBoxingDoubleArraySet) {
        this.floatBoxingDoubleArraySet = floatBoxingDoubleArraySet;
    }

    public Set<Double[][]> getDoubleBoxingDoubleArraySet() {
        return doubleBoxingDoubleArraySet;
    }

    public void setDoubleBoxingDoubleArraySet(Set<Double[][]> doubleBoxingDoubleArraySet) {
        this.doubleBoxingDoubleArraySet = doubleBoxingDoubleArraySet;
    }

    public Set<BigDecimal[][]> getBigDecimalDoubleArraySet() {
        return bigDecimalDoubleArraySet;
    }

    public void setBigDecimalDoubleArraySet(Set<BigDecimal[][]> bigDecimalDoubleArraySet) {
        this.bigDecimalDoubleArraySet = bigDecimalDoubleArraySet;
    }

    public Set<BigInteger[][]> getBigIntegerDoubleArraySet() {
        return bigIntegerDoubleArraySet;
    }

    public void setBigIntegerDoubleArraySet(Set<BigInteger[][]> bigIntegerDoubleArraySet) {
        this.bigIntegerDoubleArraySet = bigIntegerDoubleArraySet;
    }

    public Set<Date[][]> getDateDoubleArraySet() {
        return dateDoubleArraySet;
    }

    public void setDateDoubleArraySet(Set<Date[][]> dateDoubleArraySet) {
        this.dateDoubleArraySet = dateDoubleArraySet;
    }

    public Set<String[][]> getStringDoubleArraySet() {
        return stringDoubleArraySet;
    }

    public void setStringDoubleArraySet(Set<String[][]> stringDoubleArraySet) {
        this.stringDoubleArraySet = stringDoubleArraySet;
    }

    public Map<String, Integer> getBasicMap() {
        return basicMap;
    }

    public void setBasicMap(Map<String, Integer> basicMap) {
        this.basicMap = basicMap;
    }

    public Map<String[], Integer> getKeyArrayMap() {
        return keyArrayMap;
    }

    public void setKeyArrayMap(Map<String[], Integer> keyArrayMap) {
        this.keyArrayMap = keyArrayMap;
    }

    public Map<String, Integer[]> getValueArrayMap() {
        return valueArrayMap;
    }

    public void setValueArrayMap(Map<String, Integer[]> valueArrayMap) {
        this.valueArrayMap = valueArrayMap;
    }

    public Map<String[], Integer[]> getKeyValueArrayMap() {
        return keyValueArrayMap;
    }

    public void setKeyValueArrayMap(Map<String[], Integer[]> keyValueArrayMap) {
        this.keyValueArrayMap = keyValueArrayMap;
    }

    public Map<String[][], Integer[][]> getKeyValueDoubleArrayMap() {
        return keyValueDoubleArrayMap;
    }

    public void setKeyValueDoubleArrayMap(Map<String[][], Integer[][]> keyValueDoubleArrayMap) {
        this.keyValueDoubleArrayMap = keyValueDoubleArrayMap;
    }

    public Map<List<String>, Map<String, Integer>> getKeyListValueMapMap() {
        return keyListValueMapMap;
    }

    public void setKeyListValueMapMap(Map<List<String>, Map<String, Integer>> keyListValueMapMap) {
        this.keyListValueMapMap = keyListValueMapMap;
    }

    public Map<List<String>[], Map<String, Integer>[]> getKeyArrayListValueArrayMapMap() {
        return keyArrayListValueArrayMapMap;
    }

    public void setKeyArrayListValueArrayMapMap(Map<List<String>[], Map<String, Integer>[]> keyArrayListValueArrayMapMap) {
        this.keyArrayListValueArrayMapMap = keyArrayListValueArrayMapMap;
    }
}
