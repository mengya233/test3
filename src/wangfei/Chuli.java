package wangfei;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chuli {
    public static String select(String tip, String[] selections) {
        for (int i = 0; i < selections.length; i++) {
            System.out.println(i + ")\t" + selections[i]);
        }
        return selections[inputInt(tip, 0, selections.length - 1)];
    }
    public static String inputString(String tip) {
        do {
            System.out.print("[?] " + tip + " ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine().trim();
                return str;
            }
         while (true);
    }
    public static int inputInt(String tip, int min, int max) {
        do {
            System.out.print("[?] " + tip + " [" + min + "-" + max + "]: ");
            Scanner sc = new Scanner(System.in);
            Integer intinput = null;
            try {
                intinput = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("´íÎó");
            } catch (Exception ignored) {
            }
            return intinput;
        } while (true);
    }
    public static float inputFloat(String tip, float min, float max) {
        do {
            System.out.print("[?] " + tip + " [" + min + "-" + max + "]: ");
            Scanner sc = new Scanner(System.in);
            Float finput = null;
            try {
                finput = sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("´íÎó");
            } catch (Exception ignored) {
            }
            return finput;
        } while (true);
    }
    public static boolean inRange(float target,float min, float max) {
        if (min >= 0 && target < min) return false;
        return !(max >= 0) || !(target >= max);
    }
    }
