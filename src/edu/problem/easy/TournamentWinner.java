package edu.problem.easy;


import java.util.*;

/**
 * Tournament winner
 * There is an algorithms tournament taking place in which teams of programmers compete against each other to solve algorithmic problems as fast as possible. teams compete in round Robin where each team faces of against all other teams. Only 2 teams compete against each other at a time, and for each competition one team designated the home team, while other team is the away team. In each competition there is always one winner and one loser. There is no tie. A team receives 3 points in it wins and 0 point if it losses. Winner of the tournament with the team that receive the most amount of points.
 *
 * Given an array of pair representing the teams that have competed against each other and an array containing the result of each competition, right of function that returns the winner of the tournament. The input array are named “competition” and “results”. The competition are has element in form of [home team, away team], Where each team is string most 30 character representing the name of the team. The result array contains information about winner of each corresponding competition in the competition array specifically result[i] denotes give winner of competition[i]. Where 1 in result array mean stack home team and corresponding competition won and 0 means the away team won.
 *
 * it guarantee that exactly one team will win the tournament and each team will come against each other exactly once it's also guaranteed the tournament will always have at least 2 teams.
 *
 * Sample input
 * Competition =[
 * 	[“HTML”,”C#”],
 * [“C#”,”Python”],
 * [“Python”,”HTML”]
 * ]
 * Result =[0,0,1]
 *
 * Output = Python
 *
 *
 */

public class TournamentWinner {

    public static void main(String[] args) {


        ArrayList<String> match1 = new ArrayList<>();
        match1.add("HtML");
        match1.add("C#");

        ArrayList<String> match2 = new ArrayList<>();
        match2.add("C#");
        match2.add("Python");

        ArrayList<String> match3 = new ArrayList<>();
        match3.add("Python");
        match3.add("HtML");

        ArrayList<ArrayList<String>> competition = new ArrayList<ArrayList<String>>();
        competition.add(match1);
        competition.add(match2);
        competition.add(match3);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);
        result.add(1);

        String winner = tournamentWinner(competition, (ArrayList<Integer>) result);
        System.out.println(winner);

        String winner1 = tournamentWinner1(competition, (ArrayList<Integer>) result);
        System.out.println(winner1);
    }


    /**
     * BEST SOLUTION
     * @param competitions
     * @param results
     * @return
     * Thiis having time o(n) nd space o(K)
     */
    public static String tournamentWinner1(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> data = new HashMap<>();
        data.put("",0);
        String bestTeam = "";

        if(competitions.size() == results.size()){
            String team = "";
            for(int count=0; count < competitions.size(); count++){
                if(results.get(count) == 1)
                    team = competitions.get(count).get(0);
                else
                    team = competitions.get(count).get(1);

                if(data.containsKey(team)){
                    data.put(team, data.get(team)+1);
                }
                else {
                    data.put(team, 1);
                }

                if(data.get(bestTeam) < data.get(team)){
                    bestTeam = team;
                }
            }
        }
        return bestTeam;
    }


    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> data = new HashMap<>();
        String teamName = "";

        if(competitions.size() == results.size()){
            String team = "";
            for(int count=0; count < competitions.size(); count++){
                if(results.get(count) == 1)
                    team = competitions.get(count).get(0);
                else
                    team = competitions.get(count).get(1);

                if(data.containsKey(team))
                    data.put(team, data.get(team)+1);
                else
                    data.put(team, 1);
            }

            int largeNUmber = 0;
            for (Map.Entry<String,Integer> entry : data.entrySet()){
                if(entry.getValue() > largeNUmber){
                    largeNUmber = entry.getValue();
                    teamName = entry.getKey();
                }
            }

        }
        return teamName;
    }

}
