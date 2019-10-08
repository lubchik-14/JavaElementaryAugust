package com.hillel.lessons.lesson7.human_lifecycle;

import com.hillel.lessons.lesson7.human_lifecycle.person.Person;

import java.time.LocalDate;

/**
 * The interface defines on observer over {@link HumanLifecycle}.
 */
public interface IHumanLifecycleObserver {
    /**
     * Handles the first event in a human life.
     *
     * @param param The stage parameters.
     */
    void onHumanWasBorn(HumanBornParam param);
    /**
     * Handles the sending a human to a kindergarten.
     *
     * @param param The stage parameters.
     */
    void onHumanWasSentToKindergarten(HumanKindergartenParam param);
    /**
     * Handles the first falling in love of a human.
     *
     * @param param The stage parameters.
     */
    void onHumanFallInLove(HumanFallInLoveParam param);
    /**
     * Handles the first kiss event in a human life.
     *
     * @param param The stage parameters.
     */
    void onHumanKiss(HumanKissParam param);
    /**
     * Handles the sending a human to a school.
     *
     * @param param The stage parameters.
     */
    void onHumanWasSentSchool(HumanSchoolParam param);
    /**
     * Handles the dating of a human.
     *
     * @param param The stage parameters.
     */
    void onHumanDate(HumanDateParam param);
    /**
     * Handles going of a human to a university.
     *
     * @param param The stage parameters.
     */
    void onHumanWentUniversity(HumanUniversityParam param);
    /**
     * Handles marriage of a human.
     *
     * @param param The stage parameters.
     */
    void onHumanMarriage(HumanMarryParam param);
    /**
     * Handles becoming a parent of a human.
     *
     * @param param The stage parameters.
     */
    void onHumanBecomeParent(HumanBecomeParentParam param);
    /**
     * Handles the divorce of a human.
     *
     * @param param The stage parameters.
     */
    void onHumanDivorce(HumanDivorceParam param);
    /**
     * Handles becoming a grandparent of a human.
     *
     * @param param The stage parameters.
     */
    void onHumanBecomeGrandParent(HumanBecomeParentParam param);
    /**
     * Handles the last event in a human life.
     *
     * @param param The stage parameters.
     */
    void onHumanDie(HumanDieParam param);

    /**
     * Attributes of the born stage of a human.
     */
    class HumanBornParam {
        /**
         * The date when the human was born.
         */
        public final LocalDate birthday;

        /**
         * The weight of the child in kilograms.
         */
        public final float weight;

        /**
         * The tolerant gender of the child.
         */
        public final String gender;

        /**
         * The name of the child.
         */
        public final String name;

        /**
         * The constructor of a birth of a human
         *
         * @param birthday
         * @param weight
         * @param gender
         * @param name
         */
        public HumanBornParam(LocalDate birthday, float weight, String gender, String name) {
            this.birthday = birthday;
            this.weight = weight;
            this.gender = gender;
            this.name = name;
        }
    }

    /**
     * Attributes of a kindergarten stage of a human.
     */
    class HumanKindergartenParam {
        /**
         * The name of the kindergarten.
         */
        public final String kindergartenName;

        /**
         * The date of the first time the child has went to the kindergarten.
         */
        public final LocalDate date;

        /**
         * The constructor of a going to a kindergarten of a human
         *
         * @param kindergartenName The name of the kindergarten.
         * @param date The date of the first time the child has went to the kindergarten.
         */
        public HumanKindergartenParam(String kindergartenName, LocalDate date) {
            this.kindergartenName = kindergartenName;
            this.date = date;
        }
    }

    /**
     * Attributes of falling in love stage of a human.
     */
    class HumanFallInLoveParam {
        /**
         * The person who the child falls in love with.
         */
        public final Person person;

        /**
         * If this love is mutual.
         */
        public final boolean isMutual;

        /**
         * The constructor of a falling in love of a human
         *
         * @param person The person who the child falls in love with.
         * @param isMutual If this love is mutual.
         */
        public HumanFallInLoveParam(Person person, boolean isMutual) {
            this.person = person;
            this.isMutual = isMutual;
        }
    }

    /**
     * Attributes of the first kiss stage of a human.
     */
    class HumanKissParam {
        /**
         * The date of the first kiss of the human.
         */
        public final LocalDate date;

        /**
         * The person who the child kisses.
         */
        public final Person person;

        /**
         * If the kiss is good for the human or not.
         */
        public final boolean isGoodKiss;

