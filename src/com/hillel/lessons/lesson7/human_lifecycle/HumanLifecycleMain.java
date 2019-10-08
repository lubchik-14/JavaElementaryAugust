package com.hillel.lessons.lesson7.human_lifecycle;

public class HumanLifecycleMain {
    /**
     * The main entry point.
     */
    public static void main(String[] args) {
        HumanLifecycle lifecycle = new HumanLifecycle(createObserver());
        //begin the life
        lifecycle.startLife();

        System.out.println("What a wonderful life! ");
    }

    /**
     * The implementation of IHumanLifecycleObserver.
     *
     * @return an instance of IHumanLifecycleObserver.
     */
    private static IHumanLifecycleObserver createObserver() {
        return new IHumanLifecycleObserver() {
            @Override
            public void onHumanWasBorn(HumanBornParam param) {
                System.out.println(String.format("The child %s was born on %s with weight %.3f and gender %s",
                        param.name, param.birthday, param.weight, param.gender));
            }

            @Override
            public void onHumanWasSentToKindergarten(HumanKindergartenParam param) {
                System.out.println(String.format("The child was sent to a kindergarten \"%s\" %s",
                        param.kindergartenName.toUpperCase(), param.date));
            }

            @Override
            public void onHumanFallInLove(HumanFallInLoveParam param) {
                System.out.println(String.format("The teenager fell in love with %s and it was%s mutually",
                        param.person.getName(), param.isMutual ? "" : "n't"));
            }

            @Override
            public void onHumanKiss(HumanKissParam param) {
                System.out.println(String.format("The first kiss was %s with %s and it was%s awful",
                        param.date, param.person.getName(), param.isGoodKiss ? "n't" : ""));
            }

            @Override
            public void onHumanWasSentSchool(HumanSchoolParam param) {
                System.out.println(String.format("The child was sent to a school \"%s\" %s",
                        param.name.toUpperCase(), param.date));
            }

            @Override
            public void onHumanDate(HumanDateParam param) {
                System.out.println(String.format("%s the teenager starts dating with %s",
                        param.date, param.dateOfHuman.getName()));
            }

            @Override
            public void onHumanWentUniversity(HumanUniversityParam param) {
                System.out.println(String.format("%s the teenager starts studying at \"%s\" university. " +
                                "The major is %s with%s scholarship" ,
                        param.date, param.name.toUpperCase(), param.major, param.isScholarship ? " the" : "out any"));
            }

            @Override
            public void onHumanMarriage(HumanMarryParam param) {
                System.out.println(String.format("%s the human marries with %s", param.date, param.spouse.getName()));
            }

            @Override
            public void onHumanBecomeParent(HumanBecomeParentParam param) {
                System.out.println(String.format("%s the human becomes a parent. The baby %s is %s.",
                        param.date, param.child.getName(), param.child.getGender().toLowerCase()));
            }

            @Override
            public void onHumanDivorce(HumanDivorceParam param) {
                System.out.println(String.format("%s the human divorces with %s and the reason is %s",
                        param.date, param.exspouse.getName(), param.cause));
            }

            @Override
            public void onHumanBecomeGrandParent(HumanBecomeParentParam param) {
                System.out.println(String.format("%s the human becomes a grandparent. %s is %s.",
                        param.date, param.child.getName(), param.child.getGender().toLowerCase()));
            }

            @Override
            public void onHumanDie(HumanDieParam param) {
                System.out.println(String.format("Unfortunately, %s it is the cause of human death %s",
                        param.cause, param.date));
            }
        };
    }
}
