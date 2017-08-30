/**
 * Created by olal15 on 2017-08-30.
 */
public class CMDInput {
    public static void main(String[] args) {
        System.out.println("du skrev in" + args.length + " command-line arguments");

        if (args.length == 0) {
            System.out.println("Programmet vet inte vad det ska göra! Avbryter.");
        }
        else if (args.length == 1) {
            System.out.println("Så du säger " + args[0] );
        }
        else if (args.length == 2) {
            int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
            System.out.println(args[0] + "+" + args[1] + "=" + sum);

        }
        else if (args.length ==3) {
            System.out.println(args[2] + args[1] + args[0]);
        }
        else if (args.length > 3) {
            System.out.println("Jag orkar inte, jag stänger ner.");
        }
    }
}

