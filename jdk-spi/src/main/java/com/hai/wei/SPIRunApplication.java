package com.hai.wei;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SPIRunApplication {
    public static void main(String[] args) {
        ServiceLoader<IPayService> load = ServiceLoader.load(IPayService.class);
        Iterator<IPayService> iterator = load.iterator();
        while (iterator.hasNext()) {
            iterator.next().pay("");
        }
    }
}
