public enum Task {

    MONDAY(1,"i hate mondays"),TUESDAY(2,"its bad day"),WEDNESDAY(3,"waste of time"),
    THURSDAY(4,"waiting for weekend"),FRIDAY(5,"last work day in a week"),SATURDAY(6,"hurre its weekend"),
    SUNDAY(7,"enjoying");

    int num;
    String feel;

    Task(int num , String feel){
        this.num = num;
        this.feel = feel;
    }
}
