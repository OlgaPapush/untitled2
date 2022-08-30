public class Main {
    public static void main(String[] args)   {

        // задание 1

            for ( int i = 0 ; i < 10 ;  i ++) {
        System.out.println ( "Итерация цикла " + i ) ;
         }
       int start = 10;
            while ( start > 0) {
                System.out.println ( start );
                start -- ;
            }

            // задание 2
        for ( int i=1 ; i < 31 ; i = i + 5 ) {
            System.out.println ( " Сегодня пятница! Необходимо подготовить отчет" + i ) ;
        }
    }
}