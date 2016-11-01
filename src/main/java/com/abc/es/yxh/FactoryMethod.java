package com.abc.es.yxh;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project: effective-java
 * User: yuexinghu
 * Date: 16/11/1 09:33
 * Description:
 */
public class FactoryMethod {

    public static boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    public static <K, V> HashMap<K, V> newInstance() {
        return new HashMap<K, V>();
    }

    public static void main(String[] args) {
        System.out.println(valueOf(true));
        Map<String, List<String>> m = FactoryMethod.newInstance();
        System.out.println(m);
        Map<String, List<String>> map = Collections.emptyMap();
    }


}
