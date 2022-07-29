package com.mf.algorithm;

import java.io.*;
import java.util.*;

public class Parser {
    public static void main(String[] args) throws IOException {
        BufferedReader b1= new BufferedReader(new FileReader("C:\\data\\error\\1.txt"));
        BufferedReader b2 = new BufferedReader(new FileReader("C:\\data\\error\\4.txt"));
        FileOutputStream o1 = new FileOutputStream(new File("C:\\data\\error\\2.txt"));
        FileOutputStream o2 = new FileOutputStream(new File("C:\\data\\error\\3.txt"));
        FileOutputStream o3 = new FileOutputStream(new File("C:\\data\\error\\5.txt"));
        FileOutputStream o4 = new FileOutputStream(new File("C:\\data\\error\\6.txt"));
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        List<Map<String, String>> l3 = new ArrayList<>();
        String s = null;
        while ((s = b1.readLine()) != null) {
            if (!s.contains("//") && !s.isEmpty()){
                String [] res = s.trim().split("=");
                String [] values = res[1].replace("new ErrorCode(","").replace(")", "").split(",");
                StringBuilder s1 = new StringBuilder();
                s1.append("export const " + res[0] + " = ");
                s1.append("`${preFix}" + "16001" + values[0].trim() + "`;");
                l1.add(String.valueOf(s1));

                StringBuilder s2= new StringBuilder();
                StringBuilder value = new StringBuilder();
                for (int i = 1; i < values.length ; i++) {

                    if ((Objects.equals(values[i].trim(), "false") || Objects.equals(values[i].trim(), "true"))) {
                        continue;
                    }
                    value.append(values[i]);
                }
                s2.append("[constants." + res[0].trim() + "]:" + value + ",");
                l2.add(String.valueOf(s2));

            }
        }


        for (String sb : l1) {
            o1.write(sb.getBytes());
            o1.write("\r\n".getBytes());
        }

        for (String sr : l2) {
            o2.write(sr.getBytes());
            o2.write("\r\n".getBytes());
        }
        String line = null;


        while ((line= b2.readLine())!=null) {
            HashMap<String, String> map = null;
            if (line.contains("@ErrorCodeDescription")) {
                map = new HashMap<>();
                String [] res = line.trim().replace("@ErrorCodeDescription(", "").replace(")", "").split(",");
                String code = res[0].split("=")[1].replace("\"","").trim();
                System.out.println(code);
                map.put("code", code);
                l3.add(map);
            } else {
                map = (HashMap<String, String>) l3.get(l3.size() -1);
                String [] values = line.replace("new RestErrorCode(ModuleCode.BUSINESS_CLASSMODEL.getCode()", "")
                        .replace("(","")
                        .replace(")", "")
                        .split(",");

                String key = values[0].trim();
                String value = values[values.length -1].replace("\"","").trim();
                map.put("key", key);
                map.put("value", value);

            }

        }

        for (Map<String, String> su : l3) {
            String b = "export const " + su.get("key") + " = `${preFix}" + su.get("code")+ "`;";
            o3.write(b.getBytes());
            o3.write("\r\n".getBytes());

            String c = "[constants." + su.get("key") + "]: \"" + su.get("value") + "\",";
            o4.write(c.getBytes());
            o4.write("\r\n".getBytes());
        }
        System.out.println(l3);

    }
}
