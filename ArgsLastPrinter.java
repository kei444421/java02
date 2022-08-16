public class ArgsLastPrinter {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("nothing");
    } else {
      System.out.println("args.length = " + args.length);

      System.out.println("args[args.length - 1] = " + args[args.length - 1]);
    }
  }
}

