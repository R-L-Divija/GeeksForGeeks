// User function Template for C++

void fizzBuzz(int number) {
    // Write your code here.
     if(number %3 == 0 && number %5 == 0){
        cout<<"FizzBuzz"<<endl;
        return;
    }
    else if(number % 3 == 0){
        cout<<"Fizz"<<endl;
        return;
    }
    else if(number % 5 == 0){
        cout<<"Buzz"<<endl;
        return;
    }
    else {
        cout<<number<<endl;
        return;
    }
}