package com.ProjectMyPresent.ProjectMyPresent.model.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "maintabletest")
public class Answer {
    @Id
    long id;
    @Column(name = "q_1")
    boolean q1;
    @Column(name = "q_2")
    boolean q2;
    @Column(name = "q_3")
    boolean q3;
    @Column(name = "q_4")
    boolean q4;
    @Column(name = "q_5")
    boolean q5;
    @Column(name = "q_6")
    boolean q6;
    @Column(name = "q_7")
    boolean q7;
    @Column(name = "q_8")
    boolean q8;
    @Column(name = "q_9")
    boolean q9;
    @Column(name = "q_10")
    boolean q10;
    @Column(name = "q_11")
    boolean q11;
    @Column(name = "q_12")
    boolean q12;
    @Column(name = "q_13")
    boolean q13;
    @Column(name = "q_14")
    boolean q14;
    @Column(name = "q_15")
    boolean q15;
    @Column(name = "q_16")
    boolean q16;
    @Column(name = "q_17")
    boolean q17;
    @Column(name = "q_18")
    boolean q18;
    @Column(name = "q_19")
    boolean q19;
    @Column(name = "q_20")
    boolean q20;
    @Column(name = "q_21")
    boolean q21;
    @Column(name = "q_22")
    boolean q22;
    @Column(name = "q_23")
    boolean q23;
    @Column(name = "q_24")
    boolean q24;
    @Column(name = "q_25")
    boolean q25;
    @Column(name = "q_26")
    boolean q26;
    @Column(name = "q_27")
    boolean q27;
    @Column(name = "q_28")
    boolean q28;
    @Column(name = "q_29")
    boolean q29;
    @Column(name = "q_30")
    boolean q30;
    @Column(name = "q_31")
    boolean q31;
    @Column(name = "q_32")
    boolean q32;
    @Column(name = "q_33")
    boolean q33;
    @Column(name = "q_34")
    boolean q34;
    @Column(name = "q_35")
    boolean q35;
    @Column(name = "q_36")
    boolean q36;
    @Column(name = "q_37")
    boolean q37;
    @Column(name = "q_38")
    boolean q38;
    @Column(name = "q_39")
    boolean q39;
    @Column(name = "q_40")
    boolean q40;
    @Column(name = "q_41")
    boolean q41;
    @Column(name = "q_42")
    boolean q42;
    @Column(name = "q_43")
    boolean q43;
    @Column(name = "q_44")
    boolean q44;
    @Column(name = "q_45")
    boolean q45;
    @Column(name = "q_46")
    boolean q46;
    @Column(name = "q_47")
    boolean q47;
    @Column(name = "q_48")
    boolean q48;
    @Column(name = "q_49")
    boolean q49;
    @Column(name = "q_50")
    boolean q50;
    @Column(name = "q_51")
    boolean q51;
    @Column(name = "q_52")
    boolean q52;
    @Column(name = "q_53")
    boolean q53;
    @Column(name = "q_54")
    boolean q54;
    @Column(name = "q_55")
    boolean q55;
    @Column(name = "q_56")
    boolean q56;
    @Column(name = "q_57")
    boolean q57;
    @Column(name = "q_58")
    boolean q58;
    @Column(name = "q_59")
    boolean q59;
    @Column(name = "q_60")
    boolean q60;
    @Column(name = "q_61")
    boolean q61;
    @Column(name = "q_62")
    boolean q62;
    @Column(name = "q_63")
    boolean q63;
    @Column(name = "q_64")
    boolean q64;
    @Column(name = "q_65")
    boolean q65;
    @Column(name = "q_66")
    boolean q66;
    @Column(name = "q_67")
    boolean q67;
    @Column(name = "q_68")
    boolean q68;
    @Column(name = "q_69")
    boolean q69;
    @Column(name = "q_70")
    boolean q70;
    @Column(name = "q_71")
    boolean q71;
    @Column(name = "q_72")
    boolean q72;
    @Column(name = "q_73")
    boolean q73;
    @Column(name = "q_74")
    boolean q74;
    @Column(name = "q_75")
    boolean q75;
    @Column(name = "q_76")
    boolean q76;
    @Column(name = "q_77")
    boolean q77;
    @Column(name = "q_78")
    boolean q78;
    @Column(name = "q_79")
    boolean q79;
    @Column(name = "q_80")
    boolean q80;
    @Column(name = "q_81")
    boolean q81;
    @Column(name = "q_82")
    boolean q82;
    @Column(name = "q_83")
    boolean q83;
    @Column(name = "q_84")
    boolean q84;
    @Column(name = "q_85")
    boolean q85;
    @Column(name = "q_86")
    boolean q86;
    @Column(name = "q_87")
    boolean q87;
    @Column(name = "q_88")
    boolean q88;
    @Column(name = "q_89")
    boolean q89;
    @Column(name = "q_90")
    boolean q90;
    @Column(name = "q_91")
    boolean q91;
    @Column(name = "q_92")
    boolean q92;
    @Column(name = "q_93")
    boolean q93;
    @Column(name = "q_94")
    boolean q94;
    @Column(name = "q_95")
    boolean q95;
    @Column(name = "q_96")
    boolean q96;
    @Column(name = "q_97")
    boolean q97;
    @Column(name = "q_98")
    boolean q98;
    @Column(name = "q_99")
    boolean q99;
    @Column(name = "q_100")
    boolean q100;

