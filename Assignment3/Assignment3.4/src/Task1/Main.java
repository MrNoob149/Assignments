//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        double var1 = (double)0.0F;
        double var3 = (double)0.0F;
        int var5 = 0;
        Object var6 = null;

        URL var7;
        try {
            var7 = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException var25) {
            System.err.println(var25);
            return;
        }

        try {
            InputStream var8 = var7.openStream();
            InputStreamReader var9 = new InputStreamReader(var8);
            BufferedReader var10 = new BufferedReader(var9);
            String var11 = "";
            StringBuilder var12 = new StringBuilder();
            String[] var13 = new String[0];
            boolean var14 = true;

            while((var11 = var10.readLine()) != null) {
                if (var11 != null) {
                    if (var14) {
                        var13 = var11.split(";");
                        var14 = false;
                    } else {
                        String[] var15 = var11.split(";");
                        System.out.println(var13[1] + " : " + var15[1] + ", ");
                        if (!Objects.equals(var15[1], "*")) {
                            ++var5;
                            var3 += Double.parseDouble(var15[1].replace(',', '.'));
                        }
                    }
                }
            }

            var1 = var3 / (double)var5;
            var12.append(var11);
            System.out.println(var1);
        } catch (IOException var26) {
            System.err.println(var26);
        } finally {
            try {
                if (var6 != null) {
                    ((BufferedReader)var6).close();
                }
            } catch (Exception var24) {
                System.out.println("Error while closing the file");
            }

        }

    }
}
