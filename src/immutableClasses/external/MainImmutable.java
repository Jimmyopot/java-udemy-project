package immutableClasses.external;

import immutableClasses.PersonImmutable;

public class MainImmutable {
    public static void main(String[] args) {
        PersonImmutable jane = new PersonImmutable("Jane", "01/01/2003");
        PersonImmutable jim = new PersonImmutable("Jim", "11/23/2001");
        PersonImmutable joe = new PersonImmutable("Joe", "03/11/2004");

        PersonImmutable[] johnsKids = {jane, jim, joe};
        PersonImmutable john = new PersonImmutable("John", "05/10/1982", johnsKids);

        System.out.println(john);

        PersonImmutable[] kids = john.getKids();
        kids[0] = jim;
        kids[1] = new PersonImmutable("Ann", "03/05/2024");
        System.out.println(john);

        LivingPerson johnLiving = new LivingPerson(john.getName(), john.getKids());
        System.out.println(johnLiving);

        LivingPerson anne = new LivingPerson("Ann", (PersonImmutable[]) null);
        johnLiving.addKid(anne);
        System.out.println(johnLiving);

        PersonOfInterest johnCopy = new PersonOfInterest(john);
        System.out.println(johnCopy);

        kids = johnCopy.getKids();
        kids[1] = anne;
        System.out.println(johnCopy);
        System.out.println(john);
    }
}
