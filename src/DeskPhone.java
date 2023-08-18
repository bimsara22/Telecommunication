public class DeskPhone implements Telephone {

    private String myNumber;
    private Boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone always powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now Ringing " + phoneNumber + " on Desk phone");
    }


    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the Phone");
            isRinging = false;
        } else {
            System.out.println("Phone is not Ringing");
        }
        System.out.println("Error");
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Phone Ringing");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }


}
