// User function Template for C++

/*
struct Complex
{
    int real;
    int img;
};
*/

Complex add(Complex c1, Complex c2) {

    // code here
        return {
        c1.real + c2.real,
        c1.img + c2.img
    };
}