        /**
         * The constructor of the first kiss of a human
         *
         * @param date The date of the first kiss of the human.
         * @param person The person who the child kisses.
         * @param isGoodKiss If the kiss is good for the human or not.
         */
        public HumanKissParam(LocalDate date, Person person, boolean isGoodKiss) {
            this.date = date;
            this.person = person;
            this.isGoodKiss = isGoodKiss;
        }
    }

    /**
     * Attributes of going to a school stage of a human.
     */
    class HumanSchoolParam {
        /**
         * The date of the first time the child has went to the school.
         */
        public final LocalDate date;

        /**
         * The name of the school.
         */
        public final String name;

        /**
         * The constructor of a going to a school of a human
         *
         * @param date The date of the first time the child has went to the school.
         * @param name The name of the school.
         */
        public HumanSchoolParam(LocalDate date, String name) {
            this.date = date;
            this.name = name;
        }
    }

    /**
     * Attributes of dating stage of a human.
     */
    class HumanDateParam {
        /**
         * The date of the human starts dating.
         */
        public final LocalDate date;

        /**
         * The date of the human.
         */
        public final Person dateOfHuman;

        /**
         * The constructor of a dating of a human
         *
         * @param date The date of the human starts dating.
         * @param dateOfHuman The date of the human.
         */
        public HumanDateParam(LocalDate date, Person dateOfHuman) {
            this.date = date;
            this.dateOfHuman = dateOfHuman;
        }
    }

    /**
     * Attributes of going to a university stage of a human.
     */
    class HumanUniversityParam {
        /**
         * The date of the first time the child has gone to the university.
         */
        public final LocalDate date;

        /**
         * The name of the university.
         */
        public final String name;

        /**
         * The major of the human at the university.
         */
        public final String major;

        /**
         * If the human has a scholarship.
         */
        public final boolean isScholarship;

        /**
         * The constructor of a going to a university of a human
         *
         * @param date The date of the first time the child has gone to the university.
         * @param name The name of the university.
         * @param major The major of the human at the university.
         * @param isScholarship If the human has a scholarship.
         */
        public HumanUniversityParam(LocalDate date, String name, String major, boolean isScholarship) {
            this.date = date;
            this.name = name;
            this.major = major;
            this.isScholarship = isScholarship;
        }
    }

    /**
     * Attributes of a marriage stage of a human.
     */
    class HumanMarryParam {
        /**
         * The date of the human's marriage.
         */
        public final LocalDate date;

        /**
         * The spouse of the human.
         */
        public final Person spouse;

        /**
         * The constructor of a marriage of a human
         *
         * @param date The date of the human's marriage.
         * @param spouse The spouse of the human.
         */
        public HumanMarryParam(LocalDate date, Person spouse) {
            this.date = date;
            this.spouse = spouse;
        }
    }

    /**
     * Attributes of becoming a parent stage of a human.
     */
    class HumanBecomeParentParam {
        /**
         * The date of the human's becoming a parent.
         */
        public final LocalDate date;

        /**
         * The child of human.
         */
        public final Person child;

        /**
         * The constructor of a becoming a parent of a human
         *
         * @param date The date of the human's becoming a parent.
         * @param child The child of human.
         */
        public HumanBecomeParentParam(LocalDate date, Person child) {
            this.date = date;
            this.child = child;
        }
    }

    /**
     * Attributes of a divorce stage of a human.
     */
    class HumanDivorceParam {
        /**
         * The date of the human's divorce.
         */
        public final LocalDate date;

        /**
         * The person who the human divorce with.
         */
        public final Person exspouse;
        /**
         * The cause of the human's divorce.
         */
        public final String cause;

        /**
         * The constructor of a divorce of a human
         *
         * @param date The date of the human's divorce.
         * @param exspouse The person who the human divorce with.
         * @param cause The cause of the human's divorce.
         */
        public HumanDivorceParam(LocalDate date, Person exspouse, String cause) {
            this.date = date;
            this.exspouse = exspouse;
            this.cause = cause;
        }
    }

    /**
     * Attributes of the death stage of a human.
     */
    class HumanDieParam {
        /**
         * The date of the human's death.
         */
        public final LocalDate date;

        /**
         * The cause of the human's death.
         */
        public final String cause;

        /**
         * The constructor of a death stage of a human.
         *
         * @param date The date of the human's death.
         * @param cause The cause of the human's death.
         */
        public HumanDieParam(LocalDate date, String cause) {
            this.date = date;
            this.cause = cause;
        }
    }
}
