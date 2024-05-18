import org.junit.jupiter.api.Assertions;

public class MyTest {
    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        //Maven
        // given:
        final int[][] teamsOriginal = {
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
        };
        final int[] teamsExpected = {51, 45, 31, 31, 30, 24, 22, 20, 18, 17};


        // when:
        final int[] teamResult = Main.mergeAll(teamsOriginal);

        // then:
        Assertions.assertArrayEquals(teamsExpected, teamResult);
    }
}
