public class Application {
    InputDevice inputDevice;
    OutputDevice outputDevice;
    public Application(InputDevice in, OutputDevice out) {
        this.inputDevice = in;
        this.outputDevice = out;
    }

    public void run2(InputDevice in, OutputDevice out) {
        playGame(in, out);
    }
    public void playGame(InputDevice in, OutputDevice out) {
        Integer score1=0;
        Integer score2=0;
        while (score1<6 || score2<6) {
            Integer num1=inputDevice.nextInt();
            Integer num2=inputDevice.nextInt();
            run(num1,num2);
            if(num1>num2){
                if(num1%num2==0 && num2>=10){
                    score2++;
                }
                else{
                    score1++;
                }
            }
            else if(num2==num1){
                score1=score1+2;
                score2=score2+2;
            }
            else if(num1<num2){
                if(num2%num1==0 && num1>=10){
                    score1++;
                }
                else{
                    score2++;
                }
            }
            String mess2="Player 1: "+score1+" Player 2: "+score2+"\n";
            outputDevice.writeMessage(mess2);
        }

        if(score1==5)
        {
            String mess3="Player 1 WINS!";
            outputDevice.writeMessage(mess3);
        } else if (score2==5) {
            String mess3="Player 2 WINS!";
            outputDevice.writeMessage(mess3);
        }



    }
    public void run(Integer p1, Integer p2){
        String mess="Application started\n\nToday's lucky numbers are: "+p1+" "+p2;
        outputDevice.writeMessage(mess);

    }
}