    List<Boolean> getResultList(){
        List<Boolean> booleanList = new ArrayList<>();
        booleanList.add(q1);
        booleanList.add(q2);
        booleanList.add(q3);
        booleanList.add(q4);
        booleanList.add(q5);
        booleanList.add(q6);
        booleanList.add(q7);
        booleanList.add(q8);
        booleanList.add(q9);
        booleanList.add(q10);
        booleanList.add(q11);
        booleanList.add(q12);
        booleanList.add(q13);
        booleanList.add(q14);
        booleanList.add(q15);
        booleanList.add(q16);
        booleanList.add(q17);
        booleanList.add(q18);
        booleanList.add(q19);
        booleanList.add(q20);
        booleanList.add(q21);
        booleanList.add(q22);
        booleanList.add(q23);
        booleanList.add(q24);
        booleanList.add(q25);
        booleanList.add(q26);
        booleanList.add(q27);
        booleanList.add(q28);
        booleanList.add(q29);
        booleanList.add(q30);
        booleanList.add(q31);
        booleanList.add(q32);
        booleanList.add(q33);
        booleanList.add(q34);
        booleanList.add(q35);
        booleanList.add(q36);
        booleanList.add(q37);
        booleanList.add(q38);
        booleanList.add(q39);
        booleanList.add(q40);
        booleanList.add(q41);
        booleanList.add(q42);
        booleanList.add(q43);
        booleanList.add(q44);
        booleanList.add(q45);
        booleanList.add(q46);
        booleanList.add(q47);
        booleanList.add(q48);
        booleanList.add(q49);
        booleanList.add(q50);
        booleanList.add(q51);
        booleanList.add(q52);
        booleanList.add(q53);
        booleanList.add(q54);
        booleanList.add(q55);
        booleanList.add(q56);
        booleanList.add(q57);
        booleanList.add(q58);
        booleanList.add(q59);
        booleanList.add(q60);
        booleanList.add(q61);
        booleanList.add(q62);
        booleanList.add(q63);
        booleanList.add(q64);
        booleanList.add(q65);
        booleanList.add(q66);
        booleanList.add(q67);
        booleanList.add(q68);
        booleanList.add(q69);
        booleanList.add(q70);
        booleanList.add(q71);
        booleanList.add(q72);
        booleanList.add(q73);
        booleanList.add(q74);
        booleanList.add(q75);
        booleanList.add(q76);
        booleanList.add(q77);
        booleanList.add(q78);
        booleanList.add(q79);
        booleanList.add(q80);
        booleanList.add(q81);
        booleanList.add(q82);
        booleanList.add(q83);
        booleanList.add(q84);
        booleanList.add(q85);
        booleanList.add(q86);
        booleanList.add(q87);
        booleanList.add(q88);
        booleanList.add(q89);
        booleanList.add(q90);
        booleanList.add(q91);
        booleanList.add(q92);
        booleanList.add(q93);
        booleanList.add(q94);
        booleanList.add(q95);
        booleanList.add(q96);
        booleanList.add(q97);
        booleanList.add(q98);
        booleanList.add(q99);
        booleanList.add(q100);
        return booleanList;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", q1=" + q1 +
                ", q2=" + q2 +
                ", q3=" + q3 +
                ", q4=" + q4 +
                ", q5=" + q5 +
                ", q6=" + q6 +
                ", q7=" + q7 +
                ", q8=" + q8 +
                ", q9=" + q9 +
                ", q10=" + q10 +
                ", q11=" + q11 +
                ", q12=" + q12 +
                ", q13=" + q13 +
                ", q14=" + q14 +
                ", q15=" + q15 +
                ", q16=" + q16 +
                ", q17=" + q17 +
                ", q18=" + q18 +
                ", q19=" + q19 +
                ", q20=" + q20 +
                ", q21=" + q21 +
                ", q22=" + q22 +
                ", q23=" + q23 +
                ", q24=" + q24 +
                ", q25=" + q25 +
                ", q26=" + q26 +
                ", q27=" + q27 +
                ", q28=" + q28 +
                ", q29=" + q29 +
                ", q30=" + q30 +
                ", q31=" + q31 +
                ", q32=" + q32 +
                ", q33=" + q33 +
                ", q34=" + q34 +
                ", q35=" + q35 +
                ", q36=" + q36 +
                ", q37=" + q37 +
                ", q38=" + q38 +
                ", q39=" + q39 +
                ", q40=" + q40 +
                ", q41=" + q41 +
                ", q42=" + q42 +
                ", q43=" + q43 +
                ", q44=" + q44 +
                ", q45=" + q45 +
                ", q46=" + q46 +
                ", q47=" + q47 +
                ", q48=" + q48 +
                ", q49=" + q49 +
                ", q50=" + q50 +
                ", q51=" + q51 +
                ", q52=" + q52 +
                ", q53=" + q53 +
                ", q54=" + q54 +
                ", q55=" + q55 +
                ", q56=" + q56 +
                ", q57=" + q57 +
                ", q58=" + q58 +
                ", q59=" + q59 +
                ", q60=" + q60 +
                ", q61=" + q61 +
                ", q62=" + q62 +
                ", q63=" + q63 +
                ", q64=" + q64 +
                ", q65=" + q65 +
                ", q66=" + q66 +
                ", q67=" + q67 +
                ", q68=" + q68 +
                ", q69=" + q69 +
                ", q70=" + q70 +
                ", q71=" + q71 +
                ", q72=" + q72 +
                ", q73=" + q73 +
                ", q74=" + q74 +
                ", q75=" + q75 +
                ", q76=" + q76 +
                ", q77=" + q77 +
                ", q78=" + q78 +
                ", q79=" + q79 +
                ", q80=" + q80 +
                ", q81=" + q81 +
                ", q82=" + q82 +
                ", q83=" + q83 +
                ", q84=" + q84 +
                ", q85=" + q85 +
                ", q86=" + q86 +
                ", q87=" + q87 +
                ", q88=" + q88 +
                ", q89=" + q89 +
                ", q90=" + q90 +
                ", q91=" + q91 +
                ", q92=" + q92 +
                ", q93=" + q93 +
                ", q94=" + q94 +
                ", q95=" + q95 +
                ", q96=" + q96 +
                ", q97=" + q97 +
                ", q98=" + q98 +
                ", q99=" + q99 +
                ", q100=" + q100 +
                '}';
    }
}
