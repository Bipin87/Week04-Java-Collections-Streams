package com.capgemini.map_interface.desin_voting_system;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Cast sample votes
        votingSystem.castVote("Aman");
        votingSystem.castVote("BK Sahu");
        votingSystem.castVote("Aryan");
        votingSystem.castVote("Deepraj");
        votingSystem.castVote("Bahadur");
        votingSystem.castVote("Aman");

        // Display vote counts
        System.out.println("Vote Counts (HashMap): " + votingSystem.getVotes());
        System.out.println("Ordered Votes (LinkedHashMap): " + votingSystem.getOrderedVotes());
        System.out.println("Sorted Votes (TreeMap): " + votingSystem.getSortedVotes());
    }
}
