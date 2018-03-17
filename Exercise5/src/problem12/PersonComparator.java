package problem12;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge() == o2.getAge()){
            if(o1.getLastname().equals(o2.getLastname())){
                if(o1.getFirstname().equals(o2.getFirstname())){
                    return 0;
                }

                return o1.getFirstname().compareTo(o2.getFirstname());
            }

            return o1.getLastname().compareTo(o2.getLastname());
        }

        return o1.getAge() - o2.getAge();
    }
}
