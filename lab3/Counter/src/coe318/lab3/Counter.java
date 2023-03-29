package coe318.lab3;
public class Counter {
    public int modulo;
    public  Counter aleft;
    public int adigit = 0;
    public int count = 0;
    
    public Counter(int modulus, Counter left) {
        modulo= modulus;
        aleft = left;
    }

    public int getModulus() {
        return modulo;
    }

    public Counter getLeft() {
        return aleft;
    }

    public int getDigit() {
        return adigit;
    }

    public void setDigit(int digit) {
        this.adigit= digit;       
    }

    public void increment() {
        this.count += 1;
        this.adigit += 1;
        
        if (aleft==null){
        if (getDigit() == getModulus())
            this.count=0;
        }
        else if (getDigit() == getModulus()){
            setDigit(0);
            aleft.adigit += 1;
        }
    }

    public int getCount() {
        return count; 
    }

    @Override
    public String toString() {
        return "" + getCount();
    }

}