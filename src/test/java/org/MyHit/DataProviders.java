package org.MyHit;

import org.testng.annotations.DataProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class DataProviders {

    @DataProvider
    public static Iterator<Object[]> loadLogInFromResourceData() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(
                DataProviders.class.getResourceAsStream("")));

        List<Object[]> userData = new ArrayList<Object[]>();
        String line = in.readLine();
        while (line != null) {
            userData.add(line.split(";"));
            line = in.readLine();
        }
        in.close();
        return userData.iterator();
    }

    @DataProvider
    public static Iterator<Object[]> loadInvalidLogInFromResourceData() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(
                DataProviders.class.getResourceAsStream("/invalidLogin.data")));

        List<Object[]> userData = new ArrayList<Object[]>();
        String line = in.readLine();
        while (line != null) {
            userData.add(line.split(";"));
            line = in.readLine();
        }

        in.close();

        return userData.iterator();
    }

    @DataProvider
    public static Iterator<Object[]> loadLogInByHardcode() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{"",""});
        data.add(new Object[]{"",""});
        return data.iterator();
    }

    //Random profile fillings
    @DataProvider
    public Iterator<Object[]> users() {
        List<Object[]> data = new ArrayList<Object[]>();
        for (int i = 0; i < 5; i++) {
            data.add(new Object[]{
                    generateRandomName(), generateRandomPassword()
            });
        }
        return data.iterator();
    }

    private Object generateRandomPassword() {
        return "pass" + new Random().nextInt();
    }
    private Object generateRandomName() {
        return "demo" + new Random().nextInt();
    }

}