class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double s=0; double avg;
        for(int i=1;i<salary.length-1;i++)
        {
            s=s+salary[i];
        }
            avg=s/(salary.length-2);
        return avg;
    }
}
