class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int old=image[sr][sc];
        int visited[][]=new int[image.length][image[0].length];
        fill(image,visited,sr,sc,newColor,old);
        return image;
    }
    public void fill(int[][]image,int[][]visited,int sr,int sc,int newcolor,int old)
    {
        if((sr>=0 && sr<image.length)&&(sc>=0 && sc<image[0].length))
        {
            if(image[sr][sc]==old &&  visited[sr][sc]==0 )
            {
                visited[sr][sc]=1;
                image[sr][sc]=newcolor;
                if(sr-1>=0 && sr-1<image.length)
                    fill(image,visited,sr-1,sc,newcolor,old);
                if(sr+1>=0 && sr+1<image.length)
                    fill(image,visited,sr+1,sc,newcolor,old);
                if(sc-1>=0 && sc-1<image[0].length)
                    fill(image,visited,sr,sc-1,newcolor,old);
                if(sc+1>=0 && sc+1<image[0].length)
                    fill(image,visited,sr,sc+1,newcolor,old);
            }
        }
    }
}
