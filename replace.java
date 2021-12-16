public class replace {
    public static void main(String[] args){
        String name = "Elyas Mohammed Fatani";
        for(int index = 0; index < name.charAt(index); index++){
            if(name.charAt(index) == 'e' || name.charAt(index) == 'a' || name.charAt(index) == 'm' ){
                System.out.print('_');
            }else{
                System.out.print(name.charAt(index));
            }


        }
