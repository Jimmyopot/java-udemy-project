package immutableClasses.external;

import immutableClasses.PersonImmutable;

public class PersonOfInterest extends PersonImmutable {
    public PersonOfInterest(PersonImmutable person) {
        super(person);
    }
}
