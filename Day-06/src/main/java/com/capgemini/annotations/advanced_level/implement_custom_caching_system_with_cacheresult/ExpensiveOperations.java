package com.capgemini.annotations.advanced_level.implement_custom_caching_system_with_cacheresult;

class ExpensiveOperations {
    @CacheResult
    public int computeSquare(int number) {
        String key = "square:" + number;
        Object cached = CacheHandler.getCachedResult(key);
        if (cached != null) {
            System.out.println("Returning cached result for: " + number);
            return (int) cached;
        }
        
        System.out.println("Computing square for: " + number);
        int result = number * number;
        CacheHandler.storeResult(key, result);
        return result;
    }
}