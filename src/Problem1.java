import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String s = in.next();

        largestProduct(n, s);
    }

    public static int largestProduct(int n, String s)
    {
        int i = 0;
        int j = 2;
        int greatestProduct = 0;
        int currentProduct = 0;

        while(j <= n)
        {
            while ((i + n) <= s.length())
            {
//                System.out.println(s.substring(i, i + n));
                String numericGroup = s.substring(i, i + n);

                currentProduct = calculateProduct(n, numericGroup);
                if(greatestProduct < currentProduct)
                {
                    greatestProduct = currentProduct;
                }

                i++;
            }
//
//            System.out.println("*************************************************************************************");
//            System.out.println("\n\n\n");
//            System.out.println(greatestProduct);
//            System.out.println("\n\n\n");
//            System.out.println("*************************************************************************************");

            i = 0;
            n--;
        }

//        System.out.println("\n\n\n");
        System.out.println(greatestProduct);

        return 0;
    }

    public static int calculateProduct(int n, String numericGroup)
    {
        char[] numberGroup = numericGroup.toCharArray();
        int product = Character.getNumericValue(numberGroup[0]);

        for(int i = 1; i < n; i++)
        {
            int number = Character.getNumericValue(numberGroup[i]);
            product *= number;
            if(product == 0)
            {
                return 0;
            }
        }

        return product;
    }
}