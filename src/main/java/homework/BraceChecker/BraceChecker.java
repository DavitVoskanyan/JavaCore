package homework.BraceChecker;

public class BraceChecker {
    //գրել ծրագիր որը կստուգի տեքստի մեջ պակագծերի դասավորությունը։
    //Փակագծերի տեսակներն են։{,[,(
    private String text;
   final Stack1  stack = new Stack1();
   final Stack1  For = new Stack1();
    //կլասսի կոնստուկտորն է, որը պետք է ընդունի string տիպի տեքստ և վերագրի վերևի տեքստին։
    //Որ չկարողանանք BraceChecker-ի ոբյեկտը սարքենք առանց text տալու կոնստրուկտորի միջոցով։
    public BraceChecker(String text) {
        this.text = text;

    }

    //սահիմնական մետոդն է, որի մեջ գռելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե Stack  հետ թեվեռևի  text-ի հետ։


    public void check() {

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char end;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    end = (char) stack.pop();
                    if (end == 0) {
                        System.err.println("Error opened:" + "but not closed" + c + "at" + i);
                    } else if (end != '(') {
                        System.err.println("Error opened:" + end + "but closed" + c + "at" + i);
                    }
                    break;
                case '}':
                    end = (char) stack.pop();
                    if (end == 0) {
                        System.err.println("Error opened:" + "but not closed" + c + "at" + i);
                    } else if (end != '{') {
                        System.err.println("Error opened:" + end + "but closed" + c + "at" + i);
                    }
                    break;
                case ']':
                    end = (char) stack.pop();
                    if (end == 0) {
                        System.err.println("Error opened:" + "but not closed" + c + "at" + i);
                    } else if (end != '[') {
                        System.err.println("Error opened:" + end + "but closed" + c + "at" + i);
                    }
                    break;

                default:
            }
        }
        char end;
        while ((end = (char) stack.pop()) != 0) {
            System.err.println("Error opened: " + end + "but not closed");

        }
    }
}
