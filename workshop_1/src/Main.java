import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 for text, press 2 for dollar exchange rate, and press 3 for error. ");
        String c = scan.nextLine();
        int a = Integer.parseInt(c);
        if (a == 1)
            first_homework();
        else if (a == 2)
        {

            int    term = 23;
            double yday_dollar = 28.12;
            boolean    dolar_down = false;
            double tday_dollar = get_dollar();
            String     arr_dir = "";


            if (tday_dollar < yday_dollar)
            {
                arr_dir = "dollar is down";
                System.out.println(arr_dir);
            }
            else if (tday_dollar > yday_dollar)
            {
                arr_dir = "dollar is up";
                System.out.println(arr_dir);
            }
            else
            {
                arr_dir = "dollar is equal";
                System.out.println(arr_dir);
            }
        }
        else if (a == 3)
            System.err.println("error");
    }
    public static double get_dollar()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter dollar($) exchange rate: ");
        String t_day_dollar = scanner.nextLine();
        double ret = Double.parseDouble(t_day_dollar);
        return  (ret);
    }
    public static void first_homework()
    {
        String[] loans = {"fast loan", "You should get your SALARY FROM Halkbank", "Happy Retired"};
        for (int i = 0; i < loans.length; i++)
            System.out.println(loans[i]);

        System.out.println("hello world!");
        String md_text = ("You may be interested");
        String sub_text = "term time";

        System.out.println("Midtext: " + md_text);
        System.out.println(sub_text);
    }
}

