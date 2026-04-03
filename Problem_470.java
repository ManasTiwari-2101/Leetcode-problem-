// The rand7() API is already defined for you.
// int rand7();
// @return a random integer in the range 1 to 7

int rand10() {
    while(1){
        int n= (rand7()-1)*7+rand7();
        if(n<=40){
            return (n-1)%10+1;
        }
    }
}
// Math.round(Math.random()*7+1) 
// rand7()-1*7 -> [0-6]
// +rand7() -> [0-7]
// (rand7()-1)*7+rand7(); -> [0-49]
// (n-1)%10+1; -> this will generate 1-10 numbers n-1 is done to make range 0-9 then +1 will make it 1-10
