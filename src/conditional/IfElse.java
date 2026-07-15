package conditional;



public class IfElse {
    public static void main(String[] args) {

        int salary = 20000 ;
//        if(salary > 10000){
//             salary = salary + 2000;
//
//        }else {
//            salary = salary + 1000;
//        }

        if(salary > 20000){
            salary = salary + 2000;
        } else if(salary > 10000){
            salary = salary +1000;
        } else {
            salary = salary + 500;
        }
        System.out.println(salary);
    }
}
