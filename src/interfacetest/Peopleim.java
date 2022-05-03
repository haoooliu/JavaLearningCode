package interfacetest;

public class Peopleim implements People{
    @Override
    public void showStatus() {
        System.out.println("Override: People can walk");
    }
    class Brain {
        int brainAge = 0;
        public int addBrainAge(int i){
            brainAge += i;
            return brainAge;
        }
        void showBrainAge(){
            if(brainAge <= 5){
                System.out.println(brainAge + "我要吃fanfan");
            }
            if(brainAge > 5){
                System.out.println(brainAge + "我要吃fan");
            }
        }
    }
}
