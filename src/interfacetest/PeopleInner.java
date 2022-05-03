package interfacetest;

public class PeopleInner {
    public People InnerTest (){
        class myPeople implements People{

            @Override
            public void showStatus() {

            }
        }

        return new myPeople();
    }
}
