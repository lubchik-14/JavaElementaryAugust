package com.hillel.lessons.lesson7.human_lifecycle;

import com.hillel.lessons.lesson7.human_lifecycle.factory.Factory;
import com.hillel.lessons.lesson7.human_lifecycle.person.Person;

import java.time.LocalDate;

/**
 * The class emulates lifecycle of a human with important stage of his life.
 */
public class HumanLifecycle {
    /**
     * The observer to notify about the lifecycle.
     */
    private final IHumanLifecycleObserver observer;

    /**
     * The main character of this program.
     */
    private final Person mainCharacter;

    /**
     * Creates an instance of the class.
     *
     * @param observer The observer to notify about the lifecycle.
     */
    public HumanLifecycle(IHumanLifecycleObserver observer) {
        this.observer = observer;
        this.mainCharacter = Person.of();
    }

    /**
     * Starts the emulation of a human lifecycle.
     * It does not return until the human dies.
     */
    public void startLife() {
        // the 'born' stage
        observer.onHumanWasBorn(new IHumanLifecycleObserver.HumanBornParam(
                mainCharacter.getBirthday(), Factory.randomInt(2000, 7000) / 1000f,
                mainCharacter.getGender(), mainCharacter.getName()));

        //defining the date to go to a kindergarten 3 years after birthday plus randomly chosen days inside of 2 years
        LocalDate kindergartenDate = mainCharacter.getBirthday().plusYears(3).plusDays(Factory.randomInt(0, 365 * 2));

        //the human goes to a kindergarten
        goToKindergarten(kindergartenDate, Factory.getSomeWords(3));

        //defining the date to go to a school after randomly chosen years within 6-8 years
        LocalDate schoolDate = mainCharacter.getBirthday().getMonth().getValue() <= 9 ?
                LocalDate.of(mainCharacter.getBirthday().getYear() + Factory.randomInt(6, 8), 9, 1) :
                LocalDate.of(mainCharacter.getBirthday().getYear() + Factory.randomInt(7, 8), 9, 1);

        //defining the date to the first kiss
        LocalDate kissDate = kindergartenDate.plusDays(Factory.randomInt(0, Factory.getDaysBetween(kindergartenDate, schoolDate)));

        //the first kiss of the human
        boolean firstKiss = Factory.randomBoolean();


        if (firstKiss) {
            kiss(kissDate, Person.of(), Factory.randomBoolean());
        }

        //the human goes to a school
        goToSchool(schoolDate, Factory.getSomeWords(3));

        //defining the date to go to a university
        LocalDate universityDate = LocalDate.of(schoolDate.getYear() + Factory.randomInt(9, 15), 8, 1);

        Person person = Person.of();
        if (Factory.randomBoolean()) {
            fallInLove(person, Factory.randomBoolean());
        }

        //defining the date to first kiss if the first kiss didn't occur
        kissDate = schoolDate.plusDays(Factory.randomInt(0, Factory.getDaysBetween(schoolDate, universityDate)));

        //the first kiss of the human
        if (!firstKiss) {
            kiss(kissDate, person, Factory.randomBoolean());
        }

        //the human starts dating
        if (Factory.randomBoolean()) {
            date(kissDate, person);
        }

        //the human starts studying at the university
        goToUniversity(universityDate, Factory.getSomeWords(3), Factory.getSomeWords(3), Factory.randomBoolean());

        //defining the date to marry
        LocalDate marriageDate;
        if (Factory.randomBoolean()) {
            marriageDate = universityDate.plusDays(Factory.randomInt(100, 365 * 5));
        } else if (Factory.randomBoolean()) {
            marriageDate = universityDate.plusYears(5).plusDays(Factory.randomInt(0, 20 * 365));
        } else {
            marriageDate = universityDate.plusYears(20).plusDays(Factory.randomInt(0, 5 * 365));
        }

        //the 'marriage' stage
        marry(marriageDate, Person.of());

        //defining the date to become a parent
        LocalDate parentDate;

        if (Factory.randomBoolean()) {
            parentDate = marriageDate.plusDays(Factory.randomInt(100, 365 * 5));
        } else if (Factory.randomBoolean()) {
            parentDate = marriageDate.plusYears(5).plusDays(Factory.randomInt(0, 365 * 5));
        } else {
            parentDate = marriageDate.plusYears(10).plusDays(Factory.randomInt(0, 365 * 5));
        }

        //the 'becoming a parent' stage
        becomeParent(parentDate, Person.of(parentDate));

        //defining  the date to divorce
        LocalDate divorceDate = parentDate.plusDays(Factory.randomInt(100, 30 * 6));
        if (Factory.randomBoolean() && Factory.randomBoolean()) {

            //the 'divorce' stage
            divorce(divorceDate, mainCharacter.getSpouse(), Factory.getSomeWords(5));
        }

        //the 'becoming a parent' stage
        parentDate = parentDate.plusYears(1).plusDays(Factory.randomInt(60, 365));

        if (mainCharacter.getSpouse() != null) {
            if (Factory.randomBoolean()) {
                becomeParent(parentDate, Person.of(parentDate));
            }
        } else if (Factory.randomBoolean() && Factory.randomBoolean()) {
            becomeParent(parentDate, Person.of(parentDate));
        }

        //the 'marriage' stage
        if (Factory.randomBoolean() && Factory.randomBoolean()) {
            marriageDate = divorceDate.plusDays(Factory.randomInt(30, 365));
                    marry(marriageDate, Person.of());
                    if (Factory.randomBoolean()) {
                        parentDate = marriageDate.plusDays(Factory.randomInt(100, 365));
                        becomeParent(parentDate, Person.of(parentDate));
                    }
        }

        //the 'becoming grandparent' stage
        for (Person child : mainCharacter.getChildren()) {
            parentDate = child.getBirthday().plusYears(Factory.randomInt(15, 30)).plusDays(Factory.randomInt(0, 100));
            becomeGrandParent(parentDate, Person.of(parentDate));
        }

        //the 'death' stage
        LocalDate deathDate = parentDate.plusYears(Factory.randomInt(10, 20)).plusDays(Factory.randomInt(30, 300));
        die(deathDate, Factory.getSomeWords(3));
    }

