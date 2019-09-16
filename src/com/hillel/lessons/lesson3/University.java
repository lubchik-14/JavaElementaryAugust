package com.hillel.lessons.lesson3;

import com.hillel.lessons.lesson3.building_structure.auditory.Auditorium;
import com.hillel.lessons.lesson3.processing.Factory;
import com.hillel.lessons.lesson3.processing.ScheduleManager;
import com.hillel.lessons.lesson3.schedule.lessonorder.LessonOrder;
import com.hillel.lessons.lesson3.schedule.schedule.Schedule;
import com.hillel.lessons.lesson3.unuversity_structure.subject.Subject;
import com.hillel.lessons.lesson3.unuversity_structure.group.Group;
import com.hillel.lessons.lesson3.unuversity_structure.specialization.Specialization;
import com.hillel.lessons.lesson3.unuversity_structure.cathedra.Cathedra;
import com.hillel.lessons.lesson3.unuversity_structure.faculty.Faculty;
import java.time.DayOfWeek;
import java.util.Arrays;

public class University {
    public static void main(String[] args) {
        Factory factory = new Factory();

        //Creating auditoriums
        Auditorium[] firstFloor = new Auditorium[]{
                new Auditorium(100), new Auditorium(101), new Auditorium(102),
                new Auditorium(103), new Auditorium(104), new Auditorium(105),
                new Auditorium(106), new Auditorium(107), new Auditorium(108)
        };
        Auditorium[] secondFloor = new Auditorium[]{
                new Auditorium(200), new Auditorium(201), new Auditorium(202),
                new Auditorium(203), new Auditorium(204), new Auditorium(205),
                new Auditorium(206), new Auditorium(207), new Auditorium(208)
        };

        //Creating subjects
        Subject[] accountingSubjects = factory.createSubjects(15);
        Subject[] marketingSubjects = factory.createSubjects(15);
        Subject[] businessSubjects = factory.createSubjects(15);
        Subject[] financeSubjects = factory.createSubjects(15);
        Subject[] economySubjects = factory.createSubjects(15);

        //Creating specializations
        Specialization accountingAndTaxationConsultingS = new Specialization("Accounting And Taxation Consulting", accountingSubjects);
        Specialization taxesAndTaxationS = new Specialization("Taxes And Taxation", accountingSubjects);
        Specialization accountingAndTaxationS = new Specialization("Accounting And Taxation", accountingSubjects);
        Specialization digitalMarketingS = new Specialization("Digital Marketing", marketingSubjects);
        Specialization marketingS = new Specialization("Marketing", marketingSubjects);
        Specialization marketingManagementS = new Specialization("Marketing Management", marketingSubjects);
        Specialization businessS = new Specialization("Business", businessSubjects);
        Specialization financeS = new Specialization("Finance", financeSubjects);
        Specialization digitalEconomyS = new Specialization("Digital Economy", economySubjects);

        //Creating cathedras
        Cathedra accountingAndTaxationCath = new Cathedra("Accounting And Taxation",
                new Specialization[]{accountingAndTaxationConsultingS, accountingAndTaxationS, taxesAndTaxationS});
        Cathedra financeAuditCath = new Cathedra("Finance Audit",
                new Specialization[]{financeS});
        Cathedra economyCyberneticsCath = new Cathedra("Economy Cybernetics",
                new Specialization[]{digitalEconomyS});
        Cathedra marketingAndCommercialCath = new Cathedra("Marketing And Commercial",
                new Specialization[]{marketingManagementS, marketingS, digitalMarketingS});
        Cathedra commodityResearchCath = new Cathedra("Commodity Research And Customs Business",
                new Specialization[]{businessS});

        //adding teachers to cathedras
        accountingAndTaxationCath.addTeachers(factory.createTeachers(5));
        financeAuditCath.addTeachers(factory.createTeachers(2));
        economyCyberneticsCath.addTeachers(factory.createTeachers(3));
        marketingAndCommercialCath.addTeachers(factory.createTeachers(5));
        commodityResearchCath.addTeachers(factory.createTeachers(3));

        //adding auditoriums to cathedras
        accountingAndTaxationCath.addAuditoriums(firstFloor);
        financeAuditCath.addAuditoriums(secondFloor[6], secondFloor[7]);
        economyCyberneticsCath.addAuditoriums(secondFloor[3], secondFloor[4], secondFloor[5]);
        marketingAndCommercialCath.addAuditoriums(secondFloor[1], firstFloor[0], secondFloor[2]);
        commodityResearchCath.addAuditoriums(secondFloor[0]);

        //deleting auditorium from cathedra
        Auditorium a = marketingAndCommercialCath.delAuditorium(firstFloor[0]);
        System.out.println("Auditorium " + a.getNumber() + " was deleted from " + marketingAndCommercialCath.getName() + " cathedra");

        //Creating faculties
        Faculty accountingAndDataSystemF = new Faculty("Accounting And Data System",
                new Cathedra[]{accountingAndTaxationCath, financeAuditCath, economyCyberneticsCath});
        Faculty tradingAndMarketingF = new Faculty("Trading And Marketing",
                new Cathedra[]{marketingAndCommercialCath, commodityResearchCath});


        //Creating groups
        Group aDSatc1 = new Group("ADSatc-1", factory.createStudents(15));
        Group aDSatc2 = new Group("ADSatc-2", factory.createStudents(15));
        Group aDStt1 = new Group("ADStt-1", factory.createStudents(15));
        Group aDStt2 = new Group("ADStt-2", factory.createStudents(15));
        Group aDSat1 = new Group("ADSat-1", factory.createStudents(15));
        Group aDSf1 = new Group("ADSf-1", factory.createStudents(15));
        Group aDSf2 = new Group("ADSf-2", factory.createStudents(15));
        Group aDSde1 = new Group("ADSde-1", factory.createStudents(15));
        Group aDSde2 = new Group("ADSde-2", factory.createStudents(15));
        Group tMdm1 = new Group("TMdm-1", factory.createStudents(15));
        Group tMm1 = new Group("TMm-1", factory.createStudents(15));
        Group tMm2 = new Group("TMm-2", factory.createStudents(15));
        Group tMmm1 = new Group("TMmm-1", factory.createStudents(15));
        Group tMb1 = new Group("TMb-1", factory.createStudents(15));
        Group tMb2 = new Group("TMb-2", factory.createStudents(15));

        //Adding groups to specializations
        accountingAndTaxationConsultingS.addGroups(new Group[]{aDSatc1, aDSatc2});
        taxesAndTaxationS.addGroups(new Group[]{aDStt1, aDStt2});
        accountingAndTaxationS.addGroups(new Group[]{aDSat1});
        financeS.addGroups(new Group[]{aDSf1, aDSf2});
        digitalEconomyS.addGroups(new Group[]{aDSde1, aDSde2});
        digitalMarketingS.addGroups(new Group[]{tMdm1});
        marketingS.addGroups(new Group[]{tMm1, tMm2});
        marketingManagementS.addGroups(new Group[]{tMmm1});
        businessS.addGroups(new Group[]{tMb1, tMb2});

        Schedule[] schedules = new Schedule[0];
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if ((dayOfWeek != DayOfWeek.SATURDAY) && (dayOfWeek != DayOfWeek.SUNDAY)) {
                for (LessonOrder lessonOrder : LessonOrder.values()) {
                    Schedule[] newSchedule = new Schedule[]{
                            new Schedule(accountingAndDataSystemF, dayOfWeek, lessonOrder,
                                    accountingAndDataSystemF.getCathedras()[0].getSpecializations()[0].getGroups()[0],
                                    accountingAndDataSystemF.getCathedras()[0].getAuditoriums()[0],
                                    accountingAndDataSystemF.getCathedras()[0].getTeachers()[0],
                                    accountingAndDataSystemF.getCathedras()[0].getSpecializations()[0].getSubjects()[0]),
                            new Schedule(accountingAndDataSystemF, dayOfWeek, lessonOrder,
                                    accountingAndDataSystemF.getCathedras()[0].getSpecializations()[0].getGroups()[1],
                                    accountingAndDataSystemF.getCathedras()[0].getAuditoriums()[1],
                                    accountingAndDataSystemF.getCathedras()[0].getTeachers()[1],
                                    accountingAndDataSystemF.getCathedras()[0].getSpecializations()[0].getSubjects()[1]),
                            new Schedule(accountingAndDataSystemF, dayOfWeek, lessonOrder,
                                    accountingAndDataSystemF.getCathedras()[0].getSpecializations()[1].getGroups()[0],
                                    accountingAndDataSystemF.getCathedras()[0].getAuditoriums()[2],
                                    accountingAndDataSystemF.getCathedras()[0].getTeachers()[2],
                                    accountingAndDataSystemF.getCathedras()[0].getSpecializations()[1].getSubjects()[2]),
                            new Schedule(accountingAndDataSystemF, dayOfWeek, lessonOrder,
                                    accountingAndDataSystemF.getCathedras()[0].getSpecializations()[2].getGroups()[0],
                                    accountingAndDataSystemF.getCathedras()[0].getAuditoriums()[3],
                                    accountingAndDataSystemF.getCathedras()[0].getTeachers()[3],
                                    accountingAndDataSystemF.getCathedras()[0].getSpecializations()[2].getSubjects()[3]),
                            new Schedule(accountingAndDataSystemF, dayOfWeek, lessonOrder,
                                    accountingAndDataSystemF.getCathedras()[0].getSpecializations()[2].getGroups()[1],
                                    accountingAndDataSystemF.getCathedras()[0].getAuditoriums()[4],
                                    accountingAndDataSystemF.getCathedras()[0].getTeachers()[4],
                                    accountingAndDataSystemF.getCathedras()[0].getSpecializations()[2].getSubjects()[4]),
                            new Schedule(accountingAndDataSystemF, dayOfWeek, lessonOrder,
                                    accountingAndDataSystemF.getCathedras()[1].getSpecializations()[0].getGroups()[0],
                                    accountingAndDataSystemF.getCathedras()[1].getAuditoriums()[0],
                                    accountingAndDataSystemF.getCathedras()[1].getTeachers()[0],
                                    accountingAndDataSystemF.getCathedras()[1].getSpecializations()[0].getSubjects()[0]),
                            new Schedule(accountingAndDataSystemF, dayOfWeek, lessonOrder,
                                    accountingAndDataSystemF.getCathedras()[1].getSpecializations()[0].getGroups()[1],
                                    accountingAndDataSystemF.getCathedras()[1].getAuditoriums()[1],
                                    accountingAndDataSystemF.getCathedras()[1].getTeachers()[1],
                                    accountingAndDataSystemF.getCathedras()[1].getSpecializations()[0].getSubjects()[2]),
                            new Schedule(accountingAndDataSystemF, dayOfWeek, lessonOrder,
                                    accountingAndDataSystemF.getCathedras()[2].getSpecializations()[0].getGroups()[0],
                                    accountingAndDataSystemF.getCathedras()[2].getAuditoriums()[0],
                                    accountingAndDataSystemF.getCathedras()[2].getTeachers()[0],
                                    accountingAndDataSystemF.getCathedras()[2].getSpecializations()[0].getSubjects()[0]),
                            new Schedule(accountingAndDataSystemF, dayOfWeek, lessonOrder,
                                    accountingAndDataSystemF.getCathedras()[2].getSpecializations()[0].getGroups()[1],
                                    accountingAndDataSystemF.getCathedras()[2].getAuditoriums()[1],
                                    accountingAndDataSystemF.getCathedras()[2].getTeachers()[1],
                                    accountingAndDataSystemF.getCathedras()[2].getSpecializations()[0].getSubjects()[2]),
                            new Schedule(tradingAndMarketingF, dayOfWeek, lessonOrder,
                                    tradingAndMarketingF.getCathedras()[0].getSpecializations()[0].getGroups()[0],
                                    tradingAndMarketingF.getCathedras()[0].getAuditoriums()[0],
                                    tradingAndMarketingF.getCathedras()[0].getTeachers()[0],
                                    tradingAndMarketingF.getCathedras()[0].getSpecializations()[0].getSubjects()[0]),
                            new Schedule(tradingAndMarketingF, dayOfWeek, lessonOrder,
                                    tradingAndMarketingF.getCathedras()[0].getSpecializations()[1].getGroups()[0],
                                    tradingAndMarketingF.getCathedras()[0].getAuditoriums()[1],
                                    tradingAndMarketingF.getCathedras()[0].getTeachers()[1],
                                    tradingAndMarketingF.getCathedras()[0].getSpecializations()[1].getSubjects()[1]),
                            new Schedule(tradingAndMarketingF, dayOfWeek, lessonOrder,
                                    tradingAndMarketingF.getCathedras()[0].getSpecializations()[1].getGroups()[1],
                                    accountingAndDataSystemF.getCathedras()[2].getAuditoriums()[2],
                                    tradingAndMarketingF.getCathedras()[0].getTeachers()[2],
                                    tradingAndMarketingF.getCathedras()[0].getSpecializations()[1].getSubjects()[2]),
                            new Schedule(tradingAndMarketingF, dayOfWeek, lessonOrder,
                                    tradingAndMarketingF.getCathedras()[0].getSpecializations()[2].getGroups()[0],
                                    accountingAndDataSystemF.getCathedras()[0].getAuditoriums()[5],
                                    tradingAndMarketingF.getCathedras()[0].getTeachers()[3],
                                    tradingAndMarketingF.getCathedras()[0].getSpecializations()[2].getSubjects()[2]),
                            new Schedule(tradingAndMarketingF, dayOfWeek, lessonOrder,
                                    tradingAndMarketingF.getCathedras()[1].getSpecializations()[0].getGroups()[0],
                                    accountingAndDataSystemF.getCathedras()[0].getAuditoriums()[6],
                                    tradingAndMarketingF.getCathedras()[1].getTeachers()[0],
                                    tradingAndMarketingF.getCathedras()[1].getSpecializations()[0].getSubjects()[0]),
                            new Schedule(tradingAndMarketingF, dayOfWeek, lessonOrder,
                                    tradingAndMarketingF.getCathedras()[1].getSpecializations()[0].getGroups()[1],
                                    accountingAndDataSystemF.getCathedras()[0].getAuditoriums()[7],
                                    tradingAndMarketingF.getCathedras()[0].getTeachers()[4],
                                    tradingAndMarketingF.getCathedras()[1].getSpecializations()[0].getSubjects()[1])
                    };
                    schedules = Arrays.copyOf(schedules, schedules.length + newSchedule.length);
                    System.arraycopy(newSchedule, 0, schedules, schedules.length - newSchedule.length, newSchedule.length);
                }
            }
        }
        ScheduleManager scheduleManager = new ScheduleManager();
        scheduleManager.printSchedule(accountingAndDataSystemF, schedules);
        scheduleManager.printSchedule(tradingAndMarketingF, schedules);
    }
}
