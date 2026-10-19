package junit;

import org.junit.jupiter.api.Test;

public class StringUtilTest {
    // 测试方法：必须是公开public，无参，无返回值。
    // 测试方法必须加上@Test注解（Junit框架的核心步骤）
    @org.junit.jupiter.api.Test
    public void testPrintNumber() {
        // 测试步骤:
        StringUtil.printNumber( "张三abc"); // 5
        // 测试用例
        StringUtil.printNumber( "");
        StringUtil.printNumber( null);
    }

    @Test
    public void testGetMaxIndex() {
        // 测试步骤:
        int index = StringUtil.getMaxIndex( "abcdefg"); // 5
        // 测试用例
        int index2 = StringUtil.getMaxIndex( "");
        int index3 = StringUtil.getMaxIndex( null);
    }
}
