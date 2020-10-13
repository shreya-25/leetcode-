class ParkingSystem {
    int big1=0,medium1=0,small1=0;
    public ParkingSystem(int big, int medium, int small) {
     big1=  big;
        medium1=medium;
        small1=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1)
        {
            if(big1>=1)
            {
                big1--;
                return true;
            }
            return false;
        }
        else if(carType==2)
        {
            if(medium1>=1)
            {
                medium1--;
                return true;
            }
            return false;
        }
        else
        {
            if(small1>=1)
            {
                small1--;
                return true;
            }
            return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
