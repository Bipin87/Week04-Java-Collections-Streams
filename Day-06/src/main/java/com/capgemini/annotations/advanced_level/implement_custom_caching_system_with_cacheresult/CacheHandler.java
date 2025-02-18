package com.capgemini.annotations.advanced_level.implement_custom_caching_system_with_cacheresult;

import java.util.HashMap;
import java.util.Map;

class CacheHandler {
    private static final Map<String, Object> cache = new HashMap<>();
    
    public static Object getCachedResult(String key) {
        return cache.get(key);
    }
    
    public static void storeResult(String key, Object result) {
        cache.put(key, result);
    }
}