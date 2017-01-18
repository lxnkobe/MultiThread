package com.oliver.thrift;

import org.apache.thrift.TException;

/**
 * Created by oliver on 2016/12/26.
 */
public class MultiplicationHandler implements MultiplicationService.Iface {

    @Override
    public int multiply(int n1, int n2) throws TException {
        System.out.println("Multiply(" + n1 + "," + n2 + ")");
        return n1 * n2;
    }


}