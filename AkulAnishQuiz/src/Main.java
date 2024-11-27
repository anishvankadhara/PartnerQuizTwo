//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        I addition = (a,b)->{
            int count=0;
            for(int i=a; i<=b; i++) {
                count+=i;
            }
            return count;
        };

        try {
            int a  = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(addition.add(a,b));
        } catch (NumberFormatException e) {
            System.out.println("error, enter integers");
        }

    }
}