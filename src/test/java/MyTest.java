import org.junit.jupiter.api.Assertions;

public class MyTest {
    @org.junit.jupiter.api.Test
    public void testValidArguments() {
        //совпадение результата с ожидаемым - true
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
    @org.junit.jupiter.api.Test
    public void testNealidArguments() {
        //не должен обрабатывать массивы с меньшим кол-вом элементов
        //Maven
        // given:
        final int[][] teamsOriginal = {
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {400, 30, 10, 9, 8, 7, 6, 5, 2}
        };
        // when:
        try {
            final int[] teamResult = Main.mergeAll(teamsOriginal);
//            Assertions.assertTrue(false);
        }catch (NullPointerException e){
            Assertions.assertTrue(e.getClass().equals("NullPointerException"));
        }
    }
    @org.junit.jupiter.api.Test
    public void testLength() {
        //Длина выведенного массива - 10
        final int[][] teamsOriginal = {
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
        };
        final int lentghDim = 10;


        // when:
        final int[] teamResult = Main.mergeAll(teamsOriginal);

        // then:
        Assertions.assertTrue(teamResult.length==lentghDim);

    }

}
