package com.mock.mocker;

import com.mock.MockConfig;
import com.mock.Mocker;
import com.mock.util.RandomUtils;
import com.mock.util.StringUtil;

import java.util.UUID;

/**
 * 模拟String对象
 */
public class StringMocker implements Mocker<String> {
    //汉语 种子内容
    private static final String STR = StringUtil.readerText("target/classes/String.text");

    @Override
    public String mock(MockConfig mockConfig) {

        if (mockConfig.getStringEnum() == MockConfig.StringEnum.CHARACTER) {
            return mockerCharacter(mockConfig);
        }
        if (mockConfig.getStringEnum() == MockConfig.StringEnum.UUID) {
            return UUID.randomUUID().toString();
        }
        return mockChinese(mockConfig);
    }

    /**
     * 随机截取一段中文返回
     *
     * @param mockConfig
     * @return
     */
    private String mockChinese(MockConfig mockConfig) {
        int size = RandomUtils.nextSize(mockConfig.getSizeRange()[0], mockConfig.getSizeRange()[1]);
        int index = RandomUtils.nextInt(0, STR.length() - 1 - size);
        return STR.substring(index, index + size);
    }

    /**
     * 生成随机多个字符
     *
     * @param mockConfig
     * @return
     */
    private String mockerCharacter(MockConfig mockConfig) {
        int size = RandomUtils.nextSize(mockConfig.getSizeRange()[0], mockConfig.getSizeRange()[1]);
        String[] stringSeed = mockConfig.getStringSeed();
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(stringSeed[RandomUtils.nextInt(0, stringSeed.length)]);
        }
        return sb.toString();
    }


}
