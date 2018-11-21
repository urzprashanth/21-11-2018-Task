public class Mainclass {
    public static void main(String[] args) {
        Task task = Task.valueOf(args[0]);

        switch (task){
            case MONDAY:
                System.out.println(Task.MONDAY.num);
                System.out.println(Task.MONDAY.feel);
                break;
            case TUESDAY:
                System.out.println(Task.TUESDAY.num);
                System.out.println(Task.TUESDAY.feel);
                break;
            case WEDNESDAY:
                System.out.println(Task.WEDNESDAY.num);
                System.out.println(Task.WEDNESDAY.feel);
                break;
            case THURSDAY:
                System.out.println(Task.THURSDAY.num);
                System.out.println(Task.THURSDAY.feel);
                break;
            case FRIDAY:
                System.out.println(Task.FRIDAY.num);
                System.out.println(Task.FRIDAY.feel);
                break;
            case SATURDAY:
                System.out.println(Task.SATURDAY.num);
                System.out.println(Task.SATURDAY.feel);
                break;
            case SUNDAY:
                System.out.println(Task.SUNDAY.num);
                System.out.println(Task.SUNDAY.feel);
                break;
        }
    }
}
