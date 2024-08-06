import java.util.*;

class VURunners {
    static class Runner {
        String name;
        int time;

        Runner(String name, int time) {
            this.name = name;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.add(new Runner("John", 250));
        runners.add(new Runner("Paul", 300));
        runners.add(new Runner("George", 275));
        runners.add(new Runner("Ringo", 325));

        runners.sort(Comparator.comparingInt(runner -> runner.time));

        Runner fastest = runners.get(0);
        Runner secondFastest = runners.get(1);

        System.out.println("Fastest runner: " + fastest.name + " with time " + fastest.time + " minutes");
        System.out.println("Second fastest runner: " + secondFastest.name + " with time " + secondFastest.time + " minutes");
    }
}
