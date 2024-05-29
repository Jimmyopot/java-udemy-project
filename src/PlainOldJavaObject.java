public class PlainOldJavaObject {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            LPAStudent student1 = new LPAStudent(
                    "23" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Grace";
                        case 3 -> "Carol";
                        case 4 -> "Tim";
                        case 5 -> "Haaland";
                        default -> "Anonymous";
                    },
                    "05/14/1998",
                    "Java Masterclass"
            );
            System.out.println(student1.toString());
        }

        Student pojoStudent = new Student(
                "209120",
                "Ann",
                "07/11/1997",
                "Javascript Masterclass"
        );

        LPAStudent recordStudent = new LPAStudent(
                "309201",
                "Lilian",
                "07/11/2006",
                "Kotlin Masterclass"
        );

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(" ");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
