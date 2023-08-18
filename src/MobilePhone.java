public class MobilePhone implements Telephone {

    private String myNumber;
    private Boolean isRinging;
    private Boolean isPowerOn;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn=true;
        System.out.println("phone  powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now Ringing "+phoneNumber+" on phone");
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn){
            System.out.println("Answering the Phone");
            isRinging=false;
        }else {
            System.out.println("Phone is not Ringing");
        }
        System.out.println("Error");
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber && isPowerOn){
            isRinging=true;
            System.out.println("Phone Ringing");
        }else {
            System.out.println("Either Phone number Wrong or Phone is off");
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
