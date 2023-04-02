public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"agnostic", "opinionated",
                "voice activated", "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled",
                "strongly typed"};
        String[] wordListTwo = {"loosely coupled", "six sigma",
                "asynchronous", "event driven", "pub-sub", "IoT",
                "cloud native", "service oriented", "containerized", "serverless",
                "microservices", "distributed ledger"};
        String[] wordListThree = {"framework", "library",
                "DSL", "REST API", "repository", "pipeline", "service mesh", " architecture", " perspective", " design",
                "orientation"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);

        String[] listOne = {"Annija", "Inese", "Robis", "Rudis"};
        String[] listTwo = {"strada", "dzied", "spele", "dejo"};
        String[] listThree = {"dziesmas", "darbu", "futbolgolfu", "dejas"};
        int firstLenght = listOne.length;
        int secondLenght = listTwo.length;
        int thirdLenght = listThree.length;
        int random1= randomGenerator.nextInt(firstLenght);
        int random2= randomGenerator.nextInt(secondLenght);
        int random3= randomGenerator.nextInt(thirdLenght);

        String sentence= listOne[random1] + " " + listTwo[random2] + " " + listThree[random3];
        System.out.println("Here is sentence: " + sentence);
    }
}
