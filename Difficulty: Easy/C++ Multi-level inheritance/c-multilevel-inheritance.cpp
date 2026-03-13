class test : public student {
    // Add set_marks() method here.
protected:
    float Subject[5];
public:
    void set_marks(float marks[]){
        for(int i=0;i<5;++i)
            Subject[i]=marks[i];
    }
};

class result : public test {
    // Add display() method here.
public:
    void display(){
        float total_marks=0;
        for(int i=0;i<5;++i)
            total_marks+=Subject[i];
        float avarage=total_marks/5.0;
        cout<<roll_number<<" "<<total_marks<<" "<<avarage<<endl;
    }
};