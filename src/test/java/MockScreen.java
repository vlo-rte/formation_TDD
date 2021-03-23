public class MockScreen implements Screen {

    String outputMessage;
    int counter = 0;

    public String getOutputMessage() {
        return outputMessage;
    }

    public int getCounter() {
        return counter;
    }

    public void show(String message){
        System.out.println(message);
        counter++;
        this.outputMessage = message;
    }
}