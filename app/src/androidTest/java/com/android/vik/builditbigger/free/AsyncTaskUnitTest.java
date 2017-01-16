package com.android.vik.builditbigger.free;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskUnitTest {

    @Test
    public void asyncTest() {
        try {
            final EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();

            new Runnable(){
                public void run(){
                    endpointsAsyncTask.execute(new MainActivity());
                }
            };
            String result = endpointsAsyncTask.get(30, TimeUnit.SECONDS);

            Assert.assertTrue(result.length() > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

}
