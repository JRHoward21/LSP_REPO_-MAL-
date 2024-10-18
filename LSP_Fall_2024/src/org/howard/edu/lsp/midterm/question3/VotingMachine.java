package org.howard.edu.lsp.midterm.question3;

/* 
 Designing an electronic voting machine is a challenging task. You are asked to implement a very simplified voting machine class with the following specification. 

Task:
A voting machine has a list of candidates and the following methods:
a) void addCandidate(String name)	/* Add a candidate with the name to the list */
//b) void castVote(String name) 	/* Cast a vote to the candidate with the name */ 
//c) String toString() 		/* Print out the number of votes each candidate has
//                                                                received. The order does not matter */ 

//Assume that only two attributes of a candidate, namely, the name and number of votes, are of interest here, and the size of the candidate list is unknown in advance.  The key to this problem is choosing the right data structure.

//VotingMachine vm = new VotingMachine();
//vm.addCandidate(“Alsobrooks”);
//vm.castVote(“Alsobrooks”);
//vm.addCandidate(“Hogan”);
//System.out.println(vm.toString()); /* prints out candidate and number of votes … your choice of format */
 
import java.util.HashMap;

class VotingMachine {
    private HashMap<String, Integer> candidates = new HashMap<>();

    public void addCandidate(String name) {
        candidates.put(name, 0);
    }

    public void castVote(String name) {
        candidates.put(name, candidates.getOrDefault(name, 0) + 1);
    }

    public String toString() {
        return candidates.toString();
    }

    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        System.out.println(vm.toString());
    }
}
