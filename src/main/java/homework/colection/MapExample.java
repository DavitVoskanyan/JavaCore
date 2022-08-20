package homework.colection;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        removeFromMap(new HashMap<>());
          createFootballTeam(new ArrayList<>());
         printAllMembers(new LinkedHashMap<>());
         printAllMemberNames(new HashMap<>());
    }


    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {


        Map<Integer, String> createFootballTeam = new HashMap<>();
        createFootballTeam.put(10, "Aram");
        createFootballTeam.put(11, "Karen");
        createFootballTeam.put(12, "Zaven");
        for (Map.Entry<Integer, String> entry : createFootballTeam.entrySet()) {
            if (members.equals(createFootballTeam)) {

            }
            System.out.println(createFootballTeam);

        }
        return null;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    public static boolean removeFromMap(Map<Integer, String> memberMap) {
        Map<Integer, String> member = new HashMap<>();
        member.put(77, "Aram");
        System.out.println(member.remove(77, "Aram"));
        return false;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        memberMap.put(10, "Aram");
        memberMap.put(11, "Karen");
        memberMap.put(12, "Zaven");
        Set<Map.Entry<Integer, String>> entries = memberMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getValue());

        }
    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    //11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        Map<Integer, String> member = new LinkedHashMap<>();
        member.put(11, "Aram Aramyan");
        member.put(12, "Karen Aleksanyan");
        member.put(13, "Zaven Xachatryan");
        Set<Map.Entry<Integer, String>> entries = member.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

