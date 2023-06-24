public class Main {
    public static void main(String[] args) {
        GuessStatisticsMessage messageCero = new GuessStatisticsMessage();
        char candidateCero = 'X';
        int countCero = 0;
        String resultCero = messageCero.make(candidateCero, countCero);

        System.out.println(resultCero);

        GuessStatisticsMessage messageOne = new GuessStatisticsMessage();
        char candidateOne = 'X';
        int countOne = 1;
        String resultOne = messageOne.make(candidateOne, countOne);

        System.out.println(resultOne);

        GuessStatisticsMessage messageMany = new GuessStatisticsMessage();
        char candidateMany = 'X';
        int countMany = 88;
        String resultMany = messageMany.make(candidateMany, countMany);

        System.out.println(resultMany);
    }
}