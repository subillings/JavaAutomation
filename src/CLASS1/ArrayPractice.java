package CLASS1;

public class ArrayPractice {


    public static void main (String [] args) {

        Student [] studentArray = getStudentArray(100);

        for (int i=0; i<studentArray.length; i++) {

            System.out.println("THIS STUDENT ID FOR STUDENT" + (i+1)
                    + "is" + studentArray[i].getStudentId());

        }



    }

    private static void getStudentArray(int i) {
        }

}