    /**
     * Handles the 'kindergarten' stage
     *
     * @param date The date when a human is sent to a kindergarten.
     * @param name The name of the kindergarten.
     */
    private void goToKindergarten(LocalDate date, String name) {
        observer.onHumanWasSentToKindergarten(new IHumanLifecycleObserver.HumanKindergartenParam(
                name, date));
    }

    /**
     * Handles the first love
     *
     * @param person The person who a human falls in love with.
     * @param isMutual If the love is mutual.
     */
    private void fallInLove(Person person, boolean isMutual) {
        observer.onHumanFallInLove(new IHumanLifecycleObserver.HumanFallInLoveParam(person, isMutual));
    }

    /**
     * Handles the first kiss
     *
     * @param date The date when occurs the first kiss of a human.
     * @param person The person who the person kisses with.
     * @param isGoodKiss Defines if the kiss is good or not.
     */
    private void kiss(LocalDate date, Person person, boolean isGoodKiss) {
        observer.onHumanKiss(new IHumanLifecycleObserver.HumanKissParam(date, person, isGoodKiss));
    }

    /**
     * Handles the 'school' stage
     *
     * @param date The date when a human goes to a school.
     * @param name The school name.
     */
    private void goToSchool(LocalDate date, String name) {
        observer.onHumanWasSentSchool(new IHumanLifecycleObserver.HumanSchoolParam(date, name));
    }

    /**
     * Handles the 'dating' stage
     *
     * @param date The date of dating of a human
     * @param dateOfHuman The person who the human dates with.
     */
    private void date(LocalDate date, Person dateOfHuman) {
        observer.onHumanDate(new IHumanLifecycleObserver.HumanDateParam(date, dateOfHuman));
    }

    /**
     * Handles the 'university' stage
     *
     * @param date The date of the start studying of a human in a university.
     * @param name The name of the university.
     * @param major The major of the human at the university.
     * @param isScholarship If the human has a scholarship studying at the university.
     */
    private void goToUniversity(LocalDate date, String name, String major, boolean isScholarship) {
        observer.onHumanWentUniversity(new IHumanLifecycleObserver.HumanUniversityParam(date, name, major, isScholarship));
    }

    /**
     * Handles the 'becoming parent' stage
     *
     * @param date The date of becoming a human a parent
     * @param child The new baby of a human
     */
    private void becomeParent(LocalDate date, Person child) {
        observer.onHumanBecomeParent(new IHumanLifecycleObserver.HumanBecomeParentParam(date, child));
        mainCharacter.addChildren(child);
    }

    /**
     * Handles the 'marriage' stage
     *
     * @param date The date of a marriage of a human
     * @param spouse The new spouse of a human
     */
    private void marry(LocalDate date, Person spouse) {
        observer.onHumanMarriage(new IHumanLifecycleObserver.HumanMarryParam(date, spouse));
        if (mainCharacter.getSpouse() == null) {
            mainCharacter.setSpouse(spouse);
        }
    }

    /**
     * Handles the 'divorce' stage
     *
     * @param date The date of a divorce of a human
     * @param exspouse The ex-spouse of a human
     * @param cause The cause of the divorce of a human
     */
    private void divorce(LocalDate date, Person exspouse, String cause) {
        observer.onHumanDivorce(new IHumanLifecycleObserver.HumanDivorceParam(date, exspouse, cause));
        if (mainCharacter.getSpouse() != null) {
            mainCharacter.setSpouse(null);
        }
    }

    /**
     * Handles the 'becoming a grandparent' stage
     *
     * @param date The date of becoming a grandparent
     * @param grandChild The grandchild of a human
     */
    private void becomeGrandParent(LocalDate date, Person grandChild) {
        observer.onHumanBecomeGrandParent(new IHumanLifecycleObserver.HumanBecomeParentParam(date, grandChild));
        mainCharacter.addGrandChild(grandChild);
    }

    /**
     * Handles the death of a human stage
     * @param date The date of the death of a human
     * @param cause The cause of the death of a human
     */
    private void die(LocalDate date, String cause) {
        observer.onHumanDie(new IHumanLifecycleObserver.HumanDieParam(date, cause));
    }
}
