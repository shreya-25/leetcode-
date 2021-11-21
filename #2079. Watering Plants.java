class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=1;
        int left=capacity-plants[0];
        for(int i=1;i<plants.length;i++)
        {
            if(left>=plants[i])
            {
                left=left-plants[i];
                steps++;
                
            }
            else
            {
                steps+= 2*(i);
                steps++;
                left=capacity-plants[i];
            }
        }
        return steps;
    }
}
