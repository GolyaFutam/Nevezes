public class Golya extends Alcoholic {

    private enum signature {signed, declined}

    private String neptun;
    private int felviPoint;
    private int mentalhealth;
    private int currentSemester;
    private short money;
    private signature signed = signature.declined;

    private Golya() {
        isDrunk();
    }

    public boolean hasGirlfriend() {
        return false;
    }

    public boolean useFelviPoint() {
        return false;
    }

    public boolean uni() {

        while(mentalhealth >= 0) {
            mentalhealth--;
            currentSemester++;

            if(currentSemester >= 12) {
                money = 0;
                mentalhealth = 0;
                isDrunk();
            }
            if(signed.equals(signature.declined)){
                return isDrunk();
            }
        }
        return isDrunk();
    }

}
