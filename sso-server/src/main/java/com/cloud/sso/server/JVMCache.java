package com.cloud.sso.server;

import java.util.concurrent.ConcurrentHashMap;

public class JVMCache {

    public static ConcurrentHashMap<String, String> TICKET_AND_NAME = new ConcurrentHashMap<String, String>();
}