class Solution {
    public int minimumOperations(int[] nums) {
        int arr[]=new int[100001];
        int res=0;
        int n=nums.length;
        int evenmaxp=-1, evenmax= 0, evensecmaxp=-1, evensecmax=0;
        int oddmaxp=-1, oddmax= 0, oddsecmaxp=-1, oddsecmax= 0;
        for(int i=0;i<n;i=i+2)
        {
            arr[nums[i]]++;
            if(arr[nums[i]]>evenmax)
            {
                if(evensecmax<evenmax && evenmaxp!=nums[i])
                {
                    evensecmax=evenmax;
                    evensecmaxp=evenmaxp;
                }
                evenmax=arr[nums[i]];
                evenmaxp= nums[i];
            }
            else if(arr[nums[i]]>evensecmax)
            {
                    evensecmax=arr[nums[i]];
                    evensecmaxp=nums[i];
            }
        }
        Arrays.fill(arr,0);
        for(int i=1;i<n;i=i+2)
        {
            arr[nums[i]]++;
            if(arr[nums[i]]>oddmax)
            {
                if(oddsecmax<oddmax && oddmaxp!=nums[i])
                {
                    oddsecmax=oddmax;
                    oddsecmaxp=oddmaxp;
                }
                oddmax=arr[nums[i]];
                oddmaxp= nums[i];
            }
             else if(arr[nums[i]]>oddsecmax)
            {
                    oddsecmax=arr[nums[i]];
                    oddsecmaxp=nums[i];
            }
        }
        if(evenmaxp!=oddmaxp)
        {
            res=(n+1)/2-evenmax;
            res+=n/2-oddmax;
            return res;
        }
        
        else
        {
            int temp=(n+1)/2-evenmax;
            temp+=n/2-oddsecmax;
            res=(n+1)/2-evensecmax;
            res+=n/2-oddmax;
            return Math.min(temp,res);
            
        }
        
    }
}
