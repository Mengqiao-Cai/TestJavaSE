package com.cmq.test05;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: cmq
 * @date: 9/12/2024 - 09 - 12 - 5:30 PM
 * @version: 1.0
 */
public class TestRandomNum implements Callable<Integer> {
    //you can implement callable without generic type -> return type will be object
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }
}

class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestRandomNum trn = new TestRandomNum();
        FutureTask ft = new FutureTask(trn);
        Thread t = new Thread(ft);
        t.start();

        //get the return
        Object obj = ft.get();
        System.out.println(obj);
    }
}
