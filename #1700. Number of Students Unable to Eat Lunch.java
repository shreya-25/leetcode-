class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int map[]=new int[2];
        for(int i:students)
            map[i]++;
        for(int i=0;i<sandwiches.length;i++)
        {
            if(map[sandwiches[i]]==0)
                return(sandwiches.length-i);
            map[sandwiches[i]]--;
        }
        return 0;
    }
}
