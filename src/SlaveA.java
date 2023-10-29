public class SlaveA {
    private static char jobType = 'A';

    //Pass in thread??? or just call it on a thread???
    public SlaveA(char type){
        jobType = type;
    }

    public static void sleepTime(){
        try {
            if (jobType == 'A') {
                Thread.sleep(2000);
            } else {
                Thread.sleep(10000);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
