/*struct area
{
    int sd;
    int len, wid;
}*/
void find_area(int side, int le, int wd) {
    area a;

    // assign value to side of square
    a.sd = side;

    // assign values to length and breadth of rectangle
    a.len = le;
    a.wid = wd;

    // computing area of square
    int square_area = a.sd * a.sd;

    // computing area of rectangle
    int rect_area = a.len * a.wid;

    cout << square_area << " " << rect_area;
}