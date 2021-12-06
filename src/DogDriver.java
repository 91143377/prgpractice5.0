public class DogDriver
{
    //5.3 Change class Dog so that it implements the interface Comparable.
    // Compare two dogs by age. In the driver, compare Piper to Fang and then Fang to your dog.
    // Instantiate dog1: Fang a 5-year-old Husky that weighs 80 pounds;
    // dog2 Piper a 3-year-old Australian Shepherd that is 45 pounds; dog3 which you get to describe.
    //  OUTPUT: Fang’s breed and age, Piper's weight, your dog’s full description and how many dogs you have.

    public static void main (String[] args)
    {
        Dog dog1 = new Dog ("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog ("Piper", 3, "Australian Shepherd", 45);
        Dog dog3 = new Dog ("Hachi", 11, "Canis familiaris", 90);

      /*  System.out.println
                (dog1.toString()+ dog1.whatKgIs(dog1.getWeight()));
        System.out.println
                (dog2.toString()+ dog2.whatKgIs(dog2.getWeight()));
        System.out.println
                (dog3.toString() + dog3.whatKgIs(dog3.getWeight()));
        System.out.println("\nThe number of dogs: " + Dog.getCount());
       */

        System.out.println(dog1.fangToString());
        System.out.println(dog2.piperToString() + " " + dog2.whatKgIs(dog2.getWeight()));
        System.out.println("\nTotal number of dogs: " + Dog.getCount());


        if(dog1.compareTo(dog3) > 0)
        {
            System.out.println(dog1.getName() + " is older than " + dog3.getName());
        } else if(dog2.compareTo(dog3) < 0)
        {
            System.out.println(dog1.getName() + " is younger than " + dog3.getName());
        } else
        {
            System.out.println(dog1.getName() + " is the same age as " + dog3.getName());
        }

        if(dog1.compareTo(dog2) > 0)
        {
            System.out.println(dog1.getName() + " is older than " + dog2.getName());
        } else if(dog1.compareTo(dog2) < 0)
        {
            System.out.println(dog1.getName() + " is younger than " + dog2.getName());
        } else
        {
            System.out.println(dog1.getName() + " is the same age as " + dog2.getName());
        }

        //System.out.println("\n" + dog2.compareTo(dog3));



    }

}