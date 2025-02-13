package com.capgemini.map_interface.desin_voting_system;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {
    private Map<String, Integer> voteCount = new HashMap<>();
    private Map<String, Integer> orderedVotes = new LinkedHashMap<>();
    private Map<String, Integer> sortedVotes = new TreeMap<>();

    // Method to cast a vote for a candidate
    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, orderedVotes.getOrDefault(candidate, 0) + 1);
        sortedVotes.put(candidate, sortedVotes.getOrDefault(candidate, 0) + 1);
    }

    // Retrieve votes stored in HashMap
    public Map<String, Integer> getVotes() {
        return voteCount;
    }

    // Retrieve votes in the order they were cast
    public Map<String, Integer> getOrderedVotes() {
        return orderedVotes;
    }

    // Retrieve votes sorted by candidate name
    public Map<String, Integer> getSortedVotes() {
        return sortedVotes;
    }
}
