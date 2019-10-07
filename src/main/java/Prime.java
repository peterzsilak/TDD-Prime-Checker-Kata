public class Prime {

    public boolean isThisNumberPrime(int number) {
        if(number <= 1) { return false; }
        for(int i = 2; i < number; i++){
            if( number % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
