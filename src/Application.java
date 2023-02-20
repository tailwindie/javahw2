public class Application {

    public static void main(String[] args) throws Exception{

        ReadInput readF = new ReadInput();
        // readF.inputReader();
        WriteResult ts = new WriteResult();

        ts.calculate(readF.inputReader("a"),readF.inputReader("b"));
    }
}