package com.sda.proxy;

import java.util.concurrent.TimeUnit;

public class RealObject implements ObjectInterface {
    @Override
    public void someHeavyLogic() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
