import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

//I HAD TO DECOMPILE THIS!

public class Driver {
   public static void main(String[] var0) throws Exception {
      for(int var1 = 0; var1 <= 98; ++var1) {
         String var2 = "cases/test" + var1;
         Scanner var3 = new Scanner(new File(var2 + ".in"));
         int var4 = var3.nextInt();
         int[] var5 = new int[var4];
         int[] var6 = new int[var4];
         int[] var7 = new int[var4];

         int var8;
         int var9;
         for(var8 = 0; var8 < var4; ++var8) {
            var9 = var3.nextInt();
            var5[var8] = var9;
            var7[var8] = var9;
         }

         var3.close();
         var3 = new Scanner(new File(var2 + ".out"));
         var3.nextInt();

         for(var8 = 0; var8 < var4; ++var8) {
            var9 = var3.nextInt();
            var6[var8] = var9;
         }

         var7 = Merge.mergesortH(var5);
         //System.out.println(Arrays.toString(var6));
         //System.out.println(Arrays.toString(var7));
         boolean var10 = true;

         for(var9 = 0; var9 < var4; ++var9) {
            if (var7[var9] != var6[var9]) {
               var10 = false;
               break;
            }
         }

         if (var10) {
            System.out.println("PASS CASE: " + var2 + ".in");
         } else {
            System.out.println("FAIL CASE: " + var2 + ".in");
         }
      }

   }
